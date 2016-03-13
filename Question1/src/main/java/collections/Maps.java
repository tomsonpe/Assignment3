package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2016/03/12.
 */
public class Maps
{
    public Map<String ,String> decimals(){
        Map decy=new HashMap();
        decy.put("2.00", "3.00" );
        decy.put("4.00","5.00");
        decy.put("6.00","6.00");
        return decy;
    }
}
