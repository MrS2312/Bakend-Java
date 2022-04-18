package semana3;

import semana1.Bicicleta;

public class pruebaMagos {
    public static void main(String[] args) {
        datosHarry();
        datosSnape();
        datosLili();
        datosRon();
        datosHermione();
    }

    public static void datosHarry() {
        practicaHarry magoHarry = new practicaHarry();
        magoHarry.setNombre("Harry Potter");
        magoHarry.setGenero("M");
        magoHarry.setCasa("Grifindor");
        magoHarry.setBoggart("Voldemort");
        magoHarry.setPatronnus("Venado");

        String msg = "Soy Harry Potter y estos son mis datos: ";
        msg += magoHarry.datosMagos();

        System.out.print(msg);

    }

    public static void datosSnape() {
        practicaHarry magoSnape = new practicaHarry();
        magoSnape.setNombre("Severus Snape");
        magoSnape.setGenero("M");
        magoSnape.setCasa("Slitherin");
        magoSnape.setBoggart("Muerte Lili");
        magoSnape.setPatronnus("Venado");

        String msg = "\n\nSoy Severus Snape y estos son mis datos: ";
        msg += magoSnape.datosMagos();

        System.out.print(msg);

    }

    public static void datosLili() {
        practicaHarry magoLili = new practicaHarry();
        magoLili.setNombre("Lily J. Potter");
        magoLili.setGenero("F");
        magoLili.setCasa("Grifindor");
        magoLili.setBoggart("Lord Voldemort");
        magoLili.setPatronnus("Cierva");

        String msg = "\n\nSoy Lily J. Potter y estos son mis datos: ";
        msg += magoLili.datosMagos();

        System.out.print(msg);

    }

    public static void datosRon() {
        practicaHarry magoRon = new practicaHarry();
        magoRon.setNombre("Ronald Weasley");
        magoRon.setGenero("M");
        magoRon.setCasa("Grifindor");
        magoRon.setBoggart("Arañas");
        magoRon.setPatronnus("Jack Russell Terrier");

        String msg = "\n\nSoy Ronald Weasly y estos son mis datos: ";
        msg += magoRon.datosMagos();

        System.out.print(msg);

    }

    public static void datosHermione() {
        practicaHarry magoHermione = new practicaHarry();
        magoHermione.setNombre("Hermione Granger");
        magoHermione.setGenero("F");
        magoHermione.setCasa("Grifindor");
        magoHermione.setBoggart("Fracaso");
        magoHermione.setPatronnus("Nutria");

        String msg = "\n\nSoy Hermione Granger y estos son mis datos: ";
        msg += magoHermione.datosMagos();

        System.out.print(msg);

    }
}
