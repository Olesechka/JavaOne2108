package lesson2;

public class CycleApp {

    public static void main(String[] args) {
        //for (инициализация; условие; итерация)
        for (int i = 1; i < 11; i++) {
            System.out.println(i);

        }

//        for (;;){бесконечный цикл}

        for (int i = 0, j = 10; i < j; j--, i--) {
            System.out.println(i + " " + j);
        }

        System.out.println("Вложенный цикл");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("(" + i + " " + j + ")");
            }
            System.out.println();
        }

        System.out.println("Continue");
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }


        System.out.println("Break");
        for (int i = 0; i < 11; i++) {
            if (i > 5) {
                break;
            }
            System.out.println(i);
        }

    }


}
