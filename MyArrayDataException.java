public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String message) {
        System.out.println(("Значение не может быть преобразовано в число. " + message));
    }
}