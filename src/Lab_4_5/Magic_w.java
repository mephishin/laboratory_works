package Lab_4_5;

public class Magic_w extends Weapon{
    private double buff_damage;

    public Magic_w(String name, double damage, double weight, double buff_damage, W_type w_type) {
        super(name, damage, weight, w_type);
        this.buff_damage = buff_damage;
    }

    public Magic_w() {
        this.buff_damage = 1;
    }

    public double getBuff_damage() {
        return buff_damage;
    }

    @Override
    public double getDamage() {
        return super.getDamage() + this.buff_damage;
    }

    public void setBuff_damage(double buff_damage) {
        this.buff_damage = buff_damage;
    }
}
