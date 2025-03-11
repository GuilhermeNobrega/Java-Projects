package ScannerInput;
import java.util.Scanner;

/*
Metodos.Exemplo para uso do nextInt() e nextLine()
//O programa pula a entrada do nome, porque o nextLine() lê apenas o Enter que estava pendente no buffer, resultando em uma string vazia.
Solução:
Sempre que você usar nextInt() e quiser ler uma linha completa depois, use um nextLine() extra para limpar o buffer:*/

public class InputExercicio {
    public static void  main(String [] args){
        Scanner ObjNumero = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = ObjNumero.nextInt(); // Lê o número, mas não consome o Enter
        ObjNumero.nextLine(); //Adicionado para limpar buffer e evitar a falha do nextLine

        System.out.print("Digite seu nome: ");
        String nome = ObjNumero.nextLine(); // Aqui ele lê o Enter que ficou no buffer

    }
}


