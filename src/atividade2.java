import java.util.Scanner;

public class atividade2 {


    public static void main(String[] args) {

        float x;
        float y;

        Scanner sc1 = new Scanner(System.in);
        x = sc1.nextFloat();
        Scanner sc2 = new Scanner(System.in);
        y = sc2.nextFloat();


        float media = 0;
        media = (x + y) / 2;
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >4 && media <7) {
            System.out.println("Exame!");

        } else {
            System.out.println("reprovado");
        }
        System.out.println(" A média é " + media);
    }
}