import java.util.Scanner;

public class atividade5 {

    public static void main(String[] args) {

        int idade;
        String categoria;


        Scanner a = new Scanner(System.in);
        idade = a.nextInt();


        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil");


        }
        if (idade >= 8 && idade <= 10) {
            System.out.println("Juvenil");

        }
        if (idade >= 11 && idade <= 15) {
            System.out.println("Adolescente");

        }
        if (idade >= 16 && idade <= 30) {

            System.out.println("Adulto");


        }if (idade > 30) {
                System.out.println("SÊNIOR");

    }
    }


    }
