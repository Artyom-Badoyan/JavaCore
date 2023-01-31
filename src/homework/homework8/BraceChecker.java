package homework.homework8;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    protected void check() {
        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char element = text.charAt(i);

            char lastEl;
            switch (element) {
                case '(', '[', '{' -> stack.push(element);
                case ')' -> {
                    lastEl = (char) stack.pop();
                    if (lastEl == 0) {
                        System.err.println("Error at " + i + ": closed " + element + " but not opened " + lastEl);
                    } else if (lastEl != '(') {
                        System.err.println("Error at " + i + ": closed " + element + " but opened " + lastEl);
                    }
                }
                case ']' -> {
                    lastEl = (char) stack.pop();
                    if (lastEl == 0) {
                        System.err.println("Error at " + i + ": closed " + element + " but not opened " + lastEl);
                    } else if (lastEl != '[') {
                        System.err.println("Error at " + i + ": closed " + element + " but opened " + lastEl);
                    }
                }
                case '}' -> {
                    lastEl = (char) stack.pop();
                    if (lastEl == 0) {
                        System.err.println("Error at " + i + ": closed " + element + " but not opened " + lastEl);
                    } else if (lastEl != '{') {
                        System.err.println("Error at " + i + ": closed " + element + " but opened " + lastEl);
                    }
                }
            }
        }

        char lastElement;
        while ((lastElement = (char) stack.pop()) != 0) {
            System.err.println("Error : Opened " + lastElement + " but not closed");
        }
    }
}

