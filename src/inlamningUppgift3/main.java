package inlamningUppgift3;

import inlamningUppgift2.methods;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        secondmain secondmain = new secondmain();

        System.out.println("Write something to count / type stop to exit: ");

        while (true) {
            String input = scan.nextLine();
            secondmain.getinfo(input);

            if (input.equals("stop")) {

                break;

            }

        }
        System.out.println("total characters " + secondmain.getCharCount());
        System.out.println("total lines " + secondmain.getLines());
    }


    @Test
    public void test1(){
        secondmain secondmain = new secondmain();

        String expected = "alex";

        String actual = secondmain.getname();

        assertNotEquals(expected, actual);

    }

    @Test
    public void test2(){
        secondmain secondmain = new secondmain();
        int expected = 20;

        int actual = secondmain.getNumr(10);

        assertEquals(expected, actual);

    }

    @Test
    public void test3(){
        secondmain secondmain = new secondmain();
        String[] expected = {"josh", "sam", "dan"};
        secondmain.setGroupp(new String[]{"josh", "sam", "dan"});
        String[] actual = secondmain.getGroupp();

        assertEquals(expected, actual);
    }

}