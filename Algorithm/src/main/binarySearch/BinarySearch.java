package binarySearch;

//二分查找算法
public class BinarySearch {

    /**二分查找法基础版
     *
     * @param a 待查找数组
     * @param target 目标值
     * @return  返回索引  没找到就返回-1
     */
    public static int binarySearchBasic(int [] a , int target){
        int left = 0 , right = a.length-1;  //定义左右两个指针
        while (left <= right){         //如果左指针小于右指针就走循环  hint 两个指针相等的时候也需要查询一次所以用=号
            int index = (left + right) >>> 1;  //中间索引  hint 移位运算符避免超过int范围
            if (target < a[index]){
                right = index - 1;      //目标值小于索引处的值把右指针移过来
            }else if (a[index] < target){
                left = index + 1;       //目标值大于索引处的值把左指针移过来
            }else {
                return index;       //返回索引
            }
        }
        return -1;
    }

    /**二分查找法改动版
     *
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchAlternative(int [] a , int target){
        int left = 0 , right = a.length;  //改动1
        while (left < right){         //改动2  hint 不加=因为最后left和right相等时会死循环
            int index = (left + right) >>> 1;
            if (target < a[index]){
                right = index;          //改动3
            }else if (a[index] < target){
                left = index + 1;
            }else {
                return index;
            }
        }
        return -1;
    }
}
