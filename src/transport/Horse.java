package transport;

public class Horse implements Vehicle, Animal {

  // fields
  private int fuel = 0;
  private String name;

  // constructor
  public Horse (String name) {
    this.name = name;
  }

  // getters and setters
  
  // name
  String getName(){
    return name;
  }

  void setName(String name){
    this.name = name;
  }

  // interface methods

  /*
    The override is to override what the parent is telling us to do.
    
    - If an interface shares the same method as another interface, you only have to
      implement it once and it will satisfy all interfaces that have that method in common

  */

  @Override
  public void move() {
    fuel = fuel - 1;
  };

  @Override
  public void eat(int i) {
    fuel = fuel + i;
  };
  
  @Override
  public String speak() {
    return "Neigh";
  };

  @Override
  public String getPath() {
    return "Grass"
  };

  @Override
  public int getFuelLevel() {
    return fuel;
  };

  @Override
  public void addFuel(int i) {
    eat(i);
  };

}