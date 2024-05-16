import java.util.Scanner;

public class javabasico6 {
    public static void main(String[] args) {


        double numero; double sucessor; double antecessor;

        Scanner a = new Scanner(System.in);
        numero = a.nextDouble();

        sucessor = numero + 1;
        antecessor = numero - 1;

        System.out.println("O sucessor do número "+numero+" é igual "+ sucessor + " e seu antecessor é "+antecessor);





    }
}
