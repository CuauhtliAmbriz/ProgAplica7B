import java.util.Scanner;

public class TerrenoTriaRectan{
  public static void main(String[] args) {

    Scanner datos = new Scanner(System.in);

    System.out.println("Ingrese la altura total:");
    double a = datos.nextDouble();
    System.out.println("Ingrese la base:");
    double b = datos.nextDouble();
    System.out.println("Ingrese la altura del rectángulo:");
    double c = datos.nextDouble();

    // operaciones
    double alturaTri = a - c;
    double aT = (b * alturaTri) /2;
    double aR = (b * c);
    double area = aT + aR;

    System.out.println("El área total es: " + area);
  }
}
