package homework.homework1;

public class FigurePainter {
    public static void main(String[] args) {

        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------");


        /*
                  *
                * *
              * * *
            * * * *
          * * * * *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("  ");
            }
            for (int l = 0; l < i + 1; l++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("-------------");


        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
