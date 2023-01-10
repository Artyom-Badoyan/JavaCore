package homework.homework4;

public class ArraySpaceExample {
    public static void main(String[] args) {

        /*
         Ունենալու ենք char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '}; մասիվը,
         որի մեջ սկզբից և վերջից կարող է լինել ցանկացած քանակությամբ ' '-ներ(բացատներ) ։
         Պետք է ստեղծել նոր՝ char[] result մասիվ, որտեղ չեն լինի spaceArray-ի սկզբի և վերջի բացատները։
         Այսինքն մեր լոգիկայի արդյունքում որ տպենք result մասիվի բոլոր էլեմենտները՝
         կունենանք cat bi b (մեջտեղի սինվոլները մնալու են)
        */

        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        //գտնել մասիվի առաջին և վերջին ոչ բացատ էլեմենտները
        int firstSpace = 0;
        int lastSpace = spaceArray.length - 1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                firstSpace = i;
                break;
            }
        }
        for (int i = spaceArray.length - 1; i >= 0; i--) {
            if (spaceArray[i] != ' ') {
                lastSpace = i;
                break;
            }
        }

        //Ստեղծել մասիվ և տպել ոչ բացատ էլեմենտները
        int resultLength = lastSpace - firstSpace + 1;
        char[] result = new char[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = spaceArray[firstSpace + i];
        }
        System.out.println(result);
    }
}

