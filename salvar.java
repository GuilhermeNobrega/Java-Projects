
    class Pessoa{
    //public String nome;
    public void chamar(String nome){
    System.out.printf("Nome da pessoa é: %s\n" ,nome);
}
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Pessoa nome = new Pessoa();
	    nome.chamar("joao");
	}
}



    class Pessoa{
    public String nome;
    public int idade;
    public void chamar(){
    System.out.printf("Nome da pessoa é: %s\n" ,nome);
    System.out.printf("Idade do %s é: %d\n" ,nome,idade);
}
}

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Pessoa joao = new Pessoa();
		joao.idade = 21;
		joao.nome = "Joao";
	    joao.chamar();
	}
}










abstract class Galaxia {
    String location = "Via Láctea";

    // Método abstrato (não pode ter implementação na classe abstrata, apenas assinatura)
    public abstract void mostrarLocalizacao();
}

// Criando uma classe concreta que estende a classe abstrata
class Terra extends Galaxia {
    @Override
    public void mostrarLocalizacao() {
        System.out.printf("Localização: %s\n", location);
        System.out.printf("Planeta Terra está contida aqui.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe concreta (não da abstrata!)
        Terra planeta = new Terra();
        planeta.mostrarLocalizacao();  // Chama o método abstrato implementado
    }
}




 class Pessoa{
      String nome = "paulo";// variavel de instancia; será sobrescrita pelo método abixo
      void setName(String nome){
          this.nome = nome;
      }
      
       void mostrarNome() {
        System.out.println(this.nome);
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Pessoa nome = new Pessoa();
		nome.setName("Joao");
		nome.mostrarNome();
		
	}
}
