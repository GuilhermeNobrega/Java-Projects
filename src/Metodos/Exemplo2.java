package Metodos;

public class Exemplo2 {
        public String falar(){// o quando tem o void, nao temos retorno dos dados
            // static nao precisa instanciar um objeto
            System.out.println("Estou falando");
            return "Retorno falando";
        }
        public static void main(String[] args){
            System.out.println("Humano vai falar");
            Metodos.Exemplo2 exemplo = new Metodos.Exemplo2();// instanciando objeto exemplo pertencente a classe Exemplo1
            //exemplo.falar(); chamando método falar da classe Exemplo1
            System.out.println(exemplo.falar()); //aqui estou printando o valor retornado
        }
    }

