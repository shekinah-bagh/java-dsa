import java.util.*;
class Main{
    public static void main(String args[]){
Map<Integer,Integer>m=new HashMap<>();
m.put(1,2);
m.put(2,20);
System.out.println(m);
m.put(1,3);
System.out.println(m);
System.out.println(m.containsKey(10));
        }
    }