package Collection;

import java.util.LinkedList;

public class LinkedListCreation {


    public static void main(String args[]){
        print();
    }

    public static Node<Integer> useLinkedList(){
        Node<Integer> node = new Node<>(10);
        Node<Integer> node1 = new Node<>(20);
        Node<Integer> node2 = new Node<>(30);
        Node<Integer> node3 = new Node<>(40);
        Node<Integer> node4 = new Node<>(50);

        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        return  node;

    }


    public static void print(){
        Node<Integer> head = useLinkedList();

        while(head !=null){

            System.out.println(head.value);
            head = head.next;

        }

        LinkedList<Integer> lll = new LinkedList<>();
        lll.add(10);
        
    }




}
