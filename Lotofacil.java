import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        menu();
    }

    private static void menu() throws IOException {
        int opcao = -1;
        Scanner in = new Scanner(System.in);

        do {

            System.out.println(" ** LOTOFACIL ** ");
            System.out.println("Opção 1 - Apostar de 0 a 100");
            System.out.println("Opção 2 - Apostar de A à Z");
            System.out.println("Opção 3 -Apostar em par ou ímpar");
            System.out.println("Opção 0 - Sair");
            System.out.println("**************************");
            System.out.print("Escolha uma opção: ");

            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    aposta1();
                    break;
                case 2:
                    aposta2();
                    break;
                case 3:
                    aposta3();
                    break;
                case 0:
                    System.out.println("Encerrado...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != -1);
    }
             private static void aposta1() {
                 System.out.println("\nAposta de 0 a 100");
                 Random random = new Random();
                 Scanner scanner = new Scanner(System.in);

                 System.out.println("Digite um número de 0 a 100: ");
                 int numeroApostado = scanner.nextInt();

                 if (numeroApostado < 1 || numeroApostado > 100) {
                     System.out.println("Número inválido! Digite um número de 0 a 100.");

                     int numeroSorteado = random.nextInt(101);
                     System.out.println("Número sorteado: " + numeroSorteado);

                     if (numeroApostado == numeroSorteado) {
                         System.out.println("Parabéns! Você ganhou R$1.000,00.");
                     } else {
                         System.out.println("Que pena, não foi dessa vez! O número sorteado foi: " + numeroSorteado);
                     }
                 }
             }
              private static void aposta2() throws IOException {

              System.out.println("\nAposta de A a Z");
              char letraSorteada = 'I';
              System.out.println("Digite uma letra de A a Z: ");
              char letraApostada = (char)System.in.read();

                if(Character.isLetter(letraApostada)){
                char letraApostadaMaiusculo = Character.toUpperCase(letraApostada);
                if (letraApostadaMaiusculo == letraSorteada) {
                    System.out.println("Parabéns!! Você acaba de ganhar 700 reais");
                }else{
                    System.out.println("Vish, não foi dessa vez, a letra sorteada foi : " + "\n");
                }
                }else{
                    System.out.println("Não é uma letra válida.");
        }
    }
            private static void aposta3(){

                System.out.print("Digite um número: ");
                Scanner in = new Scanner(System.in);
                int numeroDigitado = in.nextInt();

                if(numeroDigitado % 2 == 0){
                    System.out.println("Você ganhou R$200,00 reais.");
                }else{
                    System.out.println("Eita, você perdeu! O número digitado é ímpar e a premiação foi para números pares.\");");
                }
 }               }
