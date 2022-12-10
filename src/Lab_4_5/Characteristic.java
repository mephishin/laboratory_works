package Lab_4_5;

public class Characteristic {
    private double power;

    public Characteristic(double power) {
        this.power = power;
    }

    public double getDamage(Weapon weapon) {
        return (this.power + weapon.getDamage());
    }


}
