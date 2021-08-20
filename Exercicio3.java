import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args){
    //exercicio 3

        final double precoDia = 2;
        Scanner diasCampanha = new Scanner(System.in);
        System.out.println("Insira quantos dias de campanha voce deseja");
        int dias = diasCampanha.nextInt();
        System.out.println("Voce tera " + dias + " dias de campanha com o custo de $" + dias * precoDia);
    }

}
