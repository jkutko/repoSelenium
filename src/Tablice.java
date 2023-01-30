import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {

/*        String[] imiona = new String[3];
        imiona[0] = "Kasia";
        imiona[1] = "Basia";
        imiona[2] = "Stasia";


        for (int i=0 ;i<imiona.length; i++ ){
            System.out.println(imiona[i]);
        }

        int[] tablica = new int[] {1,2,3,4,5,6,7};
        for (int g=0 ;g<tablica.length; g++ ){
            System.out.println(tablica[g]);
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int liczba = scanner.nextInt();
        int[] liczba1 = new int[] {liczba};

        for (int i=0 ;i<liczba1.length; i++ ){
            System.out.println(liczba1[i]);
        }
    }
}
