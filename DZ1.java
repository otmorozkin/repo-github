package HomeWork1;

public class DZ1 {
    public static void main(String[] args) {
        System.out.println("a * (b + (c / d)) = " + doOne(1,2,3,4));
        System.out.println(doTwo(5, 8));
        doThree(-7);
        doFour("Илья Мастеров");
        doFive(2016);
    }
    //1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
    // где a, b, c, d – целочисленные входные параметры этого метода
    static double doOne(double a, double b, double c, double d) {
        System.out.println("\nЗадание 1.");
        return a * (b + (c / d));
    }
    //2. Написать метод, принимающий на вход два целых числа,
    // и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;
    static boolean doTwo(int a, int b) {
        System.out.println("\nЗадание 2.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    //3. Написать метод, которому в качестве параметра передается целое число,
    // метод должен проверить положительное ли число передали, или отрицательное.
    // Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
    static void doThree(int a) {
        System.out.println("\nЗадание 3.");
        if (a >= 0) System.out.println("Число " + a + " ПОЛОЖИТЕЛЬНОЕ");
        else System.out.println("Число " + a + " ОТРИЦАТЕЛЬНОЕ");
    }
    //4. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void doFour(String name) {
        System.out.println("\nЗадание 4.");
        System.out.println("Привет, " + name + "!");
    }
    //5. * Написать метод, который определяет является ли год високосным, и выводит сообщение
    //в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
    //– високосный.
    static void doFive(int year) {
        System.out.println("\nЗадание 5.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " год не високосный");
        else System.out.println(year + " год високосный");
    }
}