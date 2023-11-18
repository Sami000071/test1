package inlamningUppgift3;

import java.util.Scanner;

public class secondmain {
    private int charCount = 0;
    private int lines = 0;

    public void getinfo(String input) {

        if (!input.equals("stop")) { // undvika ordet stop
            for (int i = 0; i < input.length(); i++) { // för att iterera över varje tecken i strängen input.
                if (input.charAt(i) != ' ') { // för att undvika spaces och kunna räkna tecken
                    charCount++; // värje gång vi looper ett tecken så plusar med 1
                }


            }

            lines++; // 1 + värje loop
            System.out.println("charCount = " + charCount + " lines = " + lines);
            //skrivs ut värje loop
        }


    }

    public int getCharCount(){ // retunera båda ints för att kunna skriva ut dem
        return charCount;
    }

    public int getLines(){
        return lines;
    }


    //tests

    public String getname() {
        String name = "alex";
        return name;
    }

    //
    private int numr;

    public int getNumr(int numr1) {
        numr = numr1 + 10;
        return numr;
    }
    //

    private String[] groupp;
    public void setGroupp(String[] theusers)
    {groupp = theusers;}
    public String[] getGroupp(){
        return groupp;
    }

}




