/*O método printf é usado para formatar a saída de acordo com um especificador de formato.
Ele permite que você insira valores formatados em uma string de saída, em que os valores são substituídos pelos marcadores de formato (como %d para inteiros e %f para números de ponto flutuante).
Você pode especificar a formatação, o número de casas decimais e outros detalhes de formatação.
Por exemplo:*/

public class Conversao{
    public static void main(String[] args){
        int valor1 = 10;
        double converter = valor1;
        System.out.printf("Valor de valor1(int) = %d%nValor de valor1(double) = %f%n",valor1,converter);
    }
}

/*No Java, printf e println são dois métodos de saída que têm finalidades diferentes:
O método println é usado para imprimir uma string no console, seguida por uma quebra de linha.
Ele é usado para exibir texto ou valores no console e, após a exibição, move o cursor para a próxima linha.
Por exemplo:*/
public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
  }
}
/*Em resumo, println é usado para imprimir texto com quebra de linha automática,
enquanto printf é usado para imprimir texto formatado com mais controle sobre o formato da saída.
printf é especialmente útil quando você deseja controlar a formatação de números, datas e outros tipos de dados na saída.*/


/*Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte*/

public class Main {
  public static void main(String[] args) {
    double myDouble = 9.78d;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
  }
}
