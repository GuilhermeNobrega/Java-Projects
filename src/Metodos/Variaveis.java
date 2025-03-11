package Metodos;

public class Variaveis {
    String name = "JDK";
    static String versao = "1.0";

    static void mostrarVersao() {
        // Correção: Não é possível acessar `name` diretamente.
        // Cria-se uma instância para acessar atributos de instância.
        Variaveis var = new Variaveis();
        System.out.printf("Versão do %s: %s\n", var.name, versao);
    }

    public static void main(String[] args) {
        mostrarVersao();
    }
}
