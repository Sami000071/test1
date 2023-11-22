package inlamningUppgift3;

import inlamningUppgift2.methods;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        secondMain secondMain = new secondMain();

        System.out.println("Write something to count / type stop to exit: ");

        while (true) {
            String input = scan.nextLine();
            secondMain.getinfo(input);

            if (input.equals("stop")) {

                break;

            }

        }
        System.out.println("total characters " + secondMain.getCharCount());
        System.out.println("total lines " + secondMain.getLines());
    }
}

