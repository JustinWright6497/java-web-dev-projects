package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc{
    // TODO: Implement your custom interface.
    @Override
    public void writeData(){
        System.out.println(this.name + " disc is writing at 420 kilobytes per second.");
    }
    @Override
    public void readData(){
        System.out.println(this.name + " disc is reading at 420 kilobytes per second.");
    }
    @Override
    public void spinDisc(){
        System.out.println(this.name + " spins at a rate of 200 - 500 rpm.");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public CD(String name, int capacity, String discType, String contents) {
        super(name, capacity, discType, contents);
    }
}