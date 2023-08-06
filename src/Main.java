
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        System.out.println("Задача 1");
        int[] spending = generateRandomArray();
        int spendingIsMonth = 0;
        for (int i = 0; i < spending.length; i++) {
            spendingIsMonth += spending[i];
        }
            System.out.println("Сумма трат за месяц составила " + spendingIsMonth + " рублей");

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] spending = generateRandomArray();
        int maxSpending = 0;
        int minSpending = spending[0];
        for (int i : spending) {
            if (i > maxSpending) {
                maxSpending = i;
            }
            if (i < minSpending) {
                minSpending = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей");

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] spending = generateRandomArray();
        int spendingIsMonth = 0;
        float averageSpending = 0;
        int day = spending.length;
        for (int i : spending) {
            spendingIsMonth += i;
            averageSpending = (float) spendingIsMonth / day;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей");

    }

    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}