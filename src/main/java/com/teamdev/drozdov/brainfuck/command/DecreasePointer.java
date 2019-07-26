package com.teamdev.drozdov.brainfuck.command;

import com.teamdev.drozdov.brainfuck.Context;

public class DecreasePointer implements Command {
    @Override
    public void execute(Context context) {
        context.decrementCurrentCell();
    }

    @Override
    public int getCycleCount() {
        return 0;
    }
}
