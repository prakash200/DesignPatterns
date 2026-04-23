package Behavioural.State.VendingMachineStates;

import Behavioural.State.VendingMachine;

public interface MachineState {

    void selectItem(VendingMachine machine);
    void insertMoney(VendingMachine machine);
    void dispense(VendingMachine machine);
    void cancel(VendingMachine machine);
}
