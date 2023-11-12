public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(checkSum(5, 6));
        positiveOrNegative(0);
        System.out.println(checkPositiveOrNegative(8));
        printString("Yanina");
        System.out.println(checkYear(2024));
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("This is a positive number");
        } else {
            System.out.println("This is a negative number");
        }
    }

    public static boolean checkPositiveOrNegative(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printString(String name) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi"+"," + ""+ name + "!");
        }
    }

    public static boolean checkYear(int a){
        if(a % 4 == 0 && a % 100 !=0 || a % 400 ==0){
            return true;
        } else {
            return false;
        }
}
}
