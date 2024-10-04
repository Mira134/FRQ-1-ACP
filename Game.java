class Game {
  
  private String name; 
 
  public Game(String name, int age) {
    this.name = name;
    
  }
  public String getName() {
    return name;
  }
  
  public void makeSound(){
    System.out.println("This ride makes a sound");
  }
}
class RC extends Game {
  private String ride;
  public RC(String name, String ride) {
    super(name);
    this.ride = ride;
  }
  public String getRide() {
    return ride;
  }
  public void makeSound() {
    System.out.println("The Rollercoaster is scary");
  }
}
class Ship extends Game {
  private boolean isIndoor;
  public Ship(String name,boolean isIndoor) {
    super(name);
    this.isIndoor = isIndoor;
  }
  public boolean getisIndoor() {
    return isIndoor;
  }
  public void makeSound() {
    System.out.println("The Pirate Ship Swings back and fourth");
  }
}

class Main {
public static void main(String[] args) {
  Game game = new Game("Tuti", 5);
  RC rc = new RC("Rollercoaster",  "Rollercoaster");
 Ship ship = new Ship("Pirate Ship",true);

  Game.makeSound();
  System.out.println(Game.getName());

  RC.makeSound();
  System.out.println(RC.getName() + " is a " + RC.getRide());

  Ship.makeSound();
  System.out.println(Ship.getName() + " is "  (Ship.getisIndoor() ? "indoor" : "outdoor"));
}
}