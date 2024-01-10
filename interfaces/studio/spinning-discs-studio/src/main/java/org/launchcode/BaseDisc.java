package org.launchcode;

public abstract class BaseDisc implements OpticalDisc{
    protected String name;
    protected int capacity;
    protected String contents;
    protected String discType;
    protected int minRotationSpeed;
    protected int maxRotationSpeed;

    // Constructors


    public BaseDisc(String name, int capacity, String contents, String discType, int minRotationSpeed, int maxRotationSpeed) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
        this.minRotationSpeed = minRotationSpeed;
        this.maxRotationSpeed = maxRotationSpeed;
    }

    @Override
    public void spinDisc() {
        System.out.println("The disc is spinning.");
    }

    @Override
    public void storeData() {
        System.out.println("Data is being stored on the disc.");
    }

    @Override
    public void readDataWithLaser() {
        System.out.println("Data is being read from the disc using a laser.");
    }

    @Override
    public void reportInformation(String name, int capacity, String contents, String discType) {
        System.out.println("Disc Information: " +
                "Name: " + name +
                ", Capacity: " + capacity +
                ", Contents: " + contents +
                ", Disc Type: " + discType);
    }

}
