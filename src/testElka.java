import org.junit.Test;

import java.sql.SQLOutput;

public class testElka {

    @Test
    public void exampleMetody(){
        double polePierwsze = ObliczPoleKwadratu(2,3);
        double jeden = 2;
        double dwa = 3;
        double pole = jeden * dwa;

        String tekst = "Liczba " +jeden +" i " +dwa + " oraz pole " + pole;
        System.out.println(tekst);
        System.out.println(polePierwsze);
        wypiszKoniec("tekst na koniec");


    }
    //metody
    double ObliczPoleKwadratu(double pierwszaPodstawa, double drugaPodstawa) {
        double poleKwadratu = (pierwszaPodstawa * drugaPodstawa);
         return poleKwadratu;
    }

    void wypiszKoniec(String tekst) {
        System.out.println(tekst);
    }
}
