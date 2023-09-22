package org.launchcode;

public abstract class BaseDisc {
    public String name;
    public int capacity;
    public String discType;
    public String contents;

    public BaseDisc(String name, int capacity, String discType, String contents) {
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
        this.contents = contents;
    }

    public abstract void writeData();
    public abstract void readData();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
