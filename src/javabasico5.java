import java.util.Scanner;

public class javabasico5 {
    public static void main(String[] args) {

        double salariominimo = 788.00;
        double salario;
        double quantia;

        Scanner a = new Scanner(System.in);
        salario = a.nextDouble();

        quantia = salario/salariominimo;
        System.out.printf( "Você ganha %.2f salários mínimos.\n", quantia);





    }
}
