/* Nome do Aluno: Danielle Martins de Sousa
RA: 722313588
Nome do Programa: Escreva um programa que, dada a carga máxima de um
elevador e a quantidade máxima de pessoas digitadas pelo
usuário, leia o peso de cada pessoa, também digitada pelo
usuário, que entra no elevador até que a carga máxima seja
atingida ou o número máximo de pessoas seja atingido (utilize
do /while).
Data: 21/05/23
*/

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a carga máxima do elevador em kg: ");
        int cargaMaxima = scanner.nextInt();

        System.out.print("Digite a quantidade máxima de pessoas no elevador: ");
        int quantidadeMaxima = scanner.nextInt();

        int cargaAtual = 0;
        int pessoas = 0;

        do {
            System.out.print("Digite o peso da pessoa em kg: ");
            int peso = scanner.nextInt();

            cargaAtual += peso;
            pessoas++;

            if (cargaAtual >= cargaMaxima) {
                System.out.println("Carga máxima atingida!");
                break;
            }

            if (pessoas >= quantidadeMaxima) {
                System.out.println("Número máximo de pessoas atingido!");
                break;
            }

            System.out.println("Pessoa adicionada ao elevador.");
            System.out.println("Carga atual: " + cargaAtual + " kg");
            System.out.println("Pessoas no elevador: " + pessoas);

        } while (true);

        scanner.close();
    }
}
