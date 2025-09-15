public class DoggyDog
{
  //instance variables
  private int size;
  private String breed;
  //methods
  public void setSize(int sizeIn)
  {
    size = sizeIn;
  }
  public int getSize()
  {
    return size;
  }
  public void setBreed(String breedIn)
  {
    breed = breedIn;
  }
  public String getBreed()
  {
    return breed;
  }
  public String bark()
  {
    if(getSize() < 30)
      return "yap, yap";
    else if(getSize() < 50)
      return "bow, wow";
    else
      return "ruff, ruff";
  }
} //end Class