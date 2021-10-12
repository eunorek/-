package linearList;

import java.util.Arrays;

public class LinearList {
    
    private int[] arr;
    
    public LinearList(int[] arr) {
        if(arr == null || arr.length < 1) {
            this.arr = new int[0];
            return;
        }
        this.arr = arr;
    }
    
    // set arr
    public void setLinearList(int[] newArr) {
        if(arr == null) {
            this.arr = new int[0];
            return;
        }
        this.arr = newArr;
    }
    
    // get arr
    public int[] getLinearList() {
        return this.arr;
    }
    
    // merges two lists
    public void merge(int[] arr2) {
        if(arr2 == null) {
            return;
        }
        int[] newArr = new int[arr.length + arr2.length];
        for(int i=0; i<arr.length; i++) {
            newArr[i] = arr[i];
        }
        for(int i=arr.length; i<newArr.length; i++) {
            System.out.println(i);
            newArr[i] = arr2[i - arr.length];
        }
        this.arr = newArr;
        return;
    }

}
