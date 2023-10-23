import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a value for x:");
        int value = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("Enter a value for y:");
        int value1 = x.nextInt();
        String soma = String.format("The sum of %d and %d is %d",value,value1,value+value1);
        //System.out.printf("Number x+y is: %d ",value+value1);
        System.out.println(soma);
    }
}
//----------------------------

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a value for x:");
        int value = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.println("Enter a value for y:");
        int value1 = x.nextInt();
        String soma = String.format("The sum of %d and %d is %d",value,value1,value+value1);
        //System.out.println("Number x+y is: %d ",value+value1);
        System.out.println(soma);
    }
}


Scanner scanner = new Scanner(System.in);
System.out.println("Enter a value for x:");
int value = Integer.parseInt(scanner.nextLine());
System.out.println("Enter a value for y:");
int value1 = Integer.parseInt(scanner.nextLine());
int sum = value + value1;
System.out.printf("The sum of %d and %d is %d\n", value, value1, sum);



//--
String numberStr = "42";
int number = Integer.parseInt(numberStr);


//

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a value for x:");
        String value = x.nextLine();
        Scanner y = new Scanner(System.in);
        System.out.println("Enter a value for y:");
        String value1 = x.nextLine();
        System.out.println("Union of x and y is " + x+y);
    }
//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a value for x:");
        int value = scanner.nextInt();
        
        System.out.println("Enter a value for y:");
        int value1 = scanner.nextInt();
        
        String result = "Union of x and y is " + value + value1;
        
        System.out.println(result);
    }
}




//-------
import java.io.LineNumberInputStream;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner valor1 = new Scanner(System.in);
        System.out.printf("Say you value to me: ");
        int x = valor1.nextInt();
        Scanner valor2 = new Scanner(System.in);
        System.out.printf("Say other value to me: ");
        int y = valor2.nextInt();
        int soma = x+y;
        System.out.printf(" The sum of %d and %d is : %d%n",x,y,soma);
        Scanner z = new Scanner(System.in);
        System.out.println("And now say a string");
        String texto = z.nextLine();
        int tamanho = texto.length();
        System.out.printf("The lenght of %s is %d%n",texto,tamanho);

    }
}

