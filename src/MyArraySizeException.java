public class MyArraySizeException {
    public void Method1() throws Exception {
        try {
            String[][] MyArray = new String[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    MyArray[i][j] = "Array";
                    System.out.print(MyArray[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            String[][] MyArray2 = new String[-4][-4];

        } catch (NegativeArraySizeException e) {
            System.out.println("Второй массив отрицательного размера. Вывести невозможно. Исключение: " + e);
        }
    }
}
