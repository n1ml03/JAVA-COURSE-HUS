package com.bridge.pseudocode;

import com.bridge.pseudocode.devices.Device;
import com.bridge.pseudocode.devices.Radio;
import com.bridge.pseudocode.devices.Tv;
import com.bridge.pseudocode.remotes.AdvancedRemote;
import com.bridge.pseudocode.remotes.BasicRemote;

public class App {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
