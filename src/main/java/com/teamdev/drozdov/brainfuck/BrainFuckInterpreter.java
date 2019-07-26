package com.teamdev.drozdov.brainfuck;

import com.teamdev.drozdov.brainfuck.command.*;

import java.util.ArrayList;
import java.util.List;

public class BrainFuckInterpreter {
    private Context context;

    public Context getContext() {
        return context;
    }

    public BrainFuckInterpreter(String program){
        char[] chars = program.toCharArray();
        List<Command> commands = new ArrayList<Command>();
        for(char c : chars)
        {
            switch (c){
                case '>':
                    commands.add(new IncreasePointer());
                    break;
                case '<':
                    commands.add(new DecreasePointer());
                    break;
                case '+':
                    commands.add(new IncreaseData());
                    break;
                case '-':
                    commands.add(new DecreaseData());
                    break;
                case '[':
                    commands.add(new CycleManager(true));
                    break;
                case ']':
                    commands.add(new CycleManager(false));
            }
        }
        this.context = new Context(commands);
    }

    public byte[] runProgram(){
        while (!context.isTerminated()){
            context.executeCommand();
        }
        return context.getData();
    }

    public static void main(String[] args) {
        BrainFuckInterpreter  brainFuckInterpreter = new BrainFuckInterpreter(">--[+++++++<---->>-->+>+>+<<<<]");
        byte[] data = brainFuckInterpreter.runProgram();
        for (byte b:
                data) {
            System.out.println(b);

        }

    }
}
