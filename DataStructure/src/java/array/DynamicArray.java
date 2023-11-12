package array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

//动态数组
public class DynamicArray implements Iterable<Integer>{
    private int size = 0;  //逻辑大小
    private int capacity = 8; //容量
    private int[] array = {}; //懒加载

    //向最后一个位置添加元素
    public void addLast(int element){
        add(size , element);
    }

    //向索引位置插入元素
    public void add(int index,int element){
        checkAndGrow();
        //添加逻辑
        if (index >= 0 && index < size){
            //从原始数组的index开始拷贝数组到目标数组的index+1的位置，拷贝个数为size - index 个
            System.arraycopy(array , index , array ,index+1 , size - index);
        }
        array[size] = element;
        size++;
    }

    private void checkAndGrow() {
        if (size == 0){
            array =new int[capacity];
        } else if (size == capacity){   //容量判断
            //扩容
            capacity += capacity >>> 1;
            int[] newArray = new int[capacity];
            System.arraycopy(array,0,newArray,0,size);
            array = newArray;
        }
    }

    //根据索引获得元素
    public int get(int index){
        return array[index];
    }

    //移除元素
    public int remove(int index){
        int removed = array[index];
        if (index == size -1){
            System.arraycopy(array,index+1,array,index,size - index - 1);
        }
        size--;
        return removed;
    }

    //循环遍历
    public void foreach(Consumer<Integer> consumer){
        for (int i = 0; i < size; i++) {
            consumer.accept(array[i]);
            // 提供array[i]
            // 返回void
        }
    }

    //迭代器遍历
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i = 0;
            @Override
            public boolean hasNext() {    //有没有下一个元素
                return i<size;
            }

            @Override
            public Integer next() {     //返回当前元素，并移动到下一个元素
                return array[i++];
            }
        };
    }

    //返回一个流stream
    public IntStream stream(){
        return IntStream.of(Arrays.copyOfRange(array,0,size));
    }

}
