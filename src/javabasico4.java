import java.util.Scanner;

public class javabasico4 {
    public static void main(String[] args) {

        double ipi;
        double cod1; double valor1; double quant1; double cod2; double valor2; double quant2; double valortotal;





        Scanner a = new Scanner (System.in);
        ipi = a.nextDouble();
        valor1 = a.nextDouble();
        quant1 = a.nextDouble();
        valor2 = a.nextDouble();
        quant2 = a.nextDouble();
        a.close();

        valortotal = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
        System.out.println("Valor total a ser pago = "+valortotal);






    }
}
