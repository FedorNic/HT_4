/**
 * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого
 * размера необходимо бросить исключение MyArraySizeException.
 * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 * должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 * 3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
 * и MyArrayDataException и вывести результат расчета.
 */

// На сколько я понял, в пункте 3 нужно все-таки поставить "ИЛИ вывести результат расчета".

public class Main {
    public static void main(String[] args) {
        String[][] myArray = new String[][]{{"0", "1", "2", "3"}, {"0", "1", "2", "3"},
                {"0", "1", "2", "3"}, {"0", "шестьдесят два", "2", "3"}};
        // Строка для замены - шестьдесят два
        // Строка для быстрой проверки на размерность массива - {"0", "шестьдесят два", "2", "3"}
        System.out.println();
        System.out.println("Сумма чисел в массиве = " + sumArray(myArray));
    }

    public static int sumArray(String[][] array) {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверное значение в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}