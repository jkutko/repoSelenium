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

       // podaje ilość liczb
        // podaje liczby
        // przypisuje je do tablicy
        // wypisuje je wszystkie

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile liczb ");
        int ileLiczb = scanner.nextInt();

        System.out.println(ileLiczb);

        for (int i = 0; i<ileLiczb; i++) {



        }
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę 1 ");
        int liczba = scanner.nextInt();

        System.out.println("Podaj liczbę 2 ");
        int liczba1 = scanner.nextInt();

        int[] liczbaTablica = new int[] {liczba,liczba1};

        for (int i=0 ;i<liczbaTablica.length; i++ ){
            System.out.println(liczbaTablica[i]);
        }
    }
}
