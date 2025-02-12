package Vetores;

import java.util.Scanner;

public class VetorExercicio1 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.print("Quantos nomes deseja adicionar? ");
        int tamanho = op.nextInt(); // Lê a quantidade de nomes que o usuário quer adicionar
        op.nextLine(); // Consumir a quebra de linha pendente do nextInt()

        String[] nomes = new String[tamanho]; // Inicializa o array com o tamanho informado

        // Loop para inserir os nomes no vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = op.nextLine();
        }

        // Exibir os nomes armazenados
        System.out.println("\nVetor de nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        op.close(); // Fechar o Scanner para evitar vazamento de recurso
    }
}
