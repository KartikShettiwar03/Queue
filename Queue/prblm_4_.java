import java.util.Queue;
import java.util.LinkedList;
public class prblm_4_ {
    public static void interleaved(Queue<Integer>q){
        Queue<Integer>firstHalf = new LinkedList<>();
        int size = q.size();
        for(int i=0 ; i<size/2 ; i++){//dynamic hai to we made size var
            firstHalf.add(q.remove());
        }   
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        interleaved(q);
        while(!q.isEmpty()){
            System.out.println(q.remove()+" ");
        }
    }   
}