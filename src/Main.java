import java.util.Arrays;

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


    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма = " + sum);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 2");
        System.out.println(Arrays.toString(arr));
        int max = 0;
        int min = 200_000;
        for (int j : arr) {

            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;

            }
        }
        System.out.println("Средняя сумма трат за месяц составила " + max + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + min + " рублей");
    }




    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 3");
        System.out.println(Arrays.toString(arr));
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее = " + sum/ arr.length);
    }

    public static void task4() {
        int[] arr = generateRandomArray();
        System.out.println("Задача 4 ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1 ; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
        }



    }


}





