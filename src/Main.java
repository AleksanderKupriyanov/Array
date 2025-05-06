public class Main {
    public static void main(String[] args) {
        int[] array = {3, 4, -15, -14, 34, 6, 90, 7, -2, -45};
        int i, max = array[0], min = array[0];

        //Задание 1.
        for (i = 1; i < array.length; i++) {
            if (array[i] <= min) min = array[i];
            if (array[i] >= max) max = array[i];
        }
        System.out.println("min=" + min + " " + "max=" + max);

        //Задание 2.
        int j;
        System.out.print("Чётные числа: ");
        for (i = 0; i < array.length; i++) {
            j = array[i] % 2;
            if (j == 0) System.out.print(array[i] + " ");
        }
        System.out.print("Нечётные числа: ");
        for (i = 0; i < array.length; i++) {
            j = array[i] % 2;
            if (j != 0) System.out.print(array[i] + " ");
        }

        System.out.println();

        //Задание 3.
        int l = 0, t = 0, a, d = 1;
        for (i = 1; i < array.length; i++) {
            if (array[i] >= l) l = array[i];
        }
        System.out.println("Самое длинное число = " + l);
        while (t == 0) {
            d = d * 10;
            for (i = 0; i < array.length; i++) {
                a = array[i] / d;
                if (a == 0) {
                    t = 1;
                    System.out.println("Короткое число = " + array[i]);
                }
            }
        }
        //Задание 4.
        //Сортируем по возрастанию числа в массиве
        int z;
        for (i = 0; i < array.length; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    z = array[i];
                    array[i] = array[j];
                    array[j] = z;
                }
            }
        }
        //Ищем числа идущие по порядку
        for (i = 0; i < array.length - 1; i++) {
            if (array[i] == (array[i + 1] - 1)) System.out.println(array[i] + " " + array[i + 1]);
        }
        //Задание 5.
    }
}