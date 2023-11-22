package inlamningUppgift3;

public class secondMain {
    private int charCount = 0;
    private int lines = 0;


    public void getinfo(String input) {
        if (!input.equals("stop")) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != ' ') {
                    charCount++;
                }


                if (input.charAt(i) == '\n') {// detta för att vi ska
                    //kunna testa lines.
                    lines++;
                }

            }

            lines++;
            System.out.println("charCount = " + charCount + " lines = " + lines);
        }
    }


    public int getCharCount() { // retunera båda ints för att kunna skriva ut dem
        return charCount;
    }

    public int getLines() {
        return lines;
    }
}






