import java.util.Scanner;

public class Ejercici4Hipotenusa{
  public static void main(String[] args) {

    Scanner datos = new Scanner(System.in);

    System.out.println("Ingresa la base del Triangulo (Radio del círculo):");
    double r = datos.nextDouble();
    System.out.println("Ingresa la Hipotenusa:");
    double h = datos.nextDouble();

    double c = ((h*h)-(r*r));
    double sQRT = Math.sqrt(c);
    double aCT = sQRT;

    double aCC = (3.14159 * r * r);

    double aT = aCT * 2;
    double aC = aCC / 2;
    double area = aC + aT;
  }
}
