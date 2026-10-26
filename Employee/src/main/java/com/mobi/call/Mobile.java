package com.mobi.call;

public class Mobile {

    // Main driver method
    public static void main(String[] args)
    {
        // Manually creating an instance of Jio
        Sim sim = new Jio();

        // Calling methods
        sim.calling();
        sim.data();
    }
}