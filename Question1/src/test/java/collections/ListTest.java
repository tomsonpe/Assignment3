package collections;

import org.junit.Assert;

/**
 * Created by student on 2016/03/12.
 */
public class ListTest {
    Lister list;

    @org.junit.Test
    public void testList() throws Exception {
        list=new Lister();
        Assert.assertEquals(list.name().get(0),list.name().get(2));
    }
}
