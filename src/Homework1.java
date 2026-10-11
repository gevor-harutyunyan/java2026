public class Homework1 {

    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            System.out.print(i + " ");
        }


        int a, b;
        a = 9;
        b = 7;

        System.out.println();
        System.out.println("-----------");
        System.out.println(a + b);
        System.out.println();
        System.out.println("--------------");
        int n = 3;
        for (int j = 1; j <= 10; j++)
            System.out.println(n + "*" + j + "=" + (n * j));

        System.out.println();
        System.out.println("--------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("----------------");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println("----------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println("-----------");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println("---------------");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }


        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}



















