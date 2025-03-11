package ExerciciosGerais;

/*public class ExerciciosGerais.Soma {
    int soma(int a, int b) {
        System.out.printf("a=%d\n", + a);
        System.out.printf("b=%d\n", + b);
        return a+b;
    }
    public static void main(String[] args) {
        //ExerciciosGerais.Soma somar = new ExerciciosGerais.Soma();
        ExerciciosGerais.Soma somar = new ExerciciosGerais.Soma();
        System.out.println(somar.soma(10, 20));
        //int x = somar.soma(10, 20);
        //System.out.printf("ExerciciosGerais.Soma dos valores a e b =  %d ", + x);
    }
}
*/
public class Soma {
    static int soma(int a, int b) {
        System.out.printf("a=%d\n", + a);
        System.out.printf("b=%d\n", + b);
        return a+b;
    }
    public static void main(String[] args) {
        //ExerciciosGerais.Soma somar = new ExerciciosGerais.Soma();
        int x = Soma.soma(10, 20);
        System.out.printf("ExerciciosGerais.Soma dos valores a e b =  %d ", + x);
    }
}