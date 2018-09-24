import java.util.Scanner;

public class PositivoNegativo{
  public static void main(String[] args) {
    Scanner numero = new Scanner(System.in);

    System.out.println("Ingrese el número: ");
    int Num = numero.nextInt();

    if (Num > 0) {
      System.out.println("El número es positivo");
    }else
    System.out.println("El número es negativo");
  }
}
