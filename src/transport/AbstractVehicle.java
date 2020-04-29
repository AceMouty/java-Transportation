package transport;

/*
  Abstact classes can have:
    - fields
        fields in an abstract class are protected by default.
        only the parent and children know of the fields, but not the outside world.
        protected: Its a family secret.
    - methods
    - "abstract" methods

  You can not create objects from abstract classes, but you can have children!

  Abstract classes can have AS MANY CONSTRUCTORS as you want....however parameters for each one MUST
  be different. This is known as method overloading...

*/

public abstract class AbstractVehicle {
  
  int fuel;

  public AbstractVehicle(int fuel) {
    this.fuel = fuel;
  }

  public AbstractVehicle() {
    fuel = 1;
  }

  // putting abstract on the methods, means that the children MUST implememnt them.
  public abstract String getPath();
  public abstract String getName();

  public void move() {
    fuel--;
  }

  public int getFuelLevel() {
    return fuel;
  }

  public void addFuel(int i) {
    fuel = fuel + i;
  }

}