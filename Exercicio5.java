/* Nome do Aluno: Danielle Martins de Sousa
RA: 722313588
Nome do Programa:  Faça um programa que leia o nome, o sobrenome, a idade, em
anos, e a naturalidade (cidade de nascimento) de uma pessoa.
Depois, o programa deve dar a seguinte opção “Deseja
visualizar dados completos?”. Se o caractere digitado pelo
usuário for ‘S’ o programa deve imprimir na tela Nome,
Sobrenome, idade e naturalidade. Se o caractere digitado pelo
usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
o caractere não for nenhuma das outras opções acima o programa
deve imprimir “Digitação errada. Tente Novamente”.
Data: 21/05/23
*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = input.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = input.nextLine();

        System.out.print("Digite a idade: ");
        int idade = input.nextInt();
        input.nextLine(); // Limpar o buffer do teclado

        System.out.print("Digite a naturalidade: ");
        String naturalidade = input.nextLine();

        System.out.print("Deseja visualizar dados completos? (S/N): ");
        char opcao = input.nextLine().charAt(0);

        if (opcao == 'S' || opcao == 's') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Naturalidade: " + naturalidade);
        } else if (opcao == 'N' || opcao == 'n') {
            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade + " anos");
        } else {
            System.out.println("Digitação errada. Tente novamente.");
        }

        input.close();
    }
}
