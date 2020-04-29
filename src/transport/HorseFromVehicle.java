package transport;

/*
  Classes and Abstract Classes: A class can only inherit / extend
  a single class. when using fields from the abstract class, you will
  call upon them in the same way you would in a normal class.
  
  super()
  super will call  the parent/super class constructor.

  Inheritance path: Object -> AbstractVehicle -> Horse
*/

public class HorseFromVehicle extends AbstractVehicle {

  public String name;

  public HorseFromVehicle(String name, int fuel) {
    super(fuel);
    this.name = name;
    this.fuel *= 2;
  }

  public HorseFromVehicle(String name) {
    this.name = name;
  }

  // we still need to override what the parent has defined for us...
  @Override
  public String getPath() {
    return "Grass";
  }
  
  @Override
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "HorseFromVehicle{" +
            "name='" + name + '\'' +
            ", fuel=" + fuel +
            '}';
  }

}