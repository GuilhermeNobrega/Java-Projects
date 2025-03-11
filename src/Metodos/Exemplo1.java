package Metodos;
//depois fazer homem macaco baleia e metodo de moviento
public class Exemplo1 {
    public void falar(){// o quando tem o void, nao temos retorno dos dados
        // static nao precisa instanciar um objeto
        System.out.println("Estou falando");
    }
    public static void main(String[] args){
        System.out.println("Humano vai falar");
        Exemplo1 exemplo = new Exemplo1();// instanciando objeto exemplo pertencente a classe Exemplo1
        exemplo.falar(); //chamando método falar da classe Exemplo1
    }
}
