package Behavioural.State.VendingMachineStates;

import Behavioural.State.VendingMachine;

public class IdleState implements MachineState{
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item Selected");
        machine.setState(new SelectedState());

    }

    @Override
    public void insertMoney(VendingMachine machine) {
        System.out.println("Select Item First");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("No Item Selected");
    }

    @Override
    public void cancel(VendingMachine machine) {
        System.out.println("No item to Cancel");

    }
}
