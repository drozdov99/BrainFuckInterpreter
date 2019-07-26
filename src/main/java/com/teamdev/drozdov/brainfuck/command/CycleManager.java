package com.teamdev.drozdov.brainfuck.command;

import com.teamdev.drozdov.brainfuck.Context;

public class CycleManager implements Command{

    private boolean forward;
    private int cycleDestinetion = -1;


    public CycleManager(boolean forward){
        this.forward = forward;
    }

    private int getCycleDestination(int commandPointer, Context context) {
        int counter = getCycleCount();
        while (counter != 0) {
            Command command = context.getCommands().get(commandPointer + (forward ? 0 : -2));
            counter += command.getCycleCount();
            commandPointer += forward ? 1 : -1;
        }
        return commandPointer;
    }

    public boolean isForward() {
        return forward;
    }


    @Override
    public void execute(Context context) {
        if ((forward && context.getData()[context.getCurrentCell()] == 0) || !forward && context.getData()[context.getCurrentCell()] != 0) {
            if (cycleDestinetion == -1) {
                int commandPointer = context.getCommandPointer();
                cycleDestinetion =  getCycleDestination(commandPointer, context);
            }
            context.setCommandPointer(cycleDestinetion);
        }
    }
    @Override
    public int getCycleCount () {
        if (forward) return 1;
        else return -1;
    }
}

