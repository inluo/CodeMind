package bubbleSort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RecursionBubbleSortTest {
    @Test
    public void test(){
        int a[] = {6,32,1,8,0,4};
        RecursionBubbleSort.bubble(a,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
