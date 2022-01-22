/* JAVA 1. Homework #2
 *
 * @author  OLGA OVCHINNIKOVA
 * @Version : 18.12.2021
 */

class HomeWorld {
    public static void main(String[]args) {
        System.out.println(checkSumm(8, 11));
        printPositivornegative(31);
        System.out.println(integeristrasmiied(17));
        repitWord("Failing", 6);
    }

    static boolean checkSumm(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
    static void printPositivornegative(int a) {
        System.out.println((a >= 0 ? "Positive" : "Negative"));
    }
    static boolean integeristrasmiied(int a) {
        return a < 0;
    }
    static void repitWord(String w, int x) {
        for (int a = 0; a < x; a++) {
            System.out.println(w);
        }
    }
}
/* JAVA 1. Homework #3
 *
 * @author  OLGA OVCHINNIKOVA
 * @Version : 19.12.2021
 */
class HomeWorld {
    public static void main(String[]args) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1,
        // 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на
        // 0;

        int[]digits = {
            0,
            1,
            1,
            1,
            0,
            0,
            1,
            1,
            0,
            1,
            0,
            1,
            1,
            0,
            1,
            0
        };

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                digits[i] = 1;
            } else {
                digits[i] = 0;
            }
        }

        // Вывод
        System.out.println("Задание 1");
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
        System.out.println("******************************************\n\n");

        // 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить
        // его значениями 1 2 3 4 5 6 7 8 … 100;
        int[]hArray = new int[100];

        for (int k = 0; k < 100; k++) {
            hArray[k] = k + 1;
        }

        System.out.println("Задание 2");
        // Вывод
        for (int k = 0; k < 100; k++) {
            System.out.println(hArray[k]);
        }
        System.out.println("******************************************\n\n");

        // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему
        // циклом, и числа меньшие 6 умножить на 2;

        int[]arr = {
            1,
            5,
            3,
            2,
            11,
            4,
            5,
            2,
            4,
            8,
            9,
            1
        };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и
        // столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
        // элементы единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы
        // таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        int dimensions = 10;
        int d[][] = new int[dimensions][dimensions];

        for (int i = 0; i < dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                if (i == j) {
                    d[i][j] = 1;
                }
            }
        }

        // Вывод
        System.out.println("Задание 3");
        for (int i = 0; i < dimensions; i++) {
            String s = "";
            for (int j = 0; j < dimensions; j++) {
                s = s + " " + d[i][j];
            }
            System.out.println(s);
        }
        System.out.println("******************************************\n\n");

        // 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и
        // возвращающий одномерный массив типа int длиной len, каждая ячейка которого
        // равна initialValue;
        int[]b = getArray(10, 12);

        // Вывод
        System.out.println("Задание 4");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    // к 5.
    public static int[]getArray(int len, int initialValue) {
        int[]arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

}
}