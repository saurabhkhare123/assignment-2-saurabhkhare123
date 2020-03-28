/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
import problem4.binaryST.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree(myQueue);
        myBinarySearchTree.insert(67);
        myBinarySearchTree.insert(20);
        myBinarySearchTree.insert(31);
        myBinarySearchTree.insert(40);
        myBinarySearchTree.insert(10);
        myBinarySearchTree.preOrder(myBinarySearchTree.getRoot());
        System.out.println("PreOrder successors of all the nodes");
        myQueue.show();

    }


}
