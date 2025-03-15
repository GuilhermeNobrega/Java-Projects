
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




  class Pessoa{
      String nome;
      
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
		//System.out.println("Hello World");
		Pessoa nome = new Pessoa();
		nome.setName("Joao");
		nome.mostrarNome();
	}
}
