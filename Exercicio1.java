
/* Nome do Aluno: Danielle Martins de Sousa
RA: 722313588
Nome do Programa: Faça um programa que leia dois números A e B e imprima o maior
deles.
Data: 21/05/23
*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número A: ");
        int a = input.nextInt();

        System.out.print("Digite o número B: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("O maior número é: " + a);
        } else if (b > a) {
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("Os números são iguais.");
        }

        input.close();
    }
}
