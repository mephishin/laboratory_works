package Lab_6;

public class Error extends Exception{
    public Error(Errors_type type) {
        super(type.getDescription());
    }
}
