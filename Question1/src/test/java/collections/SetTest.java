package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2016/03/12.
 */
public class SetTest {
    Seter sety=new Seter();;

    @Test
    public void testSet() throws Exception {

        Set set=new HashSet();
        set.add("1");
        set.add("2");
        set.add("1");
        Assert.assertEquals(sety.numbers(),set );

    }
}
