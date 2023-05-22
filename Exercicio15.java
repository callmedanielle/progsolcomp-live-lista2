/* Nome do Aluno: Danielle Martins de Sousa
RA: 722313588
Nome do Programa:Faça um programa que preencha com zeros todas as posições
de uma matriz com 10 linha e 10 colunas
Data: 21/05/23
*/

public class Exercicio15 {
    public static void main(String[] args) {
        int linhas = 10;
        int colunas = 10;
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = 0;
            }
        }

        System.out.println("Matriz preenchida com zeros:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
