import java.util.Scanner;

public class Cantidades{
  public static void main(String[] args) {
    Scanner cantidad = new Scanner(System.in);

    System.out.println("Ingrese la primera cantidad");
    int A = cantidad.nextInt();
    System.out.println("Ingrese la segunda cantidad");
    int B = cantidad.nextInt();
    System.out.println("Ingrese la tercera cantidad");
    int C = cantidad.nextInt();

    if (A > B && A > C) {
      System.out.println("La cantidad mayor es: " + A);
    }else if (B > C && B > C) {
      System.out.println("La cantidad mayor es: " + B);
    }else
    System.out.println("La cantidad mayor es: " + C);
  }
}
