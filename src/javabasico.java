import java.util.Scanner;

public class javabasico {
    public static void main(String[] args) {


        int anos;
        int meses;
        int dias;
        int resultado;

        Scanner a = new Scanner(System.in);
        System.out.println("Anos:");
        anos = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Meses:");
        meses = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("Dias:");
        dias = c.nextInt();

        resultado = (anos * 365) + (meses * 30) + dias;

        System.out.println(anos+" "+meses+" "+dias+" é igual a "+resultado+" dias.");









    }
}
