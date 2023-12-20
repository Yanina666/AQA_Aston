public class Main {
    public static void main(String[] args) {
        Box<Orange> boxOfOranges = new Box<>(new Orange(),2);
        Box<Orange> boxOfOranges2 = new Box<>();
        Box<Apple> boxOfApples = new Box<>(new Apple(),3);
        Box<Apple> boxOfApples2 = new Box<>();
        System.out.println(boxOfOranges.compare(boxOfApples)); //сравниваю коробки с яблоками и апельсинами
        System.out.println(boxOfApples2.compare(boxOfApples));//сравнила коробки с яблоками
        System.out.println(boxOfOranges.compare(boxOfOranges2));//сравнила коробки с апельсинами
        boxOfOranges.pourInto(boxOfOranges2); //пересыпали апельсины в апельсины
        System.out.println(boxOfOranges2.getWeight());
    }
    }
