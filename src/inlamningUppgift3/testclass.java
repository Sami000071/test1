package inlamningUppgift3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class testclass {

    @Test
    public void testcharctersCount() {
        secondMain secondMain = new secondMain();
        secondMain.getinfo("eleven charc"); //11 charcters
        int expected = 11;
        int actual = secondMain.getCharCount();
        assertEquals(expected, actual);
    }

    @Test
    public void testLinesCount() {
        secondMain secondMain = new secondMain();
        secondMain.getinfo("two\nlines\n");
        int expected = 2;
        int actual = secondMain.getLines() - 1;//använder -1 pga jag har två
        //lines++ en av dem för att kunna testa själva varibel och en
        //för att räkna själva lines från input i scanner
        assertEquals(expected, actual);
    }
    @Test
    public void testLinesandChar(){
        secondMain secondMain = new secondMain();
        secondMain.getinfo("hello\nfriend");//detta inkluderar mellan slag
        //eftersom vi hoppar en rad
        assertEquals(12, secondMain.getCharCount());
        assertEquals(1, secondMain.getLines()-1);
    }
}
