package array;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class Test1 {
    @Test
    public void test(){
        DynamicArray array = new DynamicArray();
        array.addLast(1);
        array.addLast(2);
        array.addLast(3);
        array.addLast(5);
        array.addLast(4);
//        for (int i = 0; i < 5; i++) {
//            System.out.println(array.get(i));
//        }
//        array.foreach();
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }

    @Test
    @DisplayName("测试删除")
    public void test2(){
        DynamicArray array = new DynamicArray();
        array.addLast(1);
        array.addLast(2);
        array.addLast(3);
        array.addLast(5);
        array.addLast(4);
        int remove = array.remove(2);
        assertEquals(3 ,remove);
        for (Integer integer : array) {
            System.out.println(integer);
        }
    }

    @Test
    @DisplayName("扩容")
    public void test3(){
        DynamicArray array = new DynamicArray();
        for (int i = 0; i < 9; i++) {
            array.addLast(i+1);
        }
        List.of(1,2,3,4,5,6,7,8,9);
        assertIterableEquals(List.of(1,2,3,4,5,6,7,8,9),array);
    }

    @Test
    @DisplayName("二维数组")
    public void test4(){
        int [][]array = new int[2][];
        int []a= {1,2};
        int []b={1,2,3};
        array[0] = a;
        array[1] = b;
//        int c=array[0][3];
//        System.out.println(c);
    }
}

