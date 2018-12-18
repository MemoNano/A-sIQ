public class Test {

    int pollIntervallMs;
    int fileSizeGb;

    /*
    The method calculates fibonacci numbers
    @param number1 int

    return
     */
    public static int findFibonacci(int inputNumber) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        while (num3 < inputNumber) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            if (num3 == inputNumber) {
                System.out.println("Number belongs to fibonacci");
            } else {
                System.out.println("Number doesn't belong to fibonacci");
            }
        }

        return 0;


    }
}
