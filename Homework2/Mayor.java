import java.util.Scanner;

public class Mayor{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    System.out.println("Ingresa el valor uno");
    int A = datos.nextInt();
    System.out.println("Ingresa el segundo valor");
    int B = datos.nextInt();

    if (A > B) {
      System.out.println("\n" + A + " Es mayor que: " + B);
    }else
    System.out.println("\n" + B + " Es mayor que: " + A);
  }
}
