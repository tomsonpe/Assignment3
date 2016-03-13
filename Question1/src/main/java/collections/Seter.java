package collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2016/03/12.
 */
public class Seter
{
    public Set<String> numbers(){
        Set set=new HashSet();
        set.add("1");
        set.add("2");
        set.add("1");

        return set;
    }
}
