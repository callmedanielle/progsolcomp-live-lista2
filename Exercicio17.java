/* Nome do Aluno: Danielle Martins de Sousa
RA: 722313588
Nome do Programa: Faça um programa que imprima os múltiplos negativos de 7,
superiores a -1000.
Data: 21/05/23
*/

public class Exercicio17 {
    public static void main(String[] args) {
        int numero = -7;

        do {
            System.out.println(numero);
            numero -= 7;
        } while (numero > -1000);
    }
}
