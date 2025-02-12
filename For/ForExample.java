package For;

/*public class Loop {
    public void questao(){
    }
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i < 10; i++) {
            contador=i;
            System.out.println("Contador vale = " + contador);
            System.out.println(i);
        }
    }
}

public class For.ForExample {
    public static int loop(){
        int a = 1;
        return a;
    }
    public static void main(String[] args) {
        int valor = loop();
        for(int y =10;valor<10;valor++,y--){
            System.out.printf("valor = %d\n", valor);
            System.out.printf("valor Y = %d\n", y);
        }
    }
}
*/
public class ForExample{
    public static void main(String[] args){
        String[] nomes= {"Titio", "Orelhana", "Papai"};
        System.out.println("Elementos do array:");
        for(int contador = 0; contador <nomes.length;contador++){
            System.out.printf("Nome na posição [%d]: %s\n", contador, nomes[contador]);
        }
    }
}

/*
public class For.ForExample{
    public static void main(String[] args){
        String[] nomes= {"Titio", "Orelhana", "Papai"};
        System.out.println("Elementos do array:");
        for(String nome: nomes){
            System.out.println(nome);
        }
    }
}
*/