/*
COSAS QUE NECESITO:
->USAR EL PROGRAMA DE HOLAMUNDO
->IMPLEMENTARLE HILOS A MANERA DE TRANSISION
->SI ES POSIBLE IMPLEMENTAR UNA INTERFAZ
 */

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class transHilo extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 13 ; i++){
            try {
                Thread.sleep(11000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }


}


public class practicaComic extends transHilo {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException,LineUnavailableException {
        practicaComic h1 = new practicaComic(),
                      h2 = new practicaComic(),
                      h3 = new practicaComic(),
                      h4 = new practicaComic(),
                      h5 = new practicaComic(),
                      h6 = new practicaComic(),
                      h7 = new practicaComic(),
                      h8 = new practicaComic(),
                      h9 = new practicaComic(),
                      h10 = new practicaComic(),
                      h11 = new practicaComic(),
                      h12 = new practicaComic(),
                      h13 = new practicaComic();
        

        File file = new File("Freljord-Music-League-of-Legends.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        Screen screen = new Screen();
        Dialog d = new Dialog();

        h1.start();
        clip.start();

        try {
            h1.setName("Portada");
            h1.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.showImage("ComicAshe1.png");
            h1.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h1.setPriority(MIN_PRIORITY);

        h2.start();
        try {
            h2.setName("Creadores");
            h2.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.showImage("ComicAshe2.png");
            h2.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h2.setPriority(MIN_PRIORITY);

        h3.start();
        try {
            h3.setName("Hoja1");
            h3.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("\n");
            screen.showImage("ComicAshe3.png");
            h3.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h3.setPriority(MIN_PRIORITY);

        h4.start();
        try {

            h4.setName("Hoja2");
            h4.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("\n");
            screen.showImage("ComicAshe4.png");
            h4.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h4.setPriority(MIN_PRIORITY);

        h5.start();
        try {
            h5.setName("Hoja3");
            h5.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("\n");
            screen.showImage("ComicAshe5.png");
            h5.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h5.setPriority(MIN_PRIORITY);

        h6.start();
        try {
            h6.setName("Hoja4");
            h6.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("\n");
            screen.showImage("ComicAshe6.png");
            h6.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h6.setPriority(MIN_PRIORITY);

        h7.start();
        try {
            h7.setName("Hoja5");
            h7.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("\n");
            screen.showImage("ComicAshe7.png");
            h7.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h7.setPriority(MIN_PRIORITY);

        h8.start();
        try {
            h8.setName("Hoja6");
            h8.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("\n");
            screen.showImage("ComicAshe8.png");
            h8.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h8.setPriority(MIN_PRIORITY);

        h9.start();
        try {
            h9.setName("Hoja7");
            h9.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("\n");
            screen.showImage("ComicAshe9.png");
            h9.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h9.setPriority(MIN_PRIORITY);

        h10.start();
        try {

            h10.setName("Hoja8");
            h10.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("\n");
            screen.showImage("ComicAshe10.png");
            h10.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h10.setPriority(MIN_PRIORITY);

        h11.start();
        try {
            h11.setName("Hoja9");
            h11.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("\n");
            screen.showImage("ComicAshe11.png");
            h11.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h11.setPriority(MIN_PRIORITY);

        h12.start();
        try {
            h12.setName("Hoja10");
            h12.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("\n");
            screen.showImage("ComicAshe12.png");
            h12.join(11000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h12.setPriority(MIN_PRIORITY);

        h13.start();
        try {
            h13.setName("Hoja11");
            h13.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("\n");
            screen.showImage("ComicAshe13.png");
            h13.join(11000);
            screen.cls();
            screen.out("Fin del Comic","Helvetica", 50 , Colors.BLUE);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        h13.setPriority(MIN_PRIORITY);
        clip.close();

    }
}




/*NOTA:
* SE OCUPO LA LIBRERIA "INMOSH" DE LA SHERPA "FERNANDA OROZCO" LA CUAL PRESENTA UN FALLO AL MANDARLA LLAMAR
* LO QUE NOTE ES QUE SOLO FUNCIONA EN PROGRAMAS QUE SE ENCUENTRAN EN LA RAIZ DE SCR
* NO SE A QUE SE DEBA */