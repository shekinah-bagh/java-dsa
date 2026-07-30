import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Queue<Integer>q=new LinkedList<>();
        q.offer(7);
        q.offer(8);
        q.poll();
        System.out.println(q.size());
    }
}