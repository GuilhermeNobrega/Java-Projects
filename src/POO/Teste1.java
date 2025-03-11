package POO;

class Galaxia {
    public void localizacao(){
        System.out.println("Estamos na via Láctea!");
    }
    public void girar(){
        System.out.println("Eu giro em torno do sol!");
    }}

class Terra extends Galaxia{
        @Override
        public void girar(){
            System.out.println("Eu sou a terra e giro em torno do sol!");
        }
    }
public class Teste1 {
    public static void main(String[] args){
        Terra meuPlaneta = new Terra();
        meuPlaneta.localizacao();
        meuPlaneta.girar();

    }
}
