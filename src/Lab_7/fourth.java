package Lab_7;

import java.util.ArrayList;
import Lab_7.settings.*;

import static Lab_7.settings.*;

public class fourth {
    public static void main(String[] args) {
        ArrayList<Float> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            float a = (float) Math.random();
            list.add(a);
        }
        System.out.println(list);

        list.add(3, 0.65f);
        System.out.println(list);
        list.remove( list.size() - 1);
        System.out.println(list);

        add(1, "Bebra");
        print();
        add(2, "Bobra");
        System.out.println(take(1));
        System.out.println(take(2));

    }
}
