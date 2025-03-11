package Metodos;

public class Exemplo {

    public void metodoExemplo() {
        int numero = 10; // variável local do método

        // Classe interna local
        class ClasseInterna {
            public void mostrar() {
                System.out.println("Valor da variável local: " + numero);
            }
        }

        // Instanciando e usando a classe interna dentro do método
        ClasseInterna classeInterna = new ClasseInterna();
        classeInterna.mostrar();
    }

    public static void main(String[] args) {
        Exemplo exemplo = new Exemplo();
        exemplo.metodoExemplo();
    }
}
