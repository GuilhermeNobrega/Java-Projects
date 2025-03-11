package For;/*public class For.SwitchExample {
    static int b = 10;
    public static int Retorno(){
        return b;
    }
    public static void main(String[] args) {
        int x = Retorno();
        //System.out.println(x);
        switch(x){
            case 0:
                System.out.println("X = 0");
                break;// se estiver sem o break, ele descerá para o próximo
            case 1:
                System.out.println("X = 1");
                break;
            case 10:
                System.out.println("X = 10");
                if (x % 2 == 0){
                    System.out.println("X = par");
                }
                break;
            default:
                System.out.println("Urubu sujo");
        }
    }
}

 */
import java.util.Scanner;

public class SwitchExample {
    public static String Pergunta() {
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite uma opção para calculadora: SOMA/SUBTRACAO/DIVISAO/MULTIPLICACAO: ");
        return pergunta.nextLine().toUpperCase();  // Convertendo para maiúsculas para evitar problemas de case-sensitive
    }

    public static int PerguntaNumero() {
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite um número: ");
        return pergunta.nextInt();  // Lê o número inteiro
    }

    public static void main(String[] args) {
        String operacao = Pergunta();
        int numero = PerguntaNumero();  // Lê o número a ser usado na operação

        switch (operacao) {
            case "SOMA":
                System.out.printf("15 + %d = %d\n", numero, 15 + numero);  // Corrigido para usar \n
                break;
            case "SUBTRACAO":
                System.out.printf("15 - %d = %d\n", numero, 15 - numero);
                break;
            case "DIVISAO":
                if (numero != 0) {
                    System.out.printf("15 / %d = %.2f\n", numero, 15.0 / numero);
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;
            case "MULTIPLICACAO":
                System.out.printf("15 * %d = %d\n", numero, 15 * numero);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
