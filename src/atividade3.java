import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {

        double salarioatual;
        int codigo;
        double aumento;
        double novosalario = 0;

        Scanner x = new Scanner(System.in);
        salarioatual = x.nextDouble();
        Scanner y = new Scanner(System.in);
        codigo = y.nextInt();


        if (codigo == 1) {
            System.out.println("Escrituário");

            aumento = salarioatual * 0.5;
            novosalario = aumento + salarioatual;
            System.out.println("O aumento é " +aumento+", seu novo salário é "+ novosalario);

        }
        if (codigo == 2) {
            System.out.println("Secretário");
            aumento = salarioatual * 0.35;
            novosalario = aumento + salarioatual;
            System.out.println("O aumento é " +aumento+", seu novo salário é "+ novosalario);


        }
        if (codigo == 3) {
            System.out.println("Caixa");
            aumento = salarioatual * 0.2;
            novosalario = aumento + salarioatual;
            System.out.println("O aumento é " +aumento+", seu novo salário é "+ novosalario);

        }
        if (codigo == 4) {
            System.out.println("Gerente");
            aumento = salarioatual * 0.1;
            novosalario = aumento + salarioatual;
            System.out.println("O aumento é " +aumento+", seu novo salário é "+ novosalario);
        }
        if (codigo == 5) {
            System.out.println("Diretor");
            System.out.println("Salário" + salarioatual);


        }
    }
}
