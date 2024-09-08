import java.util.Scanner;
public class Main {

    // Задание 1: Проверка четности/нечетности числа
    public static void checkEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " - Even number");
        } else {
            System.out.println(number + " - Odd number");
        }
    }

    // Задание 2: Сумма или произведение трех чисел
    public static void sumOrProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа:");
        System.out.print("Число 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Число 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Число 3: ");
        int num3 = scanner.nextInt();

        System.out.print("Введите 1 для суммы или 2 для произведения: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            int sum = num1 + num2 + num3;
            System.out.println("Сумма = " + sum);
        } else if (choice == 2) {
            int product = num1 * num2 * num3;
            System.out.println("Произведение = " + product);
        } else {
            System.out.println("Некорректный выбор");
        }
    }

    // Задание 3: Максимум, минимум или среднее арифметическое трех чисел
    public static void maxMinAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа:");
        System.out.print("Число 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Число 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Число 3: ");
        int num3 = scanner.nextInt();

        System.out.print("Введите 1 для максимума, 2 для минимума или 3 для среднего арифметического: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            int max = Math.max(num1, Math.max(num2, num3));
            System.out.println("Максимум = " + max);
        } else if (choice == 2) {
            int min = Math.min(num1, Math.min(num2, num3));
            System.out.println("Минимум = " + min);
        } else if (choice == 3) {
            double average = (num1 + num2 + num3) / 3.0;
            System.out.println("Среднее арифметическое = " + average);
        } else {
            System.out.println("Некорректный выбор");
        }
    }

    // Задание 4: Перевод метров в мили, дюймы или ярды
    public static void convertMeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество метров: ");
        double meters = scanner.nextDouble();

        System.out.print("Выберите перевод: 1 - мили, 2 - дюймы, 3 - ярды: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            double miles = meters * 0.000621371;
            System.out.println("Мили = " + miles);
        } else if (choice == 2) {
            double inches = meters * 39.3701;
            System.out.println("Дюймы = " + inches);
        } else if (choice == 3) {
            double yards = meters * 1.09361;
            System.out.println("Ярды = " + yards);
        } else {
            System.out.println("Некорректный выбор");
        }
    }

    // Задание 5: Приветствие в зависимости от времени
    public static void greetByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество часов (0-23): ");
        int hours = scanner.nextInt();

        if (hours >= 0 && hours < 6) {
            System.out.println("Good Night");
        } else if (hours >= 6 && hours < 13) {
            System.out.println("Good Morning");
        } else if (hours >= 13 && hours < 17) {
            System.out.println("Good Day");
        } else if (hours >= 17 && hours < 24) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Некорректное значение. Введите часы от 0 до 23.");
        }
    }

    public static void main(String[] args) {
        // Запуск всех задач в программе
        checkEvenOdd();
        sumOrProduct();
        maxMinAverage();
        convertMeters();
        greetByTime();
    }
}