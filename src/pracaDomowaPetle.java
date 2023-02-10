public class pracaDomowaPetle {

    /*
    * wypisać liczby z zakresu 1-100 podzielne przez 3
    **/

  /*  public static void main(String[] args) {

        for (int i=1; i<100; i++) {
            if (i%3==0)
                System.out.println("Jestem podzielna przez 3 : " + i);
        }
    }*/

    /*
    * odwrócenie elementow tablicy [1,3,5,7,0] -> [0,7,5,3,1]
    */

    public static void main(String[] args) {

        int[] numbers = new int[] {1,3,5,7,0};

        for (int i=0; i<(numbers.length/2); i++) {
            int temp = numbers[i];  // dla i =0 to 1 // dla i = 1 to 3 // dla i = 3 to 7
            numbers[i] = numbers[numbers.length-1 -i]; // 5 - 1 -0 = 4 czyli 0 // 5 - 1 - 1 = 3 czyli 7 // 5 -1 -3 = 1
            numbers[numbers.length-1-i] = temp; // 1 // numbers[3] = 3 // numbers[1] to 3
        }
        for (int i =0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
