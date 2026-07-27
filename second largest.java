import java.util.*;
public class Map
{
    imt[]arr={10,100,10,9,9};
    Map<Integer,Integer>m=new HashMap<>();
    for(int tem:arr)
    {
        if(m.containsKey(temp)){
            int increemented=m.get(temp)+1;
            m.put(temp,increemented);
        }
        else
        {
        for(Map.Entry<Integer,Integer>map:m.entrySet())
        if(map.getValue()==1){
            System.out.println(m.getKey());
            break;
    }
}
}