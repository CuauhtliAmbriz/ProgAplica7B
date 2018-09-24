import java.util.Scanner;

public class LaLangosta{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    System.out.println("Ingrese el número de personas");
    int NP = datos.nextInt();

    double TOT;

    if (NP < 200) {
      TOT = NP * 95;
    }else if (NP <= 300) {
      TOT = NP * 85;
    }else
    TOT = NP * 75;

    System.out.println("El costo total del banquete es de: " + TOT);
  }
}
