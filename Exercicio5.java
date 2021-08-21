import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Exercicio5 {

    public static void main(String[] args) {
        double porcentagem = 0;
        int distancia = 0;
        Scanner diasCampanha = new Scanner(System.in);
        System.out.println("Digite o preco de fabricacao");
        int precoCusto = diasCampanha.nextInt();

        System.out.println("Fabrica 1 a 500KM de distancia e a taxa de envio e de 7%");
        System.out.println("Fabrica 2 a 780KM de distancia e a taxa de envio e de 15%");
        System.out.println("Fabrica 3 a 1200KM de distancia e a taxa de envio e de 22%");

        Scanner fabrica = new Scanner(System.in);
        System.out.println("Digite a fabrica para envio");
        int idFabrica = fabrica.nextInt();


        if(idFabrica == 1) {
            porcentagem = 0.7;
            distancia = 500;
        } else if(idFabrica == 2) {
            porcentagem = 0.15;
            distancia = 780;
        } else if(idFabrica == 3) {
            porcentagem = 0.22;
            distancia = 1200;
        }
        double custoEnvio =  porcentagem * precoCusto;
        double produtoLucro = precoCusto + custoEnvio;
        double custoFinal = produtoLucro + (produtoLucro * 0.25) ;
        System.out.println("Valor final do produto eh: "+NumberFormat.getCurrencyInstance(Locale.US).format(custoFinal));
        System.out.println("voce escolheu a fabrica "+idFabrica+" que fica ao uma distancia de "+distancia+"KM da SEDE.");
    }
}