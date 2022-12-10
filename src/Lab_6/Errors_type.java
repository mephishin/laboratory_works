package Lab_6;

public enum Errors_type {
    BASICERROR("Неккоретное значение"), EARLYDATEERROR("Что-то не верится..."), LATEDATEERROR("Вы еще не родились"),
    NEGATIVENUMBERERROR("Вы ввели отрицательное число");

    private String description;

    Errors_type(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
