public class Main {
    public static void main(String[] args) {
        int[] array = {45, 78, -15, 12, 34, 6, 90, 7, -2, -45};
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
        int l = 0, s, t = 0, a, d = 1;
        for (i = 1; i < array.length; i++) {
            if (array[i] >= l) l = array[i];
        }
        System.out.println("Самое длинное число = " + l);
        s = l;
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
    }
}