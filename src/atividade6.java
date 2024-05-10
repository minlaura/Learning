import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {

        float preco;
        int codigo;


        Scanner a = new Scanner(System.in);
        preco = a.nextFloat();
        Scanner b = new Scanner(System.in);
        codigo = b.nextInt();


        if (codigo == 1) {
            System.out.println("Sul");
        }
        if (codigo == 2) {
            System.out.println("Norte");
        }
        if (codigo == 3) {
            System.out.println("Leste");
        }
        if (codigo == 4) {
            System.out.println("Oeste");
        }if (codigo == 5 || codigo == 6) {
            System.out.println("Sudeste");
        }if (codigo == 7 || codigo == 8 || codigo == 9){
            System.out.println("Nordeste");
        }if (codigo >=10 && codigo <=20){
            System.out.println("Centro-Oeste");

        }if (codigo >= 21 &&  codigo <= 30){
            System.out.println("Nordeste");
        }






    }
}
