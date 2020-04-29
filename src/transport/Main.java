package transport;

import java.util.*;

public class Main {

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

  }
}