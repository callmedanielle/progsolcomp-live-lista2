/* Nome do Aluno: Danielle Martins de Sousa
RA: 722313588
Nome do Programa:  Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7
Data: 21/05/23
*/

public class Exercicio12 {
    public static void main(String[] args) {
        int numero = 0;

        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero % 7 != 0);
    }
}
