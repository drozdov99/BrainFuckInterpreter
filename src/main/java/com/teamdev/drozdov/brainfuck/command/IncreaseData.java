package com.teamdev.drozdov.brainfuck.command;

import com.teamdev.drozdov.brainfuck.Context;

public class IncreaseData implements Command {
    @Override
    public void execute(Context context) {
        context.incrementData();
    }

    @Override
    public int getCycleCount() {
        return 0;
    }
}
