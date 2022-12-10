package Lab_7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        Pattern pt = Pattern.compile("[A-Z]{1}[A-z]{1,31}");
        Matcher mt = pt.matcher(word);
        if(mt.find()) {
            System.out.println(mt.group());
        }
        else {
            System.out.println("Имя введено некорректно");
        }
        String word2 = "mdbshnakjnfns SJMDHnm hjdhfn@sakdas.asdjkakl 97878 JH*(8hdj epishin1anatoly@gmail.com jdkshjfkjnmcnjm bebra@gmail.com sakdlkma djksad jaskm ";
        Pattern pt2 = Pattern.compile("\\w{1,64}@\\w{1,256}.\\w{1,256}");
        Matcher mt2 = pt2.matcher(word2);
        while (mt2.find()) {
            System.out.println(mt2.group());
        }
    }
}
