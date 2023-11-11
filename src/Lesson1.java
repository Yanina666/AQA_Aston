public class Lesson1 {
        public static void main(String[] args){
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }

        private static void printThreeWords() {
            System.out.print("Orange \nBanana \nApple\n");
        }

        private static void checkSumSign(){
            int a;
            int b;
            a = -1;
            b = 0;
            if(a+b>=0){
                System.out.println("Сумма положительная");
            }else System.out.println("Сумма отрицательная");
        }

        private static void printColor() {
            int value = 1000;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 100) {
                System.out.println("Зеленый");
            } else {
                System.out.println("Желтый");
            }
        }

        private static void compareNumbers(){
            int a = 5;
            int b = 10;
            if(a>=b){
                System.out.println("a>=b");
            }else System.out.println("a<b");
        }
    }
