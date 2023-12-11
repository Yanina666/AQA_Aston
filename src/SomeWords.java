import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class SomeWords {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();    //создаем ArrayList
        Collections.addAll(list, "BMW", "Tesla", "Audi", "Mercedes", "Volvo", "Ford",
                "Mazda", "Toyota", "BMW", "Mercedes", "Volkswagen", "Dodge", "Alfa Romeo", "Nissan",
                "Lexus", "Chevrolet", "Honda", "Chevrolet", "Infinity", "Tesla");

        System.out.print("Исходный массив:\n");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        HashSet<String> uniqueAuto = new HashSet<String>();
        //Создаем HashSet, тк в него попадут только уникальные элементы
        uniqueAuto.addAll(list);
        //Добавляем в HashSet элементы из ArrayList
        System.out.println("Уникальные элементы массива:\n" + uniqueAuto);
        //Выводим эти элементы. Они уникальны

        HashMap<String, Integer> counts = new HashMap<>();
        //С помощью HashMap считаем количество
        Integer counter = null;
        for (String i:list) {
            counter = counts.get(i);
            counts.put(i, counter == null ? 1: counter + 1);
        }

        System.out.println("Какое количество раз встречается каждый элемент в списке:\n" + counts);
    }
}
