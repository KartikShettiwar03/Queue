import java.util.Deque;
import java.util.LinkedList;

public class prblm_5_ {
    public static class Stack{
        Deque<Integer>deque = new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }
    public static class Queue{
        Deque<Integer>deque = new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        Queue q = new Queue();
    }
}
