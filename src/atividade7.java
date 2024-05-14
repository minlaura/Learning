import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {

        float venda;
        float valorcup = 20;
        int cupom;


        Scanner a = new Scanner(System.in);
            System.out.println("digite o valor da venda");
            venda = a.nextFloat();

            cupom = (int) (venda/valorcup);
            if (cupom>0){
                System.out.println("O cliente tem direito " +cupom+ " Cupom/ns");
            } else
                System.out.println("Não tem direito");


            a.close();






            
        }


    }
