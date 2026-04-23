# Design Patterns Java Examples

This repository demonstrates classical object-oriented design patterns grouped in:

- `Creational` patterns
- `Structural` patterns
- `Behavioural` patterns

Each section now includes:
- pattern definition
- ideal code structure and class relationships
- repository implementation details

---

## 1. Creational Patterns

Creational patterns control object creation, making software resilient to direct dependencies and configuration changes.

### 1.1 Singleton

Definition:
- Ensures one and only one instance of a class exists.
- Provides a global point of access (often static method `getInstance()`).

Ideal Structure:
1. `class Singleton` with private constructor.
2. `private static Singleton instance` field.
3. `public static synchronized Singleton getInstance()` returns existing instance or creates.

Pseudo:
```
public class Singleton {
  private static Singleton instance;
  private Singleton() {}
  public static synchronized Singleton getInstance() {
    if (instance == null) instance = new Singleton();
    return instance;
  }
  public void doWork() {}
}
```

Implementation details:
- `MySingleton.java`: implements Bill Pugh Singleton pattern for thread-safety without synchronization overhead. Includes commented alternatives (synchronized method, double-checked locking).
- `Driver.java`: calls `MySingleton.getInstance()` multiple times and verifies object identity.

This pattern demonstrates a centralized shared service object, similar to a logging singleton in applications.

---

### 1.2 Factory (Simple Factory)

Definition:
- Encapsulate object creation behind a factory.
- Clients ask factory for interface, not concrete classes.

Ideal Structure:
1. `Product` interface or abstract class.
2. Concrete product classes implement `Product`.
3. Factory class has a method `createProduct(type)`.

Pseudo:
```
interface Pizza { void prepare(); }
class Margherita implements Pizza { ... }
class Pepperoni implements Pizza { ... }
class PizzaFactory {
  static Pizza createPizza(PizzaType type) {
    switch(type) { ... }
  }
}
```

Implementation details:
- `Pizza.java`: base contract `prepare()` and `getName()`.
- `PizzaType.java`: enum for type decisions.
- `PizzaFactory.java`: modern switch expression for clean, readable type selection.
- Driver: selects a type and prints result.

This pattern demonstrates how a central factory can select and instantiate pizza types at runtime with minimal client modification.

---

### 1.3 Abstract Factory

Definition:
- Creates families of related products without specifying concrete classes.
- Each factory is per family (dominos vs PizzaHut) and produces same product family variants.

Ideal Structure:
1. `AbstractFactory` defines methods like `createChickenPizza()`, `createTomatoPizza()`.
2. Concrete factories implement these for brand-specific variants.
3. Client uses `AbstractFactory` plus `StoreType` route.

Pseudo:
```
interface AbstractPizzaFactory { Pizza createPizza(PizzaType); }
class DominosFactory implements AbstractPizzaFactory { ... }
class PizzaHutFactory implements AbstractPizzaFactory { ... }
```

Implementation details:
- `AbstractPizzaFactory.java`: factory interface, possibly `getPizza(PizzaType)`.
- `AbstractPizzaFactory.java` (client/director) chooses store by `StoreType` and requests pizza.
- `StoreType.java`: enum to pick factory.
- `DominosPizzaFactory` and `PizzaHutPizzaFactory`: returns brand-specific `ChickenPizza`, `OnionPizza`, `TomatoPizza`.

This pattern demonstrates selecting consistent product kinds from different vendors via a unified abstract factory interface.

---

### 1.4 Builder

Definition:
- Constructs complex object step by step.
- Permits immutability and readable code when optional parameters exist.

Ideal Structure:
1. `Product` (e.g., query object) with many fields.
2. `Builder` with setter methods returning `this`.
3. `build()` returns final product.

Pseudo:
```
class Query { ... }
class QueryBuilder {
  QueryBuilder select(String... cols) { ...; return this; }
  QueryBuilder from(String table) { ...; return this; }
  Query build() { return new Query(...); }
}
```

Implementation details:
- `Query.java`: hold final SQL string or query properties.
- `QueryBuilder.java`: methods `select()`, `from()`, `where()`, `groupBy()`, `orderBy()`, `build()`.
- `Driver.java`: demonstrates fluent API with `new QueryBuilder().select(...)...build()`.

