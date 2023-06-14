public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        System.out.println(("Размер массива не соответствует условию 4*4."));
    }
}