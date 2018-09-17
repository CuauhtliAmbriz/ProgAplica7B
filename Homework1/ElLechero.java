import java.util.Scanner;

public class ElLechero{
  public static void main(String[] args) {

    Scanner cantidades = new Scanner(System.in);

    System.out.println("Ingrese los litros producidos:")
    int l = cantidades.nextInt();
    System.out.println("Ingrese el precio del galón:")
    double pG = cantidades.nextDouble();

    double tG = l / 3.785;

    double gA = tG * pG;

    System.out.println("La ganancia total es de: " + gA);
  }
}
