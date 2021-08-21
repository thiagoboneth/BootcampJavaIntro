import java.util.Random;

public class Exercicio8 {
    public static void main(String args[]) {
        Formulario[] formularios = new Formulario[50];
        Random random = new Random();


        for (int i = 0; i < 50; i++) {
            Formulario formulario = new Formulario(random.nextBoolean(), random.nextBoolean(), random.nextBoolean());
            formularios[i] = formulario;
        }

        int contador3Jornais = 0, contadorAeC = 0, contadorBeC = 0, contadorA = 0;

        for (int i = 0; i < 50; i++){
            if(formularios[i].ehAssinanteDos3Jornais()){
                contador3Jornais++;
            }
            if (formularios[i].ehAssinanteDoJornalAeC()) {
                contadorAeC++;
            }
            if(formularios[i].ehAssinanteDoJornalBeC()){
                contadorBeC++;
            }
            if (formularios[i].ehSomenteAssinanteDoCanalA()){
                contadorA++;
            }
        }

        System.out.println("Quantos são assinantes dos 3 jornais? " +contador3Jornais+ " Pessoas");
        System.out.println("Quantos são assinantes do Diário A e Diário C " +contadorAeC+ " Pessoas");
        System.out.println("Quantos são assinantes do Diário B e Diário C? " +contadorBeC+ " Pessoas");
        System.out.println("Quantos são assinantes apenas do Jornal A? " +contadorA+ " Pessoas");
    }
}

class Formulario {
    boolean canalA;
    boolean canalB;
    boolean canalC;

    Formulario(boolean canalA, boolean canalB, boolean canalC) {
        this.canalA = canalA;
        this.canalB = canalB;
        this.canalC = canalC;
    }

    public boolean ehAssinanteDos3Jornais() {
        return canalA && canalB && canalC;
    }

    public boolean ehAssinanteDoJornalAeC() {
        return canalA && canalC;
    }

    public boolean ehAssinanteDoJornalAeB() {
        return canalA && canalB;
    }

    public boolean ehAssinanteDoJornalBeC() {
        return canalB && canalC;
    }

    public boolean ehSomenteAssinanteDoCanalA() {
        return canalA && !canalB && !canalC;
    }
}