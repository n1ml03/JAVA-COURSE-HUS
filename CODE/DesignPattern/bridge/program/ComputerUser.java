package com.bridge.program;

public class ComputerUser {
    public static void main(String[] args) {
        Computer myComputer = new PC(new WindowsOs());
        myComputer.startup();
        if (myComputer.canMoveComputer()) {
            System.out.println("Moving computer to a new Location");
        }
        myComputer.browseInternet("https://google.com");
    }
}
