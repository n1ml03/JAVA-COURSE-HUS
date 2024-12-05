package com.command.program;

public class TestCommand {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Command shutdown = new ShutDownCommand(computer);
        Command restart = new RestartCommand(computer);

        Switch s = new Switch();

        String str = "shutdown";

        if (str.equals("shutdown")) {
            s.storeAndExecute(shutdown);
        } else {
            s.storeAndExecute(restart);
        }
    }
}
