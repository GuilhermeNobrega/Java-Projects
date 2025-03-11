package Vetores;

public class ArrayExample {
    public static void main(String[] args) {
        String[] nomes = {"Jose", "Joao", "Guima"}; //Não é possível remover um elemento de um array do Java sem criar uma nova cópia do array
        //String[] nomes; //String[] nomeArray(args) sinalizar variavel objeto nomes  que vai apontar para um objeto tipo array String. VARIAVEL OBJETO
        //nomes = new String[3]; //No array do java, quando definida quant elementos, n dá para mudar isso. OBJETO TIPO ARRAY
        //nomes[0] = "john";
        //System.out.printf("Nome da posição [0] = %s", nomes[0]);
        for( String x: nomes){
            System.out.printf("Nomes presentes array: %s\n", x);
        }
    }
}
