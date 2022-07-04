package Activities;

class Car
{
  String color;
  String transmission;
  int make;
  int tyres;
  int doors;

  Car()
  {
      doors=4;
      tyres=4;

  }
  void displayCharacterstics()
  {
      System.out.println("The car color is"+color);
      System.out.println("The car has "+tyres+" tyres");
      System.out.println("The car has "+doors+" doors");
      System.out.println("Transmission of the car is "+transmission);
      System.out.println("Making year of the car is "+make);

  }
  void accelerate()
  {
      System.out.println("The car is moving forward");
  }
  void brake()
    {
        System.out.println("The car has stopped");
    }

}
public class Activity1 {
    public static void main(String[] args)
    {
        Car toyota = new Car();
        toyota.make = 2014;
        toyota.color = "Black";
        toyota.transmission = "Manual";

        //Using Car class method
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();
    }
}
