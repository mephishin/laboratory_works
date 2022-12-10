package Lab_7;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class third {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        int radius = scanner.nextInt();
//        double length = 2 * Math.PI * radius;
//        System.out.println("Длина окружности до округления равна: " + length);
//        System.out.printf("Длина окружности округленная до 3-х знаков равна: %.3f %n", length);

        int i;
        FileInputStream fileIn;
        FileOutputStream fileOut;
        try{
            while(true) {
                System.out.println("Команды: write, read, erase, exit");
                String word = scanner.nextLine();
                if(word.equals("read")) {
                    fileIn = new FileInputStream("C://Users//epish//IdeaProjects//laboratory_works//src//Lab_7//note.txt");
                    do {
                        i = fileIn.read();
                        if( i != -1) System.out.print((char) i);
                    }
                    while (i != -1);
                    System.out.print("\n");
                    fileIn.close();
                }
                if(word.equals("write")) {
                    System.out.println("Введите строку, которую хотите записать в файл");
                    String wordOut = scanner.nextLine();
                    fileOut = new FileOutputStream("C://Users//epish//IdeaProjects//laboratory_works//src//Lab_7//note.txt", true);
                    fileOut.write(wordOut.getBytes(StandardCharsets.UTF_8));
                    fileOut.close();
                }
                if(word.equals("erase")) {
                    fileOut = new FileOutputStream("C://Users//epish//IdeaProjects//laboratory_works//src//Lab_7//note.txt", false);
                    fileOut.write("".getBytes(StandardCharsets.UTF_8));
                    fileOut.close();
                }
                if(word.equals("exit")) {
                    break;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не удается открыть файл");
        }

    }
}
