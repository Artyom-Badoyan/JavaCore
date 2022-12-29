package homework.homework3;

public class CharArrayExample {
    public static void main(String[] args) {
        /*
         1) Ունենք հետևյալ մասիվը՝
         char[] chars = {'j','a','v','a','l,'o','v', 'e'};
         ունենք նաև մի սինվոլ՝ char c = 'o';
         Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։

         2) Ունենք հետևյալ մասիվը՝
         char[] chars2 = {'j','a','v','a','l','o','v', 'e'};
         պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։

         3) Ունենք հետևյալ մասիվը՝՝
         char[] chars3 = {'j','a','v','a','l,'o','l', 'y'};
         պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

         4) Ունենք հետևյալ մասիվը՝
         char[] text = {' ',' ','b','a','r','e','v',' ',' '};
         պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.
         */


        //հաշվլ թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        //ունենք նաև մի սինվոլ՝ char c = 'o';
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int count = 0;
        for (char elements : chars) {
            if (elements == c) {
                count++;
            }
        }
        System.out.println("count: " + count);


        //տպել մեջտեղի 2 սինվոլները։
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        if (chars2.length % 2 == 0) {
            System.out.println("'" + chars2[chars2.length / 2 - 1] + "'" + "," + "'" + chars2[chars2.length / 2] + "'");
        } else {
            System.out.println(chars2);
        }


        // պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        boolean isEmpty = false;
        char length1 = chars3[chars3.length - 1];
        char length2 = chars3[chars3.length - 2];
        if (length2 == 'l' && length1 == 'y') {
            isEmpty = true;
        }
        System.out.println("isEmpty: " + isEmpty);


        //պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        char p = ' ';
        for (char elements : text) {
            if (elements != p) {
                System.out.print(elements);
            }
        }
    }
}
