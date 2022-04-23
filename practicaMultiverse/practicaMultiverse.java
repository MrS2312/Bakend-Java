package semana3.practicaMultiverse;


//---------------->PRIMERO DEFINIREMOS AL OBJETO EN BASE A SU FUNCIONAMIENTO (HABILIDADES)<-----------------------------
interface Habilidad{
    //---------->LO QUE HACE<----------------
    void fuerza();
    void punzada();
    void trepaParedes();
}

//--------------------->AHORA IMPLEMENTAMOS UNA CLASE PADRE QUE CONTENGA ESTAS HABILIDADES<-----------------------------------

 class spiderman implements Habilidad{
    //--------->COMO LO HACE<----------------
     spiderman() {
         System.out.println("\nSe ha convocado un nuevo Spider-Man: ");
     }

    public void fuerza(){
        System.out.println("Tiene Superfuerza");
    }

    public void punzada(){
        System.out.println("Tiene el sentido Aracnido");
    }

    public void trepaParedes(){
        System.out.println("Puede adherirse a las paredes");
    }
}


//----------------->YA QUE TENEMOS LO QUE DEFINE A NUESTRO PERSONAJE CREAMOS A SUS VARIANTES<---------------------------

class spiderHam extends spiderman{
    spiderHam(){
        System.out.println("Es una araña con los poderes de un Puerco");
    }
}

class spiderMiles extends spiderman{
    spiderMiles(){
        System.out.println("Su traje es negro y se puede hacer invisible");
    }
}

class spiderGwen extends spiderman{
    spiderGwen(){
        System.out.println("Su traje es blanco y esta basado de una bailarina de Ballet");
    }
}

public class practicaMultiverse extends spiderman {
    public static void main(String[] args) {
        Habilidad spiderman1 = new spiderHam();
        Habilidad spiderman2 = new spiderMiles();
        Habilidad spiderman3 = new spiderGwen();

    }
    //NOTA: SALIO LA PRACTICA PERO NO ENTIENDO PORQUE SE ACTIVA EL CONTRUCTOR DE SPIDERMAN SI NO LO MANDO LLAMAR

}
