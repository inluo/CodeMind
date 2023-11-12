package binarySearch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static binarySearch.BinarySearch.*;

public class Test1 {
    @Test
    public void LeftMost(){
        int[] a = {1,2,4,4,4,6,6,7};
        assertEquals( 2, binarySearchLeftMost(a,4));
        assertEquals( 5, binarySearchLeftMost2(a,5));
    }

}
