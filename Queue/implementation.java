import java.util.Queue;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.LinkedList;
public class implementation{
    //static classes are to be used in main

    //Properties
    //Queue - arr,size,rear
    //Circular Queue(by ArrayOnly) - arr,size,rear,front

    static class QueueA{
        static int arr[];
        static int size;
        static int rear;
        QueueA(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full!");
                return;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("The Queue is Empty!");
                return -1;
            }
            int front = arr[0];
            for(int i=0 ; i<rear ; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("The Queue is Empty!");
                return -1;
            }
            return arr[0];
        }
    }
    static class QueueCircular{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        QueueCircular(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1) % size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full!");
                return;
            }
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("The Queue is Empty!");
                return -1;
            }
            int result = arr[front];
            if(rear==front){
                rear=front=-1;
            }
            else{
                front =(front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue!");
                return -1;
            }
            return arr[front];
        }
    }

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class QueueLL{
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        public static void add(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = tail = newNode;
                return ;
            }
            tail.next = newNode;
            tail = newNode;

        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("The queue is Empty!");
                return -1;
            }
            int front = head.data;
            if(tail==head){
                tail = head = null;
            }
            else{
                head = head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("The Queue is empty!");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        // QueueA q = new QueueA(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // while(!q.isEmpty()){
        //     System.out.print(q.peek()+" ");
        //     q.remove();
        // }

        System.out.println();

        // QueueCircular cq = new QueueCircular(5);
        // cq.add(1);
        // cq.add(2);
        // cq.add(3);
        // System.out.println(cq.remove());
        // cq.add(4);
        // System.out.println(cq.remove());
        // cq.add(5);
        // while(!cq.isEmpty()){
        //     System.out.print(cq.peek()+" ");
        //     cq.remove();
        // }

        // System.out.println();

        QueueLL qll = new QueueLL();
        qll.add(1);
        qll.add(2);
        qll.add(3);
        qll.add(4);
        qll.add(5);
        while(!qll.isEmpty()){
            System.out.print(qll.peek()+" ");
            qll.remove();
        }

        Queue<Integer>que = new LinkedList<>();
        Queue<Integer>dque = new ArrayDeque<>();
    }
}

// class GfG{
//     //Function to reverse the queue.
//     public Queue<Integer> reversal(Queue<Integer> q){
//         //add code here.
//         Stack<Integer>s = new Stack<>();
//         while(!q.isEmpty()){
//             s.push(q.remove());
//         }
//         while(!s.isEmpty()){
//             q.add(s.pop());
//         }
//         return q;
//     }
// }