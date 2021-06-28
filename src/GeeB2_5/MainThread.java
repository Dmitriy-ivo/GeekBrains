/*
1. Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив, например:
static final int size = 10 000 000;
static final int h = size / 2;
float[] arr = new float[size].
2) Заполняют этот массив единицами.
3) Засекают время выполнения: long a = System.currentTimeMillis().
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
Math.cos(0.4f + i / 2)).
5) Проверяется время окончания метода System.currentTimeMillis().
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
Отличие первого метода от второго:
● Первый просто бежит по массиву и вычисляет значения.
● Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и
потом склеивает эти массивы обратно в один.
Пример деления одного массива на два:
● System.arraycopy(arr, 0, a1, 0, h);
● System.arraycopy(arr, h, a2, 0, h).
Пример обратной склейки:
● System.arraycopy(a1, 0, arr, 0, h);
● System.arraycopy(a2, 0, arr, h, h).
 */
package GeeB2_5;

public class MainThread {

    public static void main(String[] args) {

        int size = 10000000;
        int h = size / 2;

        float[] arr = new float[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        met(arr);

        long a = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);

        // Вычисление в 2 потока
        a = System.currentTimeMillis();

        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        System.arraycopy(arr,0, arr1,0,h);
        System.arraycopy(arr,h, arr2,0,h);

        Thread th1 = new Thread(() -> met(arr1));
        Thread th2 = new Thread(() -> met(arr2));

        th1.start();
        th2.start();


        try {
            th1.join();
            th2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.arraycopy(arr1,0, arr,0,h);
        System.arraycopy(arr2,0, arr,h,h);


        System.out.println(System.currentTimeMillis() - a);

    }

    public static void met(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
