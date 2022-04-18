package semana3;

public class practicaHarry {
//-----------------DEFINIMOS LAS VARIABLES DE NUESTRO POJO--------------------

   public String genero, nombre, casa, boggart, patronnus;

//----------------DEFINIMOS LOS GETTERS (LO QUE SE OBTIENE)-------------------

    public String getGenero(){  return genero;  }
    public String getNombre(){  return nombre;  }
    public String getCasa(){  return casa;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronnus(){  return patronnus;  }

//--------------DEFINIMOS LOS SETTERS (LO QUE DA EL USUARIO)------------------

    public boolean setGenero(String genero){
        String gender;
        if (genero == "M"){
            gender = "MASCULINO";
            this.genero = gender;
            return  true;
        }
        if (genero == "F") {
            gender = "FEMENIMO";
            this.genero = gender;
            return true;
        }else
            return false;

    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setCasa(String casa){

        if (casa == "Grifindor"){
            this.casa = casa;
            return  true;
        }
        if (casa == "Slitherin") {
            this.casa = casa;
            return true;
        }
        if (casa == "Huffelpuff"){
            this.casa = casa;
            return true;
        }
        if (casa == "Ravenclaw"){
            this.casa = casa;
            return true;
        }
        else
            return false;
    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronnus(String patronnus){
        if (!patronnus.isEmpty()){
            this.patronnus = patronnus;
            return true;
        }else
            return false;
    }

//----------------------IMPRIMIMOS LOS DATOS PROPORCIONADOS--------------------------

    public String datosMagos(){
        return "\n"+ "Nombre: " +nombre+ "\n"+
               "Genero: " +genero+ "\n"+
               "Casa: "   +casa+ "\n"+
               "Boggart: " +boggart+ "\n"+
               "Patronus: " +patronnus;
    }

}
