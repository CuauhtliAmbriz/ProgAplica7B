import java.util.Scanner;

public class ViajeEscuela{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    double TOT;
    System.out.println("Ingrese el número de alumnos");
    int NA = datos.nextInt();

    if (NA >= 100) {
      TOT = NA * 65;
    }else if (NA >= 50 && NA <= 99) {
      TOT = NA * 70;
    }else if (NA >= 30 && NA <= 49) {
      TOT = NA * 95;
    }else
    TOT = 4000;
    double PA = TOT / NA;

    System.out.println("El total a pagar es: " + TOT);
    System.out.println("El total a pagar por alumno es: " + PA);
  }
}
