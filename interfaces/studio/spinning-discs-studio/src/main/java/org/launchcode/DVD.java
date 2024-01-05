package org.launchcode;

public class DVD extends BaseDisc{
    // TODO: Implement your custom interface.

    public DVD(String name, int capacity, String contents, String discType, int minRotationSpeed, int maxRotationSpeed) {
        super(name, capacity, contents, discType, minRotationSpeed, maxRotationSpeed);
    }
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + minRotationSpeed+"-"+maxRotationSpeed + " rpm.");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
