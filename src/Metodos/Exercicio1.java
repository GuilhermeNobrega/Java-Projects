package Metodos;
import java.util.Scanner;

public class Exercicio1 {
    public static int verIdade(Scanner scanner) { // Scanner agora é um parâmetro
        System.out.println("Digite vossa idade, por favor: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
        return idade;
    }

    public static String verNome(Scanner scanner) { // Scanner como parâmetro
        System.out.println("Digite vosso nome, por favor: ");
        String nome = scanner.nextLine();
        return nome;
        //return scanner.nextLine();
    }

    public static void Apresentacao() {
        Scanner scanner = new Scanner(System.in); // Criamos o Scanner APENAS UMA VEZ
        String nome = verNome(scanner);
        int idade = verIdade(scanner);
        System.out.printf("Nome = %s\nIdade = %d\n", nome, idade);
        scanner.close(); // Fechamos o Scanner após o uso
    }

    public static void main(String[] args) {
        System.out.println("Apresentação dados do usuário: ");
        Apresentacao();
    }
}
