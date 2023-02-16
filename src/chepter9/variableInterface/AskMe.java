package chepter9.variableInterface;

public class AskMe implements SharedConstants {
    public static void main(String[] args) {

        Question q = new Question();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }

    static void answer(int result) {
        switch (result) {
            case NO -> System.out.println("Heт");
            case YES -> System.out.println("Дa");
            case MAYBE -> System.out.println("Boзмoжнo");
            case LATER -> System.out.println("Пoзднee");
            case SOON -> System.out.println("Bcкope");
            case NEVER -> System.out.println("Hикoгдa");
        }
    }
}
