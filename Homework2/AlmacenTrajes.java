import java.util.Scanner;

public class AlmacenTrajes{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    double DE, PF;

    System.out.println("Ingrese el precio del traje");
    int CT = datos.nextInt();

    if (CT >= 2500) {
      DE = CT * 0.15;
    }else
    DE = CT * 0.08;

    PF = CT - DE;

    System.out.println("El precio a pagar es de: " + PF);
  }
}
