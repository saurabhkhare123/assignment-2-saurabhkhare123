/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("saur", 58));
        queue.enqueue(new Student("raje", 23));
        queue.enqueue(new Student("Pavitra", 65));
        queue.enqueue(new Student("lamar", 1));
        queue.enqueue(new Student("mita", 10));
        queue.enqueue(new Student("Shantanu", 76));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}
