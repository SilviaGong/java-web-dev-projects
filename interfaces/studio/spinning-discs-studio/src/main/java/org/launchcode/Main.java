package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("Music CD", 700, "Music Tracks", "CD-R", 300,400);
        DVD dvd = new DVD("Movie DVD", 4700, "Movie Content", "DVD-R", 570,1600);

        cd.spinDisc();
        dvd.spinDisc();

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}