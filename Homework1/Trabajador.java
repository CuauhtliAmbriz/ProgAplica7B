import java.util.Scanner;

public class Trabajador{
  public static void main(String[] args) {

    Scanner horas = new Scanner(System.in);

    System.out.println("Sueldo del Trabajador");
    System.out.println("Ingrese las horas trabajadas:");
    double hT = horas.nextInt();
    System.out-println("Ingrese el pago por una hora laboral:");
    double pH = horas.nextDouble();

    double sS = hT * pH;

    System.out.println("El suedo total es: " + sS);  
  }
}
