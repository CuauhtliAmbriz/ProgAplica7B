import java.util.Scanner;

public class MayorMenor{
  public static void main(String[] args) {
    Scanner numero = new Scanner(System.in);

    System.out.println("Ingresa el primer número");
    int A = numero.nextInt();
    System.out.println("Ingresa el segundo número");
    int B = numero.nextInt();
    System.out.println("Ingresa el tercer número");
    int C = numero.nextInt();

    if (A >= B) {
      else if (B >= C) {
        System.out.println("Los número ordenados son: " + A + B + C);
      }else if () {

      }
  }
}
