package binarySearch;

//二分查找算法
public class BinarySearch {

    /**二分查找法基础版
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

    /**二分查找法平衡版
     * 去掉了else if比较，目标值在最左边和最右边比较次数相对平衡
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchBalance(int [] a , int target){
        int left = 0 , right = a.length;
        while (1 < right - left){
            int index = (right + left) >>> 1;
            if (target < a[index]){
                right = index;
            }else {
                left = index;  //index的的地方有可能会是目标值
            }
        }
        if (a[left] == target){
            return left;
        }else {
            return -1;
        }
    }

    /**
     *查找最左元素
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchLeftMost(int [] a , int target){
        int left = 0 , right = a.length-1;
        int candidate = -1;
        while (left <= right){
            int index = (left + right) >>> 1;
            if (target < a[index]){
                right = index - 1;
            }else if (a[index] < target){
                left = index + 1;
            }else {
                candidate = index;  //记录一个候选位置，但是还要继续查找
                right = index - 1;
            }
        }
        return candidate;
    }

    /**
     *查找最右元素
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchRightMost(int [] a , int target){
        int left = 0 , right = a.length-1;
        int candidate = -1;
        while (left <= right){
            int index = (left + right) >>> 1;
            if (target < a[index]){
                right = index - 1;
            }else if (a[index] < target){
                left = index + 1;
            }else {
                candidate = index;  //记录一个候选位置，但是还要继续查找
                left = index + 1;
            }
        }
        return candidate;
    }

    /**
     *查找最左元素优化版
     * @param a
     * @param target
     * @return 大于等于target的最左索引
     */
    public static int binarySearchLeftMost2(int [] a , int target){
        int left = 0 , right = a.length-1;
        int candidate = -1;
        while (left <= right){
            int index = (left + right) >>> 1;
            if (target <= a[index]){
                right = index - 1;
            }else if (a[index] < target){
                left = index + 1;
            }else {
            }
        }
        return left;
    }

    /**
     *查找最右元素优化
     * @param a
     * @param target
     * @return 小于等于target的最右索引
     */
    public static int binarySearchRightMost2(int [] a , int target){
        int left = 0 , right = a.length-1;
        while (left <= right){
            int index = (left + right) >>> 1;
            if (target < a[index]){
                right = index - 1;
            }else {
                left = index + 1;
            }
        }
        return left - 1;
    }

    /**
     * 二分查找递归
     * @param a
     * @param target
     * @return
     */
    public static int binarySearchRecursion(int []a , int target){
        return recursion(a,target,0,a.length-1);
    }

    private static int recursion(int []a,int target,int i,int j){
        if (i>j){
            return -1;
        }
        int index = (i + j) >>> 1;
        if (target < a[index]){
            return recursion(a,target,i,index-1);
        }else if (a[index] < target){
            return recursion(a,target,index+1,j);
        }else {
            return index;
        }

    }
}