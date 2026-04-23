package Behavioural.State.VendingMachineStates;

import Behavioural.State.VendingMachine;

public class SelectedState implements MachineState{
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("item Already Selected");
    }

    @Override
    public void insertMoney(VendingMachine machine) {
        System.out.println("Amount has been Paid");
        machine.setState(new PaymentDoneState());
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Payment has to be done first");
    }

    @Override
    public void cancel(VendingMachine machine) {
        System.out.println("Product cancelled");
        machine.setState(new IdleState());
    }
}
