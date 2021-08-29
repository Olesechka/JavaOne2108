package lesson2;

public class MethodApp {

    public static void main(String[] args) {

    }

    public static void doSomething() {
        System.out.println("something");
    }

    public static int calculate(int a, int b) {
        return 2 * a + b;
    }

    public static int calculate(int b) {
        return 2 * b;
    }

}
//<modifier> <type> <name> (<params> 0..n) - сигнатура метода
//public для всех -> default (no modifier) внутри пакета -> protected внутри пакета + наследникам -> private только внутри класса

