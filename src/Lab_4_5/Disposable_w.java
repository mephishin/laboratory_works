package Lab_4_5;

public class Disposable_w extends Weapon{
    private boolean used;

    public Disposable_w(String name, double damage, double weight, W_type w_type, boolean used) {
        super(name, damage, weight, w_type);
        this.used = used;
    }

    @Override
    public void attack() {
        if(used) System.out.println("Оружие уже было использвано");
        else{
            this.used = true;
            System.out.println("Атакуем одноразовым оружием");
        }
    }



}
