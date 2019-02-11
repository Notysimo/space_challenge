package com.minios;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        final int phase1 = 1;
        final int phase2 = 2;

        long u1Cost;
        long u2Cost;
        double phase1Rockets;
        double phase2Rockets;

        ArrayList<Item> phase1Item;
        ArrayList<Item> phase2Item;

        Simulation simulation = new Simulation();

        System.out.println("LOADING....................");
        phase1Item = simulation.loadItems(phase1);
        phase2Item = simulation.loadItems(phase2);

        System.out.println("STARTING SIMULATION FOR ROCKET U1...\n");
        System.out.println("=====Simulating Phase 1=====Simulating Phase 1=====Simulating Phase 1=====");
        simulation.runSimulation(simulation.loadU1(phase1Item), 1);
        System.out.println("=====Simulation Done=====Simulation Done=====Simulation Done=====\n");
        phase1Rockets = U1.getRocketU1Counter();
        System.out.println("Rockets used for phase 1: " + phase1Rockets);

        System.out.println("=====Simulating Phase 2=====Simulating Phase 2=====Simulating Phase 2=====");
        simulation.runSimulation(simulation.loadU1(phase2Item), 1);
        System.out.println("=====Simulation Done=====Simulation Done=====Simulation Done=====\n");
        phase2Rockets = U1.getRocketU1Counter() - phase1Rockets;
        System.out.println("Rockets used for phase 2: " + phase2Rockets + "\n");
    }
}
