package com.sophia.days30;

//import com.sophia.Node;


import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Day23 {
    static void levelOrder(Node root) {
        //Write your code here
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.size() > 0) {
            Node top = q.remove();
            System.out.print(top.data + " ");//3
            if (top.left != null) {
                q.add(top.left);
            }
            if (top.right != null) {
                q.add(top.right);
            }
        }
    }
}


