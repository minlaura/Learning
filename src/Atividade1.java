import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
//        int x;
//        int y;
//        //Lê a partir da linha de comando
//        Scanner sc1 = new Scanner(System.in);
//        x = sc1.nextInt();
//        Scanner sc2 = new Scanner(System.in);
//        y = sc2.nextInt();
//
//        if (x>y){
//            System.out.println( x + " é maior que" + y);
//
//        } else if (x==y) {
//
//            System.out.println( y + " é igual a  " + x);
//
//        } else {
//            System.out.println(y + " é maior que " + x);
//        }

        float x;
        float y;
        float z;


        Scanner sc1 = new Scanner(System.in);
        x = sc1.nextFloat();
        Scanner sc2 = new Scanner(System.in);
        y = sc2.nextFloat();
        Scanner sc3 = new Scanner(System.in);
        z = sc3.nextFloat();

        float media = (x + y + x) / 3;

        if (media >= 7) {
            System.out.println("O aluno está aprovado");

        } else {
            System.out.println("O aluno está reprovado");
        }
    }






    }





