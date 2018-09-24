import java.util.Scanner;

public class Lapiz{
  public static void main(String[] args) {
    Scanner cantidad = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de lápices");
    int X = cantidad.nextInt();

    double pago;

    if (X >= 1000) {
      pago = X * 0.85;
    }else
    pago = X * 0.90;

    System.out.println("El pago total es de: " + pago);
  }
}
