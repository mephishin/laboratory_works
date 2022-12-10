package Lab_4_5;

abstract public class Weapon {
    private String name;
    private double damage;
    private double weight;
    private W_type w_type;

    Weapon(String name, double damage, double weight, W_type w_type) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.w_type = w_type;
    }

    Weapon() {
        this("Weapon", 1, 1, W_type.ONEHANDED);
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", weight=" + weight +
                ", w_type=" + w_type +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public W_type getW_type() {
        return w_type;
    }

    public void setW_type(W_type w_type) {
        this.w_type = w_type;
    }

    public boolean max_weight(double max_weight) {
        return !(this.weight > max_weight);
    }

    public double sum_weight(Weapon weapon) {
        return (sum_weight(weapon.weight));
    }

    public double sum_weight(double weight) {
        return (this.weight + weight);
    }

    public void attack() {
        System.out.println("Аттакуем магическим оружием");
    }



}
