package com.command.program;

public class RestartCommand implements Command {
    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.restart();
    }
}
