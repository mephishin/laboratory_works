package Lab_6;

import java.util.Scanner;

public class Exception_test {
    public static void main(String[] args) throws Error{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой год рождения");
        while(true) {
                int x = Integer.parseInt(scanner.nextLine());

                if(x < 0) {
                    throw new Error(Errors_type.NEGATIVENUMBERERROR);
                }
                else if(x > 2022) {
                    throw new Error(Errors_type.LATEDATEERROR);
                }
                else if(x < 1850) {
                    throw new Error(Errors_type.EARLYDATEERROR);
                }
                else{
                    System.out.println("Спасибо");
                    break;
                    }
            }
        System.out.println("Введите числа 1, 2 или 3");
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 1 & x != 2 & x != 3) {
                throw new Error(Errors_type.BASICERROR);
            }
            else{
                if(x == 1) {
                    System.out.println("Один");
                }
                if(x == 2) {
                    System.out.println("Два");
                }
                if(x == 3) {
                    System.out.println("Три");
                }
            }
        }
        }
    }

