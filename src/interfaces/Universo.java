interface sistema {
    String solar();
    String galaxia();
}

public class Universo implements sistema{
    @Override // Sobrescrever os métodos presentes na interface sistema
    public String solar(){
        String name = "Sistema Solar";
        return "Estamos em: " + name;
    }
    public String galaxia(){
        String name = "Via Lactea";
        return "Dentro de: "+ name; //pode com string! com int nao dá
    }
    
    public static void localizacao(){
        String local = "Terra";
        System.out.println("Estamos no planeta: " + local);
    }
    public static int tempo(int time){
        System.out.println("Estamos no ano: " + time);
        return time;
    }
}

class Main {
    public static void main(String[] args) {
        Universo termo = new Universo();
        System.out.println(termo.galaxia());
        System.out.println(termo.solar());
        Universo.localizacao();
        Universo.tempo(2025);
        

    }
}
/* Universo
└── Superaglomerado de Laniakea
    └── Superaglomerado de Virgem
        └── Grupo Local
            └── Galáxia Via Láctea
                └── Braço de Órion (ou Braço Local)
                    └── Nuvem Interestelar Local
                        └── Sistema Solar
                            └── Planeta Terra*/
