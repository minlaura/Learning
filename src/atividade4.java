import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {

        float altura;
        String sexo;




        Scanner a = new Scanner(System.in);
        altura = a.nextFloat();
        Scanner b = new Scanner(System.in);
        sexo = b.next();


//Para strings se usa equals, exemplo da atividade, comparação


    if (sexo.equals("Masculino")){
        double pesoideal;
      pesoideal =  (72.7 * altura) - 58;
        System.out.printf("Peso ideal: %.2f\n", pesoideal);
    } else if (sexo.equals("Feminino")){
        double pesoideal;
        pesoideal = (62*altura) - 44.7;
         System.out.printf("Peso ideal: %.2f\n", pesoideal);
        }




    }
}
