import java.util.Random;

class fatura1 {
    public static void main(String[]args){
        Random random = new Random();

        for (int i =1; i <= 7; i++){
            int valor = random.nextInt(2);
            Fatura faturaCliente1 = new Fatura(valor);
            faturaCliente1.imprimeFatura();
        }
    }
}
 class Fatura{
    int servico;

      Fatura(int servico){
         this.servico = servico;
     }
     public void imprimeFatura(){
          if(this.servico == 0){
              System.out.println("Segurança com câmeras - Preço fixo de US $ 1.500 por mês");
          }
          else if(this.servico == 1){
              System.out.println("Câmera de segurança + patrulha - Preço de $ 1500 + $ 700 para serviço de patrulha totalizando $2200,00");
          }
          else{
              System.out.println("Servico Invalido!");
          }
     }

 }
