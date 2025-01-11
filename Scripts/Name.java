class Name{
    static String teste(){
        String name = "G "; //Um espaço para nao deixar os nomes juntos
        String name_two = "Gg ";
        byte idade = 21;
        String fullname = name+name_two+idade;
        //System.out.println(fullname);
        return fullname;}
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Nome e idade do usuário: " + Name.teste());
    }
    
}
