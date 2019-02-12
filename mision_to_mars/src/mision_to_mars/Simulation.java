package mision_to_mars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class consists in the simulation for two rockets.
 * This class contains methods creates a simulation
 *
 * @author Andres Uzeda
 * @since February 6, 2019
 * @version 1.0
 */
public class Simulation {

    /**
     * This method returns a list of items in a document
     * path e.g "items_to_load/phase-1.txt"
     * @return a list of items
     */
    public ArrayList<Item> readData(String path){
        try {
            return getAlistItem(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * This method returns a list of items in a rocket
     * @param rocket
     * @param listOfItemsToCarry
     * @return this method returns a list of items loaded in a rocket
     */
    public ArrayList<Item> loadItems(Rocket rocket, ArrayList<Item> listOfItemsToCarry){
        System.out.println("Adding Items to "+ rocket.getClass().getTypeName());
        ArrayList<Item> listOfItemsCarriedInARocket = new ArrayList<>();
        for (Item item: listOfItemsToCarry) {
            if(rocket.canCarry(item)){
                rocket.setWeightCarried(item.getWeight());
                listOfItemsCarriedInARocket.add(item);
            }
        }
        return listOfItemsCarriedInARocket;
    }

    /**
     * This method run simulation for two rockets
     */
    public void runSimulation(){
        //create a rockets
        U1 U1Rocket = new U1();
        U2 U2Rocket = new U2();
        System.out.println("\u001B[1mAdd items to rockets for the phase 1");
        ArrayList<Item> itemsLoadedInARocketU1Phase1 = loadItems(U1Rocket , readData("items_to_load/phase-1.txt"));
        printAListOfItems(itemsLoadedInARocketU1Phase1, U1Rocket.getClass().getName());
        ArrayList<Item> itemsLoadedInARocketU2Phase1 = loadItems(U2Rocket , readData("items_to_load/phase-1.txt"));
        printAListOfItems(itemsLoadedInARocketU2Phase1, U2Rocket.getClass().getName());
        System.out.println("\u001B[1mFirst phase starts");
        phase(U1Rocket);
        phase(U2Rocket);
        System.out.println("\u001B[1mAdd items to rockets for the phase 2");
        ArrayList<Item> itemsLoadedInARocketU1Phase2 = loadItems(U1Rocket , readData("items_to_load/phase-2.txt"));
        printAListOfItems(itemsLoadedInARocketU1Phase2, U1Rocket.getClass().getName());
        ArrayList<Item> itemsLoadedInARocketU2Phase2 = loadItems(U2Rocket , readData("items_to_load/phase-2.txt"));
        printAListOfItems(itemsLoadedInARocketU2Phase2, U2Rocket.getClass().getName());
        System.out.println("\u001B[1mSecond phase starts");
        phase(U1Rocket);
        phase(U2Rocket);
    }

    /**
     * This method do a launching, landing and free the items
     * @param rocket
     */
    private void phase(Rocket rocket){
        rocket.launch();
        rocket.land();
        rocket.setWeightCarried(0);
    }

    /**
     * This method return a list of each line in a document
     * @param path
     * @return list of each line in a document
     * @throws FileNotFoundException
     */
    private ArrayList<String> getAlistItemsFromAFile(String path) throws FileNotFoundException {
        ArrayList<String> listOfStrings = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            listOfStrings.add(line);
        }
        return listOfStrings;
    }

    /**
     * This method return a list of items
     * @param path
     * @return a list of Item
     * @throws FileNotFoundException
     */
    private ArrayList<Item> getAlistItem(String path) throws FileNotFoundException {
        ArrayList<String> ListOfStrings = getAlistItemsFromAFile(path);
        ArrayList<Item> ListItems = new ArrayList<>();
        for (String aString: ListOfStrings
        ) {
            String[] arrayWords = aString.trim().split("=");
            Item item = new Item(arrayWords[0],Integer.valueOf(arrayWords[1]));
            ListItems.add(item);
        }
        return ListItems;
    }

    /**
     * This method print a list of items by console
     */
    private void printAListOfItems(ArrayList<Item> itemList, String rocketName){
        System.out.println("The following items were added to "+rocketName+" Rocket:");
        for (Item item : itemList) {
            System.out.println("Item: "+item.getName() + " Weight: " + item.getWeight());
        }
    }

}
