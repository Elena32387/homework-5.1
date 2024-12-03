import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1");

        int[] salaryArr = generateRandomArray();
        int salarySum = 0;
        for (int salary : salaryArr) {
            salarySum += salary;
        }
        System.out.println("Сумма трат за месяц составила " + salarySum + " рублей.");

        System.out.println("Задача 2");
        int [] salaryArr2 = generateRandomArray();
        int min = salaryArr [0];
        int max = salaryArr [0];
        for (int salary : salaryArr2) {
            if (salary < min) {
                min = salary;
            }

            if (salary > max) {
                max = salary;
            }
        }
            System.out.println("минимальная сумма трат "+ min+ " рублей. Максимальная сумма трат "+max+ " рублей");

            System.out.println("Задача 3");
            int [] salaryArr3 =generateRandomArray();
            int salarySum2 = 0;
            for (int salary : salaryArr3) {
                salarySum2 += salary;
            }
            double salaryAverage = (double) salarySum2/salaryArr3.length;

            System.out.println("Средняя сумма трат составила "+salaryAverage+ " рублей.");

            System.out.println("Задача 4");
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = 0; i < reverseFullName.length / 2; i++){
                char temp = reverseFullName [i];
                reverseFullName [i] = reverseFullName[reverseFullName.length -1 - i];
                reverseFullName[reverseFullName.length -1 - i] = temp;}

                System.out.println(Arrays.toString(reverseFullName));




    }

        public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100000) + 100000;
            }
            return arr;
        }}


