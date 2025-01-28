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