This pattern demonstrates building complex SQL queries safely through a fluent builder API.

---

## 2. Structural Patterns

Structural patterns organize class and object composition for maintainable subsystems.

### 2.1 Adapter

Definition:
- Convert one interface to another expected by clients.
- Wrap incompatible class with adapter.

Ideal Structure:
1. Client expects `Target` interface.
2. Available class has `Adaptee` interface.
3. `Adapter` implements `Target`, holds `Adaptee`, translates calls.

Pseudo:
```
interface Payment { void pay(amount); }
class RazorPay { void makePayment(amountInCents); }
class RazorPayAdapter implements Payment {
  RazorPay razor;
  pay(amount) { razor.makePayment(amount*100); }
}
```

Implementation details:
- Legacy path and modern path both show adapter technique.
- `PaymentProcessor` uses `AdapterPayment` interchangeably with underlying gateway impl.
- `Driver` demonstrates both Stripe and RazorPay through common interface.

This pattern demonstrates integrating multiple payment providers with one adapter interface, avoiding business logic changes.

---

### 2.2 Decorator

Definition:
- Attach responsibilities to objects at runtime.
- Decorators follow same interface as base component.

Ideal Structure:
1. `Component` interface (`Burger`).
2. Concrete `Component` (`VegBurger`, `ChickenBurger`).
3. Abstract decorator class (`BurgerDecorator`) implements component and holds `Component`.
4. Concrete decorators (`ExtraCheese`, `ExtraPatty`) add behavior.

Pseudo:
```
Burger burger = new ExtraCheese(new ExtraPatty(new VegBurger()));
burger.describe();
```

Implementation details:
- Base ingredients and price are extended in decorators using composition.
- Output includes accumulated price and features.
- `Driver` demonstrates chaining multiple decorators.

This pattern demonstrates extending orders dynamically with decorators so new combinations do not require subclass explosion.

---

### 2.3 Facade

Definition:
- Provide simplified interface over complex subsystem.
- Clients call one entrypoint, not multiple subsystem methods.

Ideal Structure:
1. Subsystem classes (`VegMenu`, `NonVegMenu`, `JuiceMenu`) with detailed methods.
2. `MenuManager` facade aggregates and hides complexity.
3. Client calls `MenuManager.showMenu()`.

Implementation details:
- Menu facade: `src/Structural/Facade/MenuLists/MenuManager.java` has methods like `displayFullMenu()`, `showVeg()`, `showNonVeg()`. Subsystem details are abstracted in `Services/` classes.
- API Gateway facade: `src/Structural/Facade/ApiGateWay/ApiGateWay.java` orchestrates order placement with `UserService`, `OrderService`, `PaymentService`, `NotificationService`, `DeliveryService`.
- Drivers: `MenuLists/Driver.java` uses facade for one-step menus; `ApiGateWay/Driver.java` demonstrates simplified order placement.

This pattern demonstrates simplifying menu access via a facade to shield frontend from subsystem complexity, and also shows an API gateway facade for payment and order processing.

---

## 3. Behavioural Patterns

Behavioural patterns manage algorithms and object interactions.

### 3.1 Strategy

Definition:
- Define interchangeable algorithms via strategy interface.
- Context uses strategy by composition.

Ideal Structure:
1. `Strategy` interface with `execute()`.
2. Concrete strategies implement variant algorithms.
3. `Context` holds Strategy and calls `strategy.execute()`.

Pseudo:
```
class PaymentContext { setStrategy(PaymentStrategy s); pay(amount) { s.pay(amount); }}
```

Implementation details:
- `PaymentStrategy` interface with `pay(int amount)`.
- Implementations: `CreditCardPayment`, `PaypalPayment`, `UpiPayment`.
- `PaymentContext` is configured at runtime with selected strategy.
- `Driver` shows switching at runtime.

This pattern demonstrates dynamic strategy selection for payment methods, centralizing choice in the context.

---

### 3.2 Observer

Definition:
- One subject notifies many observers on state changes.
- Observers subscribe/unsubscribe from subject.

Ideal Structure:
1. `Subject` interface holds observers and notifies.
2. `ConcreteSubject` tracks state and notifies changes.
3. `Observer` interface defines `update()`.
4. `ConcreteObservers` react to updates.

