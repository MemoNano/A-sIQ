public class FibonacciRunnerClass {
    public static void main(String[] args) {
//        System.out.println("The location of index"+findFibLoc(1));
//        divisionDetail(20,3);
//        findPattern(2,4);
        System.out.println("The maxCount: " + maxCount("aaabbcaa"));
    }

    public static int findFibLoc(int num) {
        // 0,1,1,2,3,5,8,13,21,29
        int returnNUm = 0;
        int number2 = 1;
        int sum = 0;
        if (num <= 0) {
            System.out.println("Invalid number!");
            return 0;
        }
        if (num == 1) {
            return 0;
        }
        for (int i = 1; i < num; i++) {
            sum = returnNUm + number2;
            returnNUm = number2;
            number2 = sum;

        }
        return num;
    }

    public static void divisionDetail(int num, int divisor) {
        int quotient = 0;
        int remainder = 0;
        while (num >= divisor) {
            num = num - divisor;
            quotient++;
        }
        remainder = num;
        System.out.println("The quotient: " + quotient + " Remainder: " + remainder);
    }

    public static int[] reverseArr(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }
        return arr2;
    }

    public static int findPattern(int num1, int num2) {

        int printNum = 0;
        for (int i = 0; i < num2; i++) {
            printNum = num1 * 2;
            num1 = printNum;
            System.out.println("Number is: " + printNum);
        }
        return printNum;
    }

    public static int maxCount(String str) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;

            }
            count = 0;
        }


        return maxCount;
    }

    public static String palindrome(String str) {
        return null;
    }

}

