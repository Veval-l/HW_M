import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();


    }
    static public void task1() {
        /**
         Объявите три массива:
         - Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
         - Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
         - Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
         */
        System.out.println("Задача 1");

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println(Arrays.toString(array1));

        double[] array2 = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(array2));

        char[] array3 = new char[4];
        array3[0] = 'G';
        array3[1] = 'o';
        array3[2] = 'o';
        array3[3] = 'd';
        System.out.println(Arrays.toString(array3));

        System.out.println( );
    }
    public static void task2() {
        /**
         - Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
         */
        System.out.println("Задача 2");

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println(array1[0] + ", " + array1[1] + ", " + array1[2]);

        double[] array2 = {1.57, 7.654, 9.986};
        System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);

        char[] array3 = new char[4];
        array3[0] = 'G';
        array3[1] = 'o';
        array3[2] = 'o';
        array3[3] = 'd';
        System.out.println(array3[0] + ", " + array3[1] + ", " + array3[2] + ", " + array3[3]);

        System.out.println( );
    }
    static public void task3() {
        /**
         Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
         */
        System.out.println("Задача 3");

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.println(array1[2] + ", " + array1[1] + ", " + array1[0]);

        double[] array2 = {1.57, 7.654, 9.986};
        System.out.println(array2[2] + ", " + array2[1] + ", " + array2[0]);

        char[] array3 = new char[4];
        array3[0] = 'G';
        array3[1] = 'o';
        array3[2] = 'o';
        array3[3] = 'd';
        System.out.println(array3[3] + ", " + array3[2] + ", " + array3[1] + ", " + array3[0]);

        System.out.println( );
    }
    public static void task4() {
        /**
         Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
         */
        System.out.println("Задача 4");

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}