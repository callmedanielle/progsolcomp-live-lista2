/* Nome do Aluno: Danielle Martins de Sousa
RA: 722313588
Nome do Programa:  Faça um programa que imprima todos os números pares de 1
a 100 na ordem inversa
Data: 21/05/23
*/

public class Exercicio11 {

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
