/* Nome do Aluno: Danielle Martins de Sousa
RA: 722313588
Nome do Programa: Faça um programa que solicite ao usuário que digite um
número até que ele digite um número menor que 0 (utilize
while)
Data: 21/05/23
*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (digite um número menor que 0 para encerrar): ");
            numero = scanner.nextInt();
        } while (numero >= 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
