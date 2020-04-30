package transport;

public class Auto extends AbstractVehicle {

  private String model;
  private int year;

  public Auto(int fuel, String model, int year) {
    
    super(fuel);
    this.model = model;
    this.year = year;

  }

  // getters and setters

  // name
  public void setName(String model) {
    this.model = model;
  }

  // model
  public void setModel(String model) {
    this.model = model;
  }

  // year
  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  // super methods
  @Override
  public String getPath() {
    return "Road";
  }

  @Override
  public String getName() {
    return model;
  }

  @Override
  public String toString(){
    return "Auto{" +
            "year=" + year +
            ", fuel=" + fuel +
            '}';
  }

}