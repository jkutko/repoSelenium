public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

/*      int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber/secondNumber;
        int mod = secondNumber%firstNumber;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(mod);*/

        firstNumber+=secondNumber;
        System.out.println(firstNumber); //10
        firstNumber -= secondNumber;
        System.out.println(firstNumber); //4
        firstNumber *= secondNumber;
        System.out.println(firstNumber); // 24
        firstNumber /= secondNumber;
        System.out.println(firstNumber); //4
        firstNumber %= secondNumber;
        System.out.println(firstNumber); //4


    }
}
