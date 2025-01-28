import java.util.Scanner;
public class Teste {
    // Método que retorna um valor inteiro
    static int calculo() {
        Scanner objx = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int x = objx.nextInt();
        return x;
    }

    // Método que exibe uma mensagem no console
    static void retorno() {
        int var = Teste.calculo(); // Chamando o método calculo()
        if (var == 10) {
            System.out.printf("Valor %d é igual a 10\n", var);
        } else if (var % 2 == 0) {
            System.out.printf("Valor %d é par\n", var);
        } else {
            System.out.printf("Valor %d é ímpar\n", var);
        }
    }

    // Método main para testar o programa
    public static void main(String[] args) {
        retorno(); // Chamando o método retorno()
    }
}

//=============================================================================================


import java.util.Scanner;

public class Teste {
    // Método que recebe um número do usuário e o retorna
    static int calculo() {
        Scanner objx = new Scanner(System.in); // Objeto Scanner para entrada do usuário
        System.out.println("Digite um número: ");
        int x = objx.nextInt(); // Lê o número digitado
        return x; // Retorna o número
    }

    // Método que verifica se o número é par ou ímpar e retorna uma mensagem
    static String retorno() {
        int var = Teste.calculo(); // Chama o método calculo() para obter o número
        if (var % 2 == 0) {
            return String.format("Valor %d é par", var); // Retorna mensagem se for par
        } else {
            return String.format("Valor %d é ímpar", var); // Retorna mensagem se for ímpar
        }
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        String mensagem = retorno(); // Chama o método retorno() e armazena a mensagem
        System.out.println(mensagem); // Exibe a mensagem no console
    }
}
