import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int number = sc.nextInt();
        sc.close();
        if (number == 0) {
            System.out.println("No existe el numero");
        }else if (number > 0) {
            System.out.println("El numero es mayor que 0");
        }else if (number < 0) {
            System.out.println("No trabajamos con numeros negativos");
        }
    }
}