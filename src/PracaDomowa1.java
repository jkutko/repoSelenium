import java.util.Scanner;

public class PracaDomowa1 {

    public static void main(String[] args) {

        /*
        * Zapytaj uzytkownika o wiek
        * W przypadku gdy ma mniej niż 18 lat - informacja że nie może kupić alko.
        * Gdy ma więcej to podziękuj za zakupy
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek ");
        int wiek = scanner.nextInt();
        if (wiek<18 && wiek >= 0) {
            System.out.println("Sorry, ale nie możesz kupić alko !!");
        } else if (wiek < 0) {
            System.out.println("No sorry batory, nie udawaj !!");
        } else {
            System.out.println("Najebiemy się ;)");
        }

    }
}
