package com.teamdev.drozdov.brainfuck.command;

import com.teamdev.drozdov.brainfuck.Context;

public class DecreaseData implements Command {
    @Override
    public void execute(Context context) {
        context.decrementData();
    }

    @Override
    public int getCycleCount() {
        return 0;
    }
}
