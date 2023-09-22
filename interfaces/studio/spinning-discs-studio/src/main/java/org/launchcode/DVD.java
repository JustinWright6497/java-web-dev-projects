package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.
    @Override
    public void writeData(){
        System.out.println(this.name + " disc is writing at 120 megabytes per second.");
    }
    @Override
    public void readData(){
        System.out.println(this.name + " disc is reading at 120 megabytes per second.");
    }
    @Override
    public void spinDisc(){
        System.out.println(this.name + " spins at a rate of 570 - 1600 rpm.");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String name, int capacity, String discType, String contents) {
        super(name, capacity, discType, contents);
    }
}