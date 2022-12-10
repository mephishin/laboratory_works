package Lab_4_5;

public class Player {
    private int id;
    private String login;
    private String password;

    public Player(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public void info() {
        System.out.println(this.id + " " + this.login + " " + this.password);
    }
}
