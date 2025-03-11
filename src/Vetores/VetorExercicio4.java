package Vetores;

public class VetorExercicio4 {
    public static void main(String[] args){
        int[] valores;
        valores = new int[5];
        for(int contador = 0; contador < valores.length;contador++){
            valores[contador] = 2* contador;
        }
        for(int valores_array: valores){
            System.out.println(valores_array);

        }
    }
}
