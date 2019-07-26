package com.teamdev.drozdov.brainfuck.command;

import com.teamdev.drozdov.brainfuck.Context;

public interface Command {
    void execute(Context context);
    public int getCycleCount();

}
