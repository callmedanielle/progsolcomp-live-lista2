/* Nome do Aluno: Danielle Martins de Sousa
RA: 722313588
Nome do Programa: Faça um programa que preencha com zeros todas as posições
de um vetor de tamanho 50
Data: 21/05/23
*/

public class Exercicio14 {
    public static void main(String[] args) {
        int tamanho = 50;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = 0;
        }

        System.out.println("Vetor preenchido com zeros:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
