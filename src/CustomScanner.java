import java.util.Scanner;

public class CustomScanner {

    public static void main(String[] args) {

 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię ");
        String name = scanner.nextLine();
        System.out.println(" Hello " + name + " !");*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int liczba = scanner.nextInt();
        liczba =liczba*liczba;
        System.out.println(" Kwadrat " + liczba );

    }
}
