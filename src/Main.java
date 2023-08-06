import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1.1. С использованием цикла и переменной:");
        double sumElements = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            sumElements = sumElements + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumElements + " рублей");
    }
    public static void task2 () {
        System.out.println("Задача 1.2. С использованием метода Arrays.stream(arr).sum():");
        int[] arr = generateRandomArray();
        double sumElements = Arrays.stream(arr).sum();
        System.out.println("Сумма трат за месяц составила " + sumElements + " рублей");
    }

    public static void task3 () {
        System.out.println("Задача 2.1. С использованием цикла и переменной:");
        int[] arr = generateRandomArray();
        double maximumExpenses = 0;
        double minimumExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximumExpenses && arr[i] != 0) {
                maximumExpenses = arr[i];
            } else {
                minimumExpenses = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maximumExpenses + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minimumExpenses + " рублей");
    }

    public static void task4 () {
        System.out.println("Задача 2.2. С использованием метода: Arrays.stream(arr).max().getAsInt() и Arrays.stream(arr).min().getAsInt()");
        int[] arr = generateRandomArray();
        int maximumExpenses = Arrays.stream(arr).max().getAsInt();
        int minimumExpenses = Arrays.stream(arr).min().getAsInt();
        System.out.println("Максимальная сумма трат за день составила " + maximumExpenses + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minimumExpenses + " рублей");
    }

    public static void task5 () {
        System.out.println("Задача 3.1. С использованием цикла:");
        double sumElements = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            sumElements = sumElements + arr[i];
        }
        System.out.println("Средняя сумма трат за месяц " + sumElements/arr.length + " рублей");

    }

    public static void task6 () {
        System.out.println("Задача 3.2. С использованием метода Arrays.stream(arr).average().getAsDouble():");
        int[] arr = generateRandomArray();
        double averageValue = Arrays.stream(arr).average().getAsDouble();
        System.out.println("Средняя сумма трат за месяц " + averageValue + " рублей");
    }

    public static void task7 () {
        System.out.println("Задача 4");
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i < reverseFullName.length && i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        }
    }

