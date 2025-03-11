package Vetores;
//Na stackMemoria tem:meuArray[],a e z. Na heap temos: o vetor com 4 posições.. Os valores na stack estão apontando para ele
public class ArrayExample1 {
    static void Faca(int[] z){
        int[] A = z;
        A[0] = z[4] * 10;
        A[1] = z[3] / 10;
    }
    public static void main(String[] args){
        int[] meuArray = {10,20,30,40,50};
        ArrayExample1.Faca(meuArray);
        for(int values_array: meuArray){
            System.out.println(values_array);
        }
    }
}
