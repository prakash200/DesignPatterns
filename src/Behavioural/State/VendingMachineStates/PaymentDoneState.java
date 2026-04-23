package Behavioural.State.VendingMachineStates;

import Behavioural.State.VendingMachine;

public class PaymentDoneState implements MachineState{
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Product already Selected");
    }

    @Override
    public void insertMoney(VendingMachine machine) {
        System.out.println("Amount Already Paid");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Item is ready to dispense");
        machine.setState(new IdleState());
    }

    @Override
    public void cancel(VendingMachine machine) {
        System.out.println("Refund Initiated");
        machine.setState(new IdleState());
    }
}
