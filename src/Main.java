public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray();
        int sum = 0;
        int counter = 0;
//1st task:
        System.out.println("1 задание. Посмотрим на сам массив:");
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            counter++;
            if (i < array.length - 1) {
                System.out.print(counter + ")" + array[i] + " ");
            } else {
                System.out.println(counter + ")" + array[i]);
            }
        }
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей");
//2nd task:
        System.out.println("2 задание:");
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день " +
                "составила " + max + " рублей.");
//3rd task:
        System.out.println("3 задание:");
        double avg = sum * 1.0 / 30;
        System.out.println(Math.ceil(avg));
//4th task:
        System.out.println("4 задание:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}