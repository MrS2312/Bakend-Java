package semana3.practicaMona;

import org.w3c.dom.ls.LSOutput;

class Mona{
    String color = "Negro";
    String orejas = "Gato";
    String colorOjos = "Cafes";
    int numOjos = 2;
    int bigotes = 4;
    int tent = 8;

    Mona(){
        System.out.println("Nueva Faseta de mona: ");
    }

    void infMona(){
        System.out.println("Color: " +color+ "\n"+
                           "Tipo de Orejas: " +orejas+ "\n"+
                           "Color de Ojos: "  +colorOjos+ "\n"+
                           "Numero de Ojos: " +numOjos+ "\n"+
                           "Numero de Bigotes: " +bigotes+ "\n"+
                           "Numero de Tentaculos: " +tent );
    }

    void faseMona(){
        System.out.println("Mona no tiene fase aun \n");
    }
}

class invMona extends Mona{
    void faseMona(){
        System.out.println("Mona es una Inventora \n");
    }
}

class jetMona extends Mona{
    void faseMona(){
        System.out.println("Mona tiene un Jet-Pack \n");
    }
}

class LuchMona extends Mona{
    void faseMona(){
        System.out.println("Mona es un Luchador \n");
    }
}

class pilotoMona extends Mona{
    void faseMona(){
        System.out.println("Mona es un Piloto \n");
    }
}

class babyMona extends Mona{
    void faseMona(){
        System.out.println("Mona es un bebe \n");
    }
}

class navMona extends Mona{
    void faseMona(){
        System.out.println("Mona es un Navegante \n");
    }
}


public class practicaMona {
    public static void main(String[] args) {
        Mona mon;
        mon = new Mona();
        mon.faseMona();

        mon = new invMona();
        mon.faseMona();
        mon = new jetMona();
        mon.faseMona();
        mon = new LuchMona();
        mon.faseMona();
        mon = new pilotoMona();
        mon.faseMona();
        mon = new babyMona();
        mon.faseMona();
        mon = new navMona();
        mon.faseMona();



    }
}
