public class Lab_1 {
    public static void main(String[] args) { //основной метод джава, точка входа в программу
        System.out.println("Задание 1:");
        System.out.println("First string");
        System.out.println("First string \nSecond string"); // с помощью специального символа делается отступ
        System.out.println("Special symbols \\"); //экранировние

        System.out.println("Задание 2:");
        int number1 = 150;
        float number2 = (float) 15.933;
        short number3 = 250; //принимает значение от -32768 до 32767, байт не подходит так как он от -128 до 127
        System.out.println("number1" + "=" + number1);
        System.out.println("number2" + "=" + number2);
        System.out.println("number3" + "=" + number3);
        byte day = 29;
        String month = "January";
        short year = 2003;
        System.out.println("My date of birth: " + day + " of " + month + " " + year);

        final float number4 = (float) 2.3;
        final String word = "windows";
        System.out.println(number4 + " " + word);

    }
}