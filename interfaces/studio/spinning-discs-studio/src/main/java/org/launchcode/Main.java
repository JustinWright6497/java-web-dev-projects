package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("Rumors - Fleetwood Mac", 9, "CD", "Alt Rock Music");
        DVD myDvd = new DVD("The Little Mermaid - Disney", 1, "DVD", "Fairytale Music Movie");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myDvd.spinDisc();
    }
}