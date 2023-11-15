package linked;

import java.util.Iterator;

//双向环形链表
public class DoublyCircinateLinkedListSentinel implements Iterable<Integer>{
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = sentinel.next;
            @Override
            public boolean hasNext() {
                return p!=sentinel;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }

    static class Node {
        Node prev; // 上一个节点指针
        int value; // 值
        Node next; // 下一个节点指针

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }

    private Node sentinel = new Node(null,-1,null);

    public DoublyCircinateLinkedListSentinel(){
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
    }

    //头添加
    public void addFirst(int value){
        Node a = sentinel.prev;
        Node b = sentinel.next;
        Node added = new Node(a, value, b);
        a.next = added;
        a.prev = added;
    }

    //头删除
    public void removeFirst(int value){
        Node removed = sentinel.next;
        if (removed == sentinel){
            throw new IllegalArgumentException("非法");
        }
        Node a = sentinel;
        Node b = removed.next;

        a.next = b;
        b.prev = a;

    }

    //尾添加
    public void addLast(int value){
        Node a = sentinel.prev;
        Node b = sentinel;
        Node added = new Node(a,value,b);
        a.next = added;
        b.prev = added;

    }

    //尾删除
    public void removeLast(int value){
        Node removed = sentinel.prev;
        if (removed == sentinel){
            throw new IllegalArgumentException("非法");
        }
        Node a = removed.prev;
        Node b = sentinel;
        a.next = b;
        b.prev = a;
    }

    //根据值删除
    public void removeByValue(int value){
        Node removed = getByValue(value);
        if (removed == null){
            return; //没有这个值
        }
        Node a = removed.prev;
        Node b = removed.next;
        a.next = b;
        b.prev = a;
    }

    //根据值获取节点
    public Node getByValue(int value){
        Node p = sentinel.next;
        while (p!=sentinel){
            if (p.value==value){
                return p;
            }
            p = p.next;
        }
        return null;
    }

}
