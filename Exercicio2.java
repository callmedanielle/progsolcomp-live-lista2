
/* Nome do Aluno: Danielle Martins de Sousa
RA: 722313588
Nome do Programa: Construa um programa que receba como entrada três valores A, B
e C e os imprima em ordem crescente.

deles.
Data: 21/05/23
*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = input.nextInt();

        // Verificar a ordem crescente e imprimir os valores
        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
            } else {
                System.out.println("Ordem crescente: " + a + ", " + c + ", " + b);
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println("Ordem crescente: " + b + ", " + a + ", " + c);
            } else {
                System.out.println("Ordem crescente: " + b + ", " + c + ", " + a);
            }
        } else {
            if (a <= b) {
                System.out.println("Ordem crescente: " + c + ", " + a + ", " + b);
            } else {
                System.out.println("Ordem crescente: " + c + ", " + b + ", " + a);
            }
        }

        input.close();
    }
}