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
