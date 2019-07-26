package com.teamdev.drozdov.brainfuck;

import com.teamdev.drozdov.brainfuck.command.Command;
import java.util.List;

public class Context {
    private byte[] data;
    private List<Command> commands;
    private int currentCell;
    private int commandPointer;


    public Context(List<Command> commands) {
        this.commands = commands;
        data = new byte[10];
        currentCell = 0;
        commandPointer = 0;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    public int getCurrentCell() {
        return currentCell;
    }

    public void setCurrentCell(int currentCell) {
        this.currentCell = currentCell;
    }

    public int getCommandPointer() {
        return commandPointer;
    }

    public void setCommandPointer(int commandPointer) {
        this.commandPointer = commandPointer;
    }

    public List<Command> getCommands() {
        return commands;
    }

    public byte[] getData() {
        return data;
    }

    public void addCommand(Command command){
        commands.add(command);
    }

    public void incrementData(){
        data[currentCell]++;
    }

    public void incrementCurrentCell(){
        currentCell++;
    }

    public void decrementData(){
        data[currentCell]--;
    }

    public void decrementCurrentCell(){
        currentCell--;
    }

    public void executeCommand(){
        Command command = commands.get(commandPointer);
        commandPointer++;
        command.execute(this);
    }

    public boolean isTerminated(){
        if(commandPointer<0 || commandPointer>=commands.size())
            return true;
        else
            return false;
    }
}
