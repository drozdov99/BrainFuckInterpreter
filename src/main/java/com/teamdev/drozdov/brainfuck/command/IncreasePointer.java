package com.teamdev.drozdov.brainfuck.command;

import com.teamdev.drozdov.brainfuck.Context;

public class IncreasePointer implements Command {
    @Override
    public void execute(Context context) {
        context.incrementCurrentCell();
    }

    @Override
    public int getCycleCount() {
        return 0;
    }
}
