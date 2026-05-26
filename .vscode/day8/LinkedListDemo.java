package day8;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer>ll= new LinkedList<>();
        ll.add(90);
        System.out.println(ll);
        ll.addFirst(89);
        System.out.println(ll);
        ll.addLast(934);
        System.out.println(ll);
        ll.offer(50);
        System.out.println(ll);
        ll.offerFirst(111);
        System.out.println(ll);
        ll.peekFirst();
        System.out.println(ll);
        ll.peekLast();
        System.out.println(ll);
        ll.poll();
        System.out.println(ll);
        ll.size();
        System.out.println(ll);

    }
}
