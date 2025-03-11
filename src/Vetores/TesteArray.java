package Vetores;

public class TesteArray { // Evite nomear classes com nomes reservados ou comuns como "Array"
    static int vetor() {
        int[] vetor = {1, 21, 33, 45}; // mesmo valores, ultimo valor -1 [0,1,3,4,-1]
        for (int i=0; i<vetor.length-1; i++) {
            System.out.println(vetor[i]);
            //System.out.println(vetor.length);
        }
        return vetor[1]; // Retorna o valor na posição 1 do array (valor 2)
    }

    public static void main(String[] args) {
        int valor = vetor(); // Armazena o valor retornado
        System.out.println("\nO valor retornado do vetor é: " + valor); // Exibe o valor no console
        //System.out.println("Valor do vetor é " + vetor());
    }
}
