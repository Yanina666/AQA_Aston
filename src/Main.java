public class Main {
    public static void main(String[] args) throws Exception {
        try {
            MyArraySizeException method1 = new MyArraySizeException();
            MyArrayDataException method2 = new MyArrayDataException();
            method1.Method1();
            method2.Method2();
        } catch (NegativeArraySizeException e) {
            System.out.println("Второй массив отрицательного размера. Вывести невозможно. Исключение: " + e);
            e.printStackTrace();

        } catch (NumberFormatException e) {
            System.out.println("Не удалось заменить символьные элементы массива на целочисленные. Ошибка: " + e);
            e.printStackTrace();
        }
    }
}
