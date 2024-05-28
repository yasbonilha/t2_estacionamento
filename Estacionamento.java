import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Pilha<Carro> estPilha = new Pilha<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("bem-vindo(a) ao estacionamento de pilha! digite 1 para adicionar um novo carro ao estacionamento, 2 para tirar seu carro do estacionamento ou 3 para consultar se o seu carro esta no estacionamento. digite 0 se voce quiser sair desse estacionamento:");
        int controle = sc.nextInt();


        while (controle != 0){
            if (controle == 1) {
                System.out.println("digite a placa do carro: ");
                String placa = sc.next();

                estPilha.push(new Carro(placa));
                System.out.println("carro adicionado!");
                System.out.println("estacionamento" + estPilha.toString());
            }
            else if (controle == 2) {

            }
            else if (controle == 3){
                System.out.println("digite a placa do carro a ser consultada");
                String placa = sc.next();
                System.out.println(estPilha.estaEstacionado(placa));
                System.out.println(estPilha.toString());
            }
            else{

            }
            System.out.println("digite 1 para adicionar um novo carro ao estacionamento, 2 para tirar seu carro do estacionamento ou 3 para consultar se o seu carro esta no estacionamento. digite 0 se voce quiser sair desse estacionamento:");
            controle = sc.nextInt();
        }
    
        sc.close();
    }
    
}
