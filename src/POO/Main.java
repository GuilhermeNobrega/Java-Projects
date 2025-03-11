package POO;

class Animal {
    public void definicao(){
        System.out.println("Aqui somente animais");
    }
    public void fazerSom() {
        System.out.println("Algum som de animal...");
    }
}

class Cachorro extends Animal { //extends usando para herança
    @Override //quando uma subclasse ou uma classe que implementa uma interface está reescrevendo um método já definido na classe pai ou interface
    public void fazerSom() {
        System.out.println("O cachorro late: Au au!");
    }
}

public class Main{
    public static void main(String[] args){
        Cachorro meuDog = new Cachorro();
        meuDog.fazerSom();
        meuDog.definicao();
    }
}