package Vetores;

public class ArrayExample2 {
    public static void main(String[] args){
        String[] Linguas = {"PHP", "PYTHON", "JAVA"};
        String[] CopiaLinguas = Linguas.clone(); //clona array anterior
        CopiaLinguas[2] = "C";
        for(String values: Linguas){
            System.out.println(values);
        }
        System.out.println("------------------------");
        for(String values: CopiaLinguas){
            System.out.println(values);
        }
    }
}
