import java.util.Scanner;

public class PuebloDesconocido2{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    double NC, AC;

    System.out.println("Ingresa el número de targeta");
    int TT = datos.nextInt();
    System.out.println("Ingrese su límite de crédito");
    double LA = datos.nextDouble();

    if (TT == 1)
    NC = LA + (LA * 0.25);
    else if (TT == 2)
    NC = LA + (LA * 0.35);
    else if (TT == 3)
    NC = LA + (LA * 0.40);
    else
    NC = LA + (LA * 0.50);

    AC = NC - LA;

    System.out.println("Su nuevo límite de crédito es: " + NC);
    System.out.println("\n El aumento de crédito es: " + AC);
  }
}
