package Lab_7;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        for(int i = 0; i < word.length(); i++) {
            if(i > 0 && i < 4) {
                System.out.println(word.charAt(i));
            }
        }
        boolean flag = false;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'а') {
                flag = true;
                System.out.println("Индекс вхождения: " + i);
                break;
            }
        }
        if(!flag) {
            System.out.println("Вхождения не найдено");
        }
    }

}
