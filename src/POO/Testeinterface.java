package POO;

interface Veiculo { //Aqui definimos uma interface que tem i metodo acelerar.. posteriomente vamos dizer o que ele fará
    void acelerar(); // Toda classe que implementar Veiculo terá que definir este método.
}
//Usamos @Override quando uma subclasse ou uma classe que implementa uma interface está reescrevendo um método já definido na classe pai ou interface
class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }
}

class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }
}

public class Testeinterface {
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo minhaMoto = new Moto();

        meuCarro.acelerar(); // Funciona porque ambos são do tipo Veiculo
        minhaMoto.acelerar();
    }
}
