import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[]args){
        //exercicio 4

        int valorBrutoPremio = 23563899;
        double imposto1 = 0.0245;
        double imposto2 = 0.15;
        double imposto3 = 0.03;
        System.out.println("Parabens ganhador seu premio é de: "+ valorBrutoPremio);
        Scanner premio = new Scanner(System.in);
        System.out.println("Insira seu premio");
        int totalPremio = premio.nextInt();
        double descontoPremio1 = totalPremio*imposto1;
        double descontoPremio2 = totalPremio*imposto2;
        double descontoPremio3 = totalPremio*imposto3;
        double totalDesconto = descontoPremio1+descontoPremio2+descontoPremio2;

        System.out.println("Seu premio tera o desconto fiscal 1 é de " + descontoPremio1);
        System.out.println("Seu premio tera o desconto fiscal 2 é de " + descontoPremio2);
        System.out.println("Seu premio tera o desconto fiscal 3 é de " + descontoPremio3);
        System.out.println("Seu premio de "+totalPremio+" teve o desconto de " + totalDesconto);
    }
}
