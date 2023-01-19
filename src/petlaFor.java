import java.util.Scanner;

public class petlaFor {

    public static void main(String[] args) {

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczę do której ma wypisać wartość ");
        int liczba = scanner.nextInt();

        for (int i = 5; i <= liczba; i=i+2) {
            System.out.println(i);
        }*/

        for ( int i = 0; i<20; i++) {
            if (i%5==0) {
                System.out.println(i);
            }
        }
    }
}
