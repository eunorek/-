package test;

import java.util.Arrays;
import linearList.LinearList;

public class LinearListBasicTest {
    
    LinearList linearList;
    
    public LinearListBasicTest() {
        this.linearList = new LinearList(null);
        this.runAllTest();
    }
    
    public void runAllTest() {
        this.mergeTest();
    }
    
    private void mergeTest() {
        linearList.setLinearList(new int[] {1,2,3});
        linearList.merge(new int[] {5,6,7});
        assert Arrays.equals(linearList.getLinearList(), new int[] {1,2,3,5,6,7});       
    }
}
