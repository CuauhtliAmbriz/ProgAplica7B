import java.util.Scanner;

public class AreaRectangulo{
  public static void main(String[] args) {
    //Leer desde la consola
    Scanner numeros = new Scanner(System.in);

    System.out.println("Área del rectángulo");

    //Ingresar la altura
    System.out.println("Ingresa la altura:");
    double a = numeros.nextDouble();

    //Ingresar la base
    System.out.println("Ingresa la base:")
    double b = numeros.nextDouble();

    //Operacion
    double area = a * b;

    System.out.println("El área del rectángulo es: " + area);
  }
}
