package Practice_Questions;

import java.util.Scanner;

class Node{
    int data;
    Node next;
}
public class ReturnObject {
    static Node head = null;
    public static Node insertAtBeg(int x){
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;
        return newNode;
    }
    public static void printStack(){
        Node temp = head;
        if(head == null){
            System.out.println("Error: Stack Underflow");
        }
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printStack();
        head = insertAtBeg(10);
        printStack();
        head = insertAtBeg(20);
        head = insertAtBeg(30);
        printStack();
    }
}