Pseudo:
```
subject.attach(new ScoreObserver());
subject.setEvent(event);
subject.notifyObservers();
```

Implementation details:
- `BowlingEvent` stores match state (runs, wicket, overs).
- `ScoreBoard` (subject) sets events and triggers `update()` on observer list.
- `OverObserver`, `ScoreObserver`, `WicketObserver` display slices.
- `Driver` simulates event push and observer update with cricket scoring events.

This pattern demonstrates a subject notifying multiple observers for real-time score updates.

---

### 3.3 State

Definition:
- Allows an object to **change its behavior when its internal state changes**.
- Encapsulates state-specific behavior into separate classes (states), and the context delegates requests to the current state.

Ideal Structure:
1. `Context` (e.g., `VendingMachine`) holds a reference to a `State`.
2. `State` interface defines operations (e.g., `selectItem()`, `insertMoney()`, `dispense()`, `cancel()`).
3. Concrete state classes implement the operations and can transition the context to another state.

Repository Implementation details:
- `src/Behavioural/State/VendingMachine.java`: context that delegates actions to `MachineState`.
- `src/Behavioural/State/VendingMachineStates/MachineState.java`: state interface.
- Concrete states:
  - `IdleState` → initial state
  - `SelectedState` → after item selection
  - `PaymentDoneState` → after payment
- Transitions happen *inside state classes* using `machine.setState(new NextState())`.

Sample flow (from `src/Behavioural/State/Driver.java`):
```java
package Behavioural.State;

public class Driver {

    public static void main(String[] args){
        System.out.println("\n Vending Machine using State Pattern \n");

        VendingMachine machine = new VendingMachine();

        // invalid operations in Idle
        machine.insertMoney();
        machine.dispense();
        System.out.println("--------------------------");

        // select -> pay -> dispense
        machine.selectItem();
        machine.insertMoney();
        machine.dispense();
        System.out.println("--------------------------------");

        // cancel flow
        machine.selectItem();
        machine.cancel();
    }
}
```

Sample output:
```
Vending Machine using State Pattern

Select Item First
No Item Selected
--------------------------
Item Selected
Amount has been Paid
Item is ready to dispense
--------------------------------
Item Selected
Product cancelled
```

This pattern demonstrates how conditional logic like `if(state==...)` can be replaced with polymorphism and state-driven transitions.

---

## 4. How to run

1. Navigate to repository root:
   ```bash
   cd /home/prakashkalari/Documents/ME/java/DesignPatterns
   ```
2. Compile all sources:
   ```bash
   rm -rf out && mkdir -p out
   javac -d out $(find src -name '*.java')
   ```
3. Run each driver, for example:
   ```bash
   java -cp out Creational.Singleton.Driver
   java -cp out Creational.Factory.Driver
   java -cp out Creational.AbstractFactory.Driver
   java -cp out Creational.Builder.Driver
   
   java -cp out Structural.Adapter.LegacyCode.Driver
   java -cp out Structural.Adapter.PaymentGateway.Driver
   java -cp out Structural.Decorator.Driver
   java -cp out Structural.Facade.MenuLists.Driver
   java -cp out Structural.Facade.ApiGateWay.Driver
   
   java -cp out Behavioural.Observer.Driver
   java -cp out Behavioural.Strategy.GPS.Driver
   java -cp out Behavioural.Strategy.PaymentMode.Driver
   java -cp out Behavioural.State.Driver
   ```

---

## 5. Quick learning path for newbies

1. Start with `Creational/Singleton` for global-object concept.
2. Learn `Factory` to decouple client from concrete types.
3. Compare with `AbstractFactory` for product families.
4. Then `Builder` for complex construction.
5. Move to `Structural` (`Adapter`, `Decorator`, `Facade`) to understand class composition and wrappers.
6. Finish with `Behavioural` (`Strategy`, `Observer`) for runtime behavior change and communication.

---

## 6. Notes

- This set is intentionally limited and easy to read for newcomers.
- Recommended next patterns in same structure: `Command`, `TemplateMethod`, `Composite`, `Proxy`, `Mediator`.
- Reference books: "Head First Design Patterns" and "Design Patterns: Elements of Reusable Object-Oriented Software" (Gamma et al.).
- Code uses modern Java features like switch expressions and Bill Pugh Singleton for best practices.
