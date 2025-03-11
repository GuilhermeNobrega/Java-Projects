package Vetores;
import java.util.Scanner; //importando classe Scanner para leitura de dados
public class VetorExercicio2 {
    public static void main (String[] args){
        //String[] Objetos={"Caderno", "PC", "Caixa magica"}; definindo valores pertencentes objeto vetor
        String[] Objetos; //declarando variavel objeto objetos vetor
        Objetos = new String[4]; // Alocando dinamicamente os futuros valores;
        for(int x =0; x<Objetos.length;x++) {
            Scanner obj_array = new Scanner(System.in); //Criação objeto da classe Scanner e associa entrada padrão sistema
            System.out.println("Digite um nome de objeto para salvar no array:"); //new cria nova instancia de objeto
            Objetos[x] = obj_array.nextLine(); //Salvando o valor lido na posição x do vetor; nextLine le linha escrita do user
        }
        System.out.println("Valores presentes no array Objeto: ");
        for(String y: Objetos){
            System.out.println(y);
        }
    }
}
