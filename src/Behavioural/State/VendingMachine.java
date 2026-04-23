package Behavioural.State;

import Behavioural.State.VendingMachineStates.IdleState;
import Behavioural.State.VendingMachineStates.MachineState;

public class VendingMachine {

    private MachineState state;

    public VendingMachine(){
        this.state = new IdleState();
    }

    public void setState(MachineState state){
        this.state = state;
    }

    public void selectItem() {
        state.selectItem(this);

    }

    public void insertMoney() {
        state.insertMoney(this);
    }

    public void dispense() {
        state.dispense(this);
    }


    public void cancel() {
        state.cancel(this);
    }
}
