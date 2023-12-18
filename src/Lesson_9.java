
import Student.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lesson_9 {
    public static void main(String[] args) {
        System.out.println("№1");
        Random random = new Random();
        int size = 10; // Количество чисел в потоке
        IntStream randomNumbers = random
                .ints(size, 1, 30); // Диапазон чисел от 1 до 100

        // Подсчет количества четных чисел
        long countEven = randomNumbers
                .filter(n -> n % 2 == 0) // Фильтр четных чисел
                .count(); // Подсчет количества всех чисел

        System.out.println("Количество четных чисел: " + countEven);

        System.out.println("№2.1");
        List<String> collection = Arrays.asList("Highload", "High", "Load", "Highload");
        String findHigh = String.valueOf(collection.stream().filter("High"::equals).count());
        System.out.println("\"High\" встречается в колекции: " + findHigh);

        System.out.println("№2.2");
        String r = collection.stream().findFirst().orElse("0");
        System.out.println("На первом месте: " + r);

        System.out.println("№2.3");
        String q = collection.stream().reduce((first, second) -> second).orElse("0");
        System.out.println("Последний элемент: " + q);

        System.out.println("№3");
        List<String> collection1 = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        String[] sortedArray = collection1.stream() // Отсортировать по возрастанию
                .sorted(Comparator.comparingInt(s -> Integer.parseInt(s.substring(1))))
                // Добавляем в массив
                .toArray(String[]::new);
        System.out.println(Arrays.toString(sortedArray));

        //Задание №4
        System.out.println("№4");
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Student.Gender.MAN),
                new Student("Максим", 20, Student.Gender.MAN),
                new Student("Екатерина", 22, Student.Gender.WOMAN),
                new Student("Михаил", 28, Student.Gender.MAN)
        );
        System.out.println("№4.1");
        //Средний возраст студентов мужского пола
        double averageAgeOfMen = students.stream()
                .filter(student -> student.getGender() == Student.Gender.MAN)
                .mapToInt(Student::getAge)
                .average()
                .orElse(0);

        System.out.println("Средний возраст студентов мужского пола: " + averageAgeOfMen);

        System.out.println("№4.2");
        //Студенты, которым грозит получение повестки
        List<Student> studentsForArmy = students.stream()
                .filter(student -> student.getGender() == Student.Gender.MAN)
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27)
                .collect(Collectors.toList());

        System.out.println("Студенты, которым грозит получение повестки: " + studentsForArmy);

        System.out.println("№5");
        Scanner scanner = new Scanner(System.in);
        List<String> logins = new ArrayList<>();

        while (true) {
            System.out.println("Введите логин (или оставьте строку пустой для завершения):");
            String login = scanner.nextLine();

            // Проверка на пустую строку для завершения ввода
            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }

        // Вывод логинов, начинающихся на 'f'
        List<String> filterLogins = logins.stream()
                .filter(login -> login.startsWith("f"))
                .collect(Collectors.toList());

        System.out.println("Логины, начинающиеся на 'f': " + filterLogins);

    }
    }
