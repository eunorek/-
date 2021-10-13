package test;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import main.Main;

/*
 * for official documentation, check on:
 * https://github.com/junit-team/junit4/wiki/parameterized-tests
 * */
@RunWith(Parameterized.class)
public class Test {

    private String expected;
    // can add more val variables if necessary
    private String val1;
    private Main main;
    
    public Test(String val1, String expected) {
        this.expected = expected;
        this.val1 = val1;
        this.main = new Main();
    }
    
    // the test
    @org.junit.Test
    public void testSolution() throws IOException {  
        assertEquals(expected, this.main.solution(val1));
    }
    
    // {*args, expected}
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { , },
            { , }
        });
    }
    

}
