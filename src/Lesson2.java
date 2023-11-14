import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(checkSum(5, 6));
        positiveOrNegative(0);
        System.out.println(checkPositiveOrNegative(8));
        printString("Yanina");
        System.out.println(checkYear(2024));
        updateTheNumbers();
        insertTheMassive();
        multiplyTheNumbers();
        makeDiagonal();
        System.out.println(Arrays.toString(initialValue(10, 6)));
    }

    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
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
            System.out.println("Hi" + "," + "" + name + "!");
        }
    }

    public static boolean checkYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void updateTheNumbers() {
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (nums[i] == 1) ? 0 : 1;
            }
            System.out.println("New massive:" + Arrays.toString(nums));
        }
    }

    public static void insertTheMassive() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void multiplyTheNumbers() {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 6) nums[i] *= 2;
                {
                    System.out.println(nums[i] + " ");
                }
            }
        }
    }

    public static void makeDiagonal() {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) { //идем по строкам
            for (int j = 0; j < table.length; j++) { //идем по столбцам
                table[i][i] = 1;
                System.out.print(table[i][j] + "");
            }
            System.out.println();
        }

    }

    public static int[] initialValue(int len, int initialValue){
        int[] arr = new int[len];
        for (int i= 0; i<arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}
