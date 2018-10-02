public class Dog{
  //Properties or attributes
  public String color;
  public String eyeColor;
  public double height;
  public double lenght;
  public double weight;

  //Methods or behaviors
  public String sit(){
    return "Estoy sentado";
    //System.out.println("Estoy sentado");
  }

  public void bark(){
    System.out.println("wauff wauff");
  }

  public void layDown(String name){
    System.out.println(name + "Estoy recostado");
  }

  public void eat(){
    System.out.println("I'm eating");
  }

  public void sleep(){
    System.out.println("ZzZzZzZzZzZz");
  }
}
