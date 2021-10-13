package test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import main.Main;

@RunWith(Parameterized.class)
public class Test {

    private String expected;
    private String val1;
    private Main main;
    
    public Test(String val1, String expected) {
        this.expected = expected;
        this.val1 = val1;
        this.main = new Main();
    }
    
    @org.junit.Test
    public void testSolution() throws IOException {
//        System.out.println(expected + "\n\n");
//        System.out.println(this.main.solution(expected));
//        System.out.println("\n=======================================\n");      
        assertEquals(expected, this.main.solution(val1));
    }
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"14\r\n"
                    + "push 1\r\n"
                    + "push 2\r\n"
                    + "top\r\n"
                    + "size\r\n"
                    + "empty\r\n"
                    + "pop\r\n"
                    + "pop\r\n"
                    + "pop\r\n"
                    + "size\r\n"
                    + "empty\r\n"
                    + "pop\r\n"
                    + "push 3\r\n"
                    + "empty\r\n"
                    + "top" , "2\r\n"
                            + "2\r\n"
                            + "0\r\n"
                            + "2\r\n"
                            + "1\r\n"
                            + "-1\r\n"
                            + "0\r\n"
                            + "1\r\n"
                            + "-1\r\n"
                            + "0\r\n"
                            + "3"},
            {"7\r\n"
                    + "pop\r\n"
                    + "top\r\n"
                    + "push 123\r\n"
                    + "top\r\n"
                    + "pop\r\n"
                    + "top\r\n"
                    + "pop" , "-1\r\n"
                            + "-1\r\n"
                            + "123\r\n"
                            + "123\r\n"
                            + "-1\r\n"
                            + "-1"}
        });
    }
    

}
