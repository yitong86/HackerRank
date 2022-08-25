package com.sophia;

public class Day24 {
}

class Solution1 {

    public static Node removeDuplicates(Node head) {
        //Write your code here
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.data != temp.next.data) {
                temp = temp.next;
            } else {
                temp.next = temp.next.next;
            }
        }
        return head;
    }
}