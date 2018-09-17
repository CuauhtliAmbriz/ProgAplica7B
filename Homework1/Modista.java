import java.util.Scanner;

public class Modista{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    System.out.println("Concersión de datos");
    System.out.println("Cantidad de metros a solicitar:");
    double cM = datos.nextDouble();

    //operacion
    double pG = cM / 0.0254;

    System.out.println("Cantidad de pulgadas a pedir son: " + pG);
  }
}
