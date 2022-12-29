package homework.homework1;

public class IfForExample {
    public static void main(String[] args) {

         /*
        Ստեղծեք երկու int տիպի փոփոխական a և b իրենց արժեքներով(դուք որոշեք արժեքները)։
        Գրեք կոդ, որը կտպի այդ երկու փոփոխականից մեծը։
        Օրինակ ունենք a=95, b=100. կտպի`max: 100
        */

        int a = 95;
        int b = 100;

        if (a == b) {
            System.out.println("a-ն հավասար է b-ին");
        } else if (a > b) {
            System.out.println("max a: " + a);
        } else {
            System.out.println("max b: " + b);
        }
        System.out.println("*********************");

           /*
       Գրեք կոդ, որ այդ նույն թվերից փոքրից մինչև մեծ ցիկլ կֆռռա,
       ու կտպի իրենց արանքում գտնվող բոլոր թվերը։
       Օրինակ a=95, b=100. կտպի 95,96,97,98,99,100
        */

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = b; i <= a; i++) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("*********************");

        /*
         Փոխակերպել a-ի արժեքը char-տիպի, ու տպել թե ինչ սինվոլ ստացվեց։ Նույնը b-ի համար։
         */

        System.out.println((char) a);
        System.out.println((char) b);

        System.out.println("*********************");

        char c = 95;
        System.out.println("a-ի արժեքը = char " + c);

        char d = 100;
        System.out.println("b-ի արժեքը = char " + d);

        System.out.println("*********************");

         /*
        Գրել կոդ, որը կստուգի եթե a-ն հավասար է b-ին, կտպի` a-ն հավասար է բ-ին,
        եթե ոչ, կտպի որ հավասար չէ։
        */

        if (a == b) {
            System.out.println("a-ն հավասար է բ-ին");
        } else {
            System.out.println("a-ն հավասար չէ բ-ին");
        }
    }
}
