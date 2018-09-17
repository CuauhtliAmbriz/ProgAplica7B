import java.util.Scanner;

public class Conagua{
  public static void main(String[] args) {
    //leer desde la consola
    Scanner cantidad = new Scanner(System.in);

    System.out.println("Ingrese la altura de la alberca:");
    double a = cantidad.nextDouble();
    System.out.println("Ingrese el largo de la alberca:");
    double l = cantidad.nextDouble();
    System.out.println("Ingrese el ancho de la alberca:");
    double n = cantidad.nextDouble();
    System.out.println("Ingrese el costo del metro cúbico de agua:");
    double cM = cantidad.nextDouble();

    //operaciones

    double v = l * n * a;
    double pAG = v * cM;

    System.out.println("Pago de agua: " + PAG);
  }
}
