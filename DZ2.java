package HomeWork2;

public class DZ2 {
    public static void main (String[] args) {
        //1.Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        System.out.println("\n Задание 1");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0,};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] == 1 ? 0 : 1;
            System.out.print(arr1[i] + " ");
        }
        //2.Задать пустой целочисленный массив размером 8.
        // Написать метод, который c помощью цикла
        // заполнит его значениями 1 4 7 10 13 16 19 22;
        System.out.println("\n Задание 2");
        int[] arr2 = new int[8];
        arr2[0] = 1;
        for (int i = 1, j = 1; i < arr2.length; i++) arr2[i] = j += 3;
        for (int x : arr2) System.out.print(x + " ");

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        // написать метод,принимающий на вход массив
        // и умножающий числа меньше 6 на 2;
        System.out.println("\n Задание 3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + " ");
        }
        //4. Задать одномерный массив.
        // Написать методы поиска в нём минимального и максимального элемента;
        System.out.println("\n Задание 4");
        int[] arr4 = {10, 4, 8, 11, 5, 6, 2, 9, 4, 3, 7, 11};
        int min = arr4[0], max = arr4[0], indMax = 0, indMin = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max) {
                max = arr4[i];
                indMax = i;
            }
            if (arr4[i] < min) {
                min = arr4[i];
                indMin = i;
            }
        }
            System.out.println("максимальное число под индексом " + indMax + " и равно " + max);
            System.out.println("минимально число под индексом " + indMin + " и равно " + min);
        }
    }
