package transport;

import java.util.*;

public class Main {
  
  public static ArrayList<AbstractVehicle> filteredList = new ArrayList<AbstractVehicle>();

  public static void printVehicles(ArrayList<AbstractVehicle> vehicles, CheckVehicle tester) {

    filteredList.clear();
    for (AbstractVehicle v: vehicles) {
      
      if (tester.test(v)) {
        System.out.println(v.getName() + " " + v.getFuelLevel());
        filteredList.add(v);
      }
    }
  }

  public static void main(String[] args) {

    Horse seabiscut = new Horse("Seabiscut");
    Horse affirmed = new Horse("Affirmed");
    Horse joe = new Horse("Joe");

    seabiscut.eat(10);
    affirmed.eat(25);

    for (int i = 0; i < 3; i++) {
      
      seabiscut.move();
    
    }
    System.out.println("Seabiscuts fuel level is: " + seabiscut.getFuelLevel());
    
    
    System.out.println("\n *** Abstract Class Objects ***");

    HorseFromVehicle secretariat = new HorseFromVehicle("Secretariat", 10);
    secretariat.addFuel(10);
    System.out.println("Secretarits fuel: " + secretariat.getFuelLevel());
    
    HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
    System.out.println("Eclipse's fuel: " + eclipse.getFuelLevel());
    eclipse.move(10);
    System.out.println();

    Auto vw = new Auto(1, "EruoVan", 2000);
    Auto toyota = new Auto(10, "Tundra", 1998);
    Auto honda = new Auto(5, "Accord", 2003);
    vw.move();
    vw.move(5);

    HorseFromVehicle trigger = new HorseFromVehicle("Trigger", 10);
    HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew", 10);
    HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah", 10);

    ArrayList<AbstractVehicle> vehicleList = new ArrayList<AbstractVehicle>();
    vehicleList.add(secretariat);
    vehicleList.add(trigger);
    vehicleList.add(seattleSlew);
    vehicleList.add(americanPharoah);
    vehicleList.add(eclipse);
    vehicleList.add(vw);
    vehicleList.add(toyota);
    vehicleList.add(honda);

    for (AbstractVehicle v: vehicleList){
      System.out.println(v);
    }   
    System.out.println();

    /*

      Lambda expressions (anon functions) are mainly used for
        - filtering
        - sorting
        - printing

      filter the list with negative fuel level...
      Lammbda expression that returns a boolean value, and gets passed as a param
      v -> v.getFuelLevel() < 0
    */
    
    System.out.println("*** Negative Fuel Vehicles ***");
    printVehicles(vehicleList, v -> v.getFuelLevel() < 0);
    System.out.println();

    System.out.println("*** Horses with positive fuel level ***");
    printVehicles(vehicleList, v -> (v.getFuelLevel() > 0) && (v instanceof HorseFromVehicle));
    System.out.println();

    /*
      sort
    */

    vehicleList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    vehicleList.forEach(v -> System.out.println(v.getName()));


  }
}