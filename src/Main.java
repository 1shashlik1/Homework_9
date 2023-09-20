public class Main {
    public static void main(String[] args) {
        task1();
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
        int totalExpenses = 0;
        for (int i = 0; i < arr.length; i++) {
            totalExpenses += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");
        //Задача№2
        int max = 0;
        int min = 200_000;
        for (int i = 0; i < arr.length; i++) {
            int jj = arr[i];
            if (jj > max){
                max = jj;
            }
            if (jj < min) {
                min = jj;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");
        //Задача№3
        double ff = totalExpenses / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + ff + " рублей.");
        //Задача№4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        } // Что-то я сам не врублюсь как надо из массива получить нужное число, так что пока так.
    }

}
