package org.launchcode;

public class CD extends BaseDisc {
    // TODO: Implement your custom interface.


    public CD(String name, int capacity, String contents, String discType, int minRotationSpeed, int maxRotationSpeed) {
        super(name, capacity, contents, discType, minRotationSpeed, maxRotationSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + minRotationSpeed+"-"+maxRotationSpeed + " rpm.");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
