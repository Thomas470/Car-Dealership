
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    // começa no main 
    public static void main(String[] args) {


        System.out.println("\033[H\033[2J");
        System.out.flush();
        //para limpar o console

        // para fazer o menu
        while (true) {

            Compra compra = new Compra(); 

            System.out.println("1: Exibir todos os veículos");
            System.out.println("2: Escolher o Veículo");
            System.out.println("3: Exibir adicionais");
            int menu;
            Scanner input = new Scanner(System.in);
            menu = input.nextInt();
    
            ArrayList<String> informacoes = new ArrayList();
    
            int i;
    
            informacoes.add("Ar condicionado");
            informacoes.add("Tela");
            informacoes.add("Banco de couro");
    
    
            System.out.println();
    
    
         //   esta chamando a classe dos model
            ModelX ModelX = new ModelX("Model X", 40, 30.0);
            ModelY ModelY = new ModelY("Model Y", 50, 50.0);
            Model3 Model3 = new Model3("Model 3", 100, 100.0, 100.0);

            if (menu == 1) {      

                System.out.println("\033[H\033[2J");
                System.out.flush();



                System.out.println("Modelo 1do carro: Model X");
                ModelX.imprimir();
                ModelX.ganhar(10);
                ModelX.perder(5);
                ModelX.imprimir();
                System.out.println("---------------------------------------------");
        
                System.out.println("Modelo do carro: Model y");

                ModelY.imprimir();
                ModelY.ganhar(100);
                ModelY.perder(1);
                ModelY.imprimir();
                System.out.println("---------------------------------------------");
                System.out.println("Modelo do carro: Model 3");

                Model3.imprimir();
                Model3.ganhar(1);
                Model3.perder(1);
                Model3.imprimir();
                System.out.println("---------------------------------------------");
    
            }
            else if (menu == 2){

                System.out.println("\033[H\033[2J");
                System.out.flush();
    
                System.out.println("1: Model X");
                System.out.println("2: Model Y");
                System.out.println("3: Model 3");
    
                System.out.println();
                int escolherModelo;
                Scanner Modelo = new Scanner(System.in);
                escolherModelo = input.nextInt();
    
                if (escolherModelo == 1) {
                    System.out.println("Modelo do carro: Model X");

                    ModelX.ganhar(10);
                    ModelX.perder(5);
                    ModelX.imprimir();
                    System.out.println("---------------------------------------------");
                }
    
                if(escolherModelo == 2){

                    System.out.println("Modelo do carro: Model Y");

                    ModelY.imprimir();
                    ModelY.ganhar(100);
                    ModelY.perder(1);
                    ModelY.imprimir();
                    System.out.println("---------------------------------------------");
                }
    
                if(escolherModelo == 3) {

                    System.out.println("Modelo do carro: Model 3");

                    Model3.imprimir();
                    Model3.ganhar(1);
                    Model3.perder(1);
                    Model3.imprimir();
                    System.out.println("---------------------------------------------");
    
                }
                }
    
            else if(menu == 3){

                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println(informacoes);
                System.out.println("--- Deseja inserir adicionais? ---");
                System.out.println("--- 1 : SIM ---");
                System.out.println("--- 2 : NÃO ---");


                int adicionais;
                Scanner inputAdicionais = new Scanner(System.in);
                adicionais = inputAdicionais.nextInt();
                if (adicionais == 1) {

                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Digite o adicional que deseja inserir ");
                    String InserirAdicional;
                    Scanner inputInserirAdicional = new Scanner(System.in);
                    InserirAdicional = inputInserirAdicional.next();
                    informacoes.add(InserirAdicional);

                    System.out.println(informacoes);
                     //sereve para adicionar o extra


                }
            }
            }
    
    
        }
}
