public class DoggyDogTester
{
  public static void main(String[] args)
  {
    DoggyDog spot = new DoggyDog();
    spot.setBreed( "Alsatian" );
    spot.setSize(5);
    System.out.print("spot says "+spot.bark());
  }
}
