package Lab_4_5;

import static Lab_4_5.MyMath.*;
import static Lab_4_5.W_type.*;

public class Lab_4 {
    public static void main(String[] args) {
//        Weapon weapon = new Weapon();
//        Weapon weapon1 = new Weapon("Uzi", 50, 15, ONEHANDED);
//        System.out.println(weapon + "  " + weapon1);
//        Characteristic characteristic = new Characteristic(15);
//        System.out.println(characteristic.getDamage(weapon1));

        Add(1, 5);
        Mult(2, 6);
        System.out.println(num_count());

        W_type w_type = ONEHANDED;
        switch (w_type) {
            case ONEHANDED:
                System.out.println("Одноручное оружие");
                break;
            case TWOHANDED:
                System.out.println("Двуручное оружие");
                break;
            case BOW:
                System.out.println("Лук");
                break;
            case CROSSBOW:
                System.out.println("Арбалет");
                break;
        }

        Player player = new Player(1, "Bebra", "BebraPassword");

        Magic_w magic_w = new Magic_w("Arhtur's sword", 100, 50, 1000, ONEHANDED);
        System.out.println(magic_w.getBuff_damage() + " " + magic_w.getDamage());
//        System.out.println(magic_w.sum_weight(weapon1));
        System.out.println(magic_w);
        magic_w.attack();

        Disposable_w disposable_w = new Disposable_w("disposable_w", 1, 1 , ONEHANDED, false);
        disposable_w.attack();
        disposable_w.attack();
    }
}
