package org.launchcode;

public interface OpticalDisc {
    void spinDisc();
    void storeData();
    void readDataWithLaser();
    void reportInformation(String name,int capacity,String contents,String discType);
}
