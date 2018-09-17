import java.util.Scanner;

public class AreaCircunferencia{
  public static void main(String[] args) {
    //Leer desde la consola
    Scanner datos = new Scanner(System.in);
    System.out.println("Área del circulo");

    //Ingresar datos
    System.out.println("Ingresa el radio del círculo:");
    double r = datos.nextFloat();

    double pi = 3.1416;

    //Operacion
    double area = pi * r * r;

    System.out.println("El área del círculo es: " + area);
  }
}
