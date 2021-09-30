package lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        checkSum(1, 22);
        printNum(2);
        checkNum(4);
        printString("Привет!", 4);
        leapYear(800);
    }

    /*
    1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
     */
    public static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }


    /*
    2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
    */
    public static void printNum(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");

    }

    /*
    3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    */
    public static boolean checkNum(int a) {
        if (a >= 0) {
            return true;
        }
        return false;
    }

    /*
    4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
    */
    public static void printString(String string, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(string);
        }
    }

    /*
    5. * Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
    public static boolean leapYear(int a) {
        if ((a % 4 != 0) || (a % 100 == 0) && (a % 400 != 0)) {
            return false;
        }
        return true;
    }

}
