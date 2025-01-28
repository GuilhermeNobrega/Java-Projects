/*public class Soma {
    int soma(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Soma somar = new Soma();
        System.out.println("Soma dos valores: " + somar.soma(10,30));
    }
}

 */
//ou

public class Soma {
    static int soma(int a, int b) {
        System.out.printf("a=%d\n", + a);
        System.out.printf("b=%d\n", + b);
        return a+b;
    }
    public static void main(String[] args) {
        //Soma somar = new Soma();
        int x = Soma.soma(10, 20);
        System.out.printf("Soma dos valores a e b =  %d ", + x);
    }
}
