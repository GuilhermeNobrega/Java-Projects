package Vetores;

public class TestaArgs {
    //array de strings
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Não foram digitados args suficientes");
        }
        else
            System.out.println("Args digitados foram: " + args[1]);
    }
}
// java .\Vetores.TestaArgs.java 2 3 4 5 6 7 para executar