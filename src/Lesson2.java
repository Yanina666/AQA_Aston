import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
//        System.out.println(checkSum(5, 6));
//        positiveOrNegative(0);
//        System.out.println(checkPositiveOrNegative(8));
//        printString("Yanina", 5);
//        System.out.println(checkYear(2024));
//        updateTheNumbers();
//        int[] arr1 = new int[100];
//       System.out.println(Arrays.toString(insertTheMassive(arr1)));
//        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println(Arrays.toString(multiplyTheNumbers(nums)));
        int[][] nums2 = new int[3][3];
        for(int i = 0; i <nums2.length;i++){
            System.out.println(Arrays.deepToString(yyy(nums2)));
        }
//        System.out.println(Arrays.toString(initialValue(10, 6)));
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

    public static void printString(String str, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(str);
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

    public static int[] insertTheMassive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }


    public static int[] multiplyTheNumbers(int[] nums) {
        {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 6) nums[i] *= 2;
            }
            return nums;

        }
    }

    public static int[][] yyy(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }return array;
    }




    public static int[] initialValue(int len, int initialValue){
        int[] arr = new int[len];
        for (int i= 0; i<arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}