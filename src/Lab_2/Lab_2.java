import java.util.Arrays;
import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //создаем объект считывающий данные из консоли

        System.out.println("Задание 1");
        String operation = scanner.nextLine(); //объект сохраняет данные из консоли в переменную
        double number1 = scanner.nextInt();
        double number2 = scanner.nextInt();
        double avg = (number1 + number2) / 2;
        System.out.println(avg);
        if(operation.equals("+")) {
            System.out.println(number1 + number2);
        }
        if(operation.equals("-")) {
            System.out.println(number1 - number2);
        }
        if(operation.equals("*")) {
            System.out.println(number1 * number2);
        }
        if(operation.equals("/")) {
            System.out.println(number1 / number2);
        }
        switch (operation) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
        }

        System.out.println("Задание 2");
        double number5 = 0;
        int sum = 0;
        while (true) {
            number5 = scanner.nextDouble();
            if(!(number5 > 0 && number5 == (int)number5)) //в бесконечном цикле проверяется введенное число, если оно неверно, то цикл повторяется, если верно, то происходит выход из цикла
            System.out.println("Данные неверны, попробуйте еще раз");
            else break;
        }
        System.out.println(number5);
        for(int i=0; i <= number5; i++) {
            sum += i;
        }
        System.out.println(number5 + "," + sum);

        int sum2 = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] words = {"первое", "второе", "третье", "четвертое", "пятое", "шестое", "седьмое", "восьмое", "девятое", "десятое"};
        for(int i=0; i < 10; i++) {
            System.out.println(words[i] + " число: " + arr[i]);
        }
        for(int i=0; i < 10; i++) {
            if(arr[i] % 2 == 0) {
                System.out.println("Четное: " + arr[i]);
            }
            else{
                sum2 += arr[i];
            }
        }
        System.out.println("Сумма нечетных: " + sum2);
        System.out.println("Задание 3");
        int[][] arr2 = {{1, 2, 3}, {4, 5 ,6}};
        int[] arr3 = new int[3];
        for(int j=0; j < 3; j++) {
                arr3[j] = arr2[0][j] + arr2[1][j];
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println(func(-5));
        System.out.println(func(5));
        System.out.println(func());


        Double number6 = (double) 0;
        Double number7 = (double) 0;
        System.out.println(number6 + "  " + number7);
        func3(1, 2, number6, number7);
        System.out.println(number6 + "  " + number7);
    }

    static public double func(double num) {
        double sum = 0;
        if(num == 0 || num < 0) {
            return 0;
        }
        else{
            for(int i=0; i <= num; i++) {
                sum += i;
            }
            return sum;
        }
    }

    static public double func() {
        return 1;
    }

    static public void func3(double n, double m, Double number6, Double number7){
        number6 = n + m;
        number7 = n * m;
    }
}
