
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;



class presHilo extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 5 ; i++){ // duracion en minutos
            for (int j = 0; j <= 60; j++ ){ //duracion en segundos
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        }

    }
}

class ImagineDragonsH extends presHilo{
    public void presentacion() throws UnsupportedAudioFileException, IOException,LineUnavailableException{

        ImagineDragonsH imagineDragonsH = new ImagineDragonsH();

        Screen screen = new Screen();
        Dialog d = new Dialog();

        File demons  = new File("Imagine Dragons - Demons.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(demons);
        Clip dimon = AudioSystem.getClip();
        dimon.open(audioInputStream);


        imagineDragonsH.start();
        dimon.start();
        try {
            imagineDragonsH.setName("ImagineDragons");
            imagineDragonsH.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("Imagine Dragons\n","Helvetica", 30 , Colors.BLUE);
            imagineDragonsH.join( 3000);
            screen.out("Demons\n","Helvetica", 25 , Colors.MAGENTA);
            imagineDragonsH.join( 10000);
            screen.showImage("SSImagineDragons1.png");
            imagineDragonsH.join( 10000);
            screen.cls();
            screen.out("Imagine Dragons\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Demons\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSImagineDragons2.png");
            imagineDragonsH.join( 12000);
            screen.cls();
            screen.out("Imagine Dragons\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Demons\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSImagineDragons3.png");
            imagineDragonsH.join( 21000);
            screen.cls();
            screen.out("Imagine Dragons\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Demons\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSImagineDragons4.png");
            imagineDragonsH.join( 21000);
            screen.cls();
            screen.out("Imagine Dragons\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Demons\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSImagineDragons2.png");
            imagineDragonsH.join( 21000);
            screen.cls();
            screen.out("Imagine Dragons\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Demons\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSImagineDragons1.png");
            imagineDragonsH.join( 23000);
            screen.cls();
            screen.out("Imagine Dragons\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Demons\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSImagineDragons4.png");
            imagineDragonsH.join( 22500);
            screen.cls();
            screen.out("Imagine Dragons\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Demons\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSImagineDragons5.png");
            imagineDragonsH.join( 20000);
            screen.cls();
            screen.out("Imagine Dragons\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Demons\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSImagineDragons4.png");
            imagineDragonsH.join( 25000);
            screen.cls();
            screen.out("Imagine Dragons\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Demons\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSImagineDragons6.png");
            imagineDragonsH.join( 41000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        imagineDragonsH.setPriority(MIN_PRIORITY);
        dimon.close();
        screen.setVisible(false);

    }
}


class Maroon5 extends presHilo{
    public void presentacion() throws UnsupportedAudioFileException, IOException,LineUnavailableException{

        Maroon5 maroon5 = new Maroon5();

        Screen screen = new Screen();
        Dialog d = new Dialog();

        File animal  = new File("Maroon-5-Animals-_Lyrics_.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(animal);
        Clip animals = AudioSystem.getClip();
        animals.open(audioInputStream);


        maroon5.start();
        animals.start();
        try {
            maroon5.setName("Maroon5");
            maroon5.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("Maroon Five\n","Helvetica", 30 , Colors.BLUE);
            maroon5.join( 3000);
            screen.out("Animals\n","Helvetica", 25 , Colors.MAGENTA);
            maroon5.join( 3500);
            screen.showImage("SSMaroonFive1.png");
            maroon5.join( 15500);
            screen.cls();
            screen.out("Maroon Five\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Animals\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSMaroonFive2.png");
            maroon5.join( 19000);
            screen.cls();
            screen.out("Maroon Five\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Animals\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSMaroonFive3.png");
            maroon5.join( 21500);
            screen.cls();
            screen.out("Maroon Five\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Animals\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSMaroonFive4.png");
            maroon5.join( 21000);
            screen.cls();
            screen.out("Maroon Five\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Animals\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSMaroonFive2.png");
            maroon5.join( 18500);
            screen.cls();
            screen.out("Maroon Five\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Animals\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSMaroonFive3.png");
            maroon5.join( 20500);
            screen.cls();
            screen.out("Maroon Five\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Animals\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSMaroonFive1.png");
            maroon5.join( 20500);
            screen.cls();
            screen.out("Maroon Five\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Animals\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSMaroonFive5.png");
            maroon5.join( 20000);
            screen.cls();
            screen.out("Maroon Five\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Animals\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSMaroonFive6.png");
            maroon5.join( 21000);
            screen.cls();
            screen.out("Maroon Five\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Animals\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSMaroonFive4.png");
            maroon5.join( 23000);
            screen.cls();
            screen.out("Maroon Five\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Animals\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSMaroonFive5.png");
            maroon5.join( 25000);
            screen.cls();

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        maroon5.setPriority(MIN_PRIORITY);
        animals.close();
        screen.setVisible(false);

    }
}


class Coldplay extends presHilo{
    public void presentacion() throws UnsupportedAudioFileException, IOException,LineUnavailableException{

        Coldplay coldplay = new Coldplay();

        Screen screen = new Screen();
        Dialog d = new Dialog();

        File SJLT  = new File("The-Chainsmokers-_-Coldplay-Something-Just-Like-This-_Lyric_.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(SJLT);
        Clip sjlt = AudioSystem.getClip();
        sjlt.open(audioInputStream);


        coldplay.start();
        sjlt.start();
        try {
            coldplay.setName("Coldplay");
            coldplay.setPriority(MAX_PRIORITY);
            screen.setVisible(true);
            screen.out("Coldplay\n","Helvetica", 30 , Colors.BLUE);
            coldplay.join( 3000);
            screen.out("Something Just Like This\n","Helvetica", 25 , Colors.MAGENTA);
            coldplay.join( 5500);
            screen.showImage("SSColplay1.png");
            coldplay.join( 19500);
            screen.cls();
            screen.out("Coldplay\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Something Just Like This\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSColplay7.png");
            coldplay.join( 38000);
            screen.cls();
            screen.out("Coldplay\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Something Just Like This\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSColplay2.png");
            coldplay.join( 16500);
            screen.cls();
            screen.out("Coldplay\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Something Just Like This\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSColplay4.png");
            coldplay.join( 19500);
            screen.cls();
            screen.out("Coldplay\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Something Just Like This\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSColplay5.png");
            coldplay.join( 20500);
            screen.cls();
            screen.out("Coldplay\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Something Just Like This\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSColplay2.png");
            coldplay.join( 35000);
            screen.cls();
            screen.out("Coldplay\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Something Just Like This\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSColplay4.png");
            coldplay.join( 21000);
            screen.cls();
            screen.out("Coldplay\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Something Just Like This\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSColplay2.png");
            coldplay.join( 54500);
            screen.cls();
            screen.out("Coldplay\n","Helvetica", 30 , Colors.BLUE);
            screen.out("Something Just Like This\n","Helvetica", 25 , Colors.MAGENTA);
            screen.showImage("SSColplay5.png");
            coldplay.join( 13000);
            screen.cls();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        coldplay.setPriority(MIN_PRIORITY);
        sjlt.close();
        screen.setVisible(false);

    }
}


public class practicaLineUp extends presHilo {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException,LineUnavailableException {
        ImagineDragonsH imgD = new ImagineDragonsH();
        Maroon5 maroon5 = new Maroon5();
        Coldplay coldplay = new Coldplay();

        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        str  = d.readString("¿Quien hara el acto de apertura?");
        if(str.charAt(0) == 'C' || str.charAt(0) == 'c'){
            coldplay.presentacion();
            maroon5.presentacion();
            imgD.presentacion();
        }else if(str.charAt(0) == 'M' || str.charAt(0) == 'm'){
            maroon5.presentacion();
            imgD.presentacion();
            coldplay.presentacion();
        }else if(str.charAt(0) == 'I' || str.charAt(0) == 'i'){
            imgD.presentacion();
            maroon5.presentacion();
            coldplay.presentacion();
        }else{
            screen.out("Caracter incorrecto vuelva a intentarlo\n","Helvetica", 30 , Colors.BLUE);
        }









    }
}
