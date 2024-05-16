import java.util.Scanner;

public class javabasico3 {
    public static void main(String[] args) {


        double valor;
        double reajuste;



        Scanner a = new Scanner (System.in);
        System.out.println("Digite um valor");
        valor = a.nextDouble();

        reajuste = valor * 0.01 + valor;
        System.out.println(reajuste);



    }
}
