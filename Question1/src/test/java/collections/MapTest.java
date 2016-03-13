package collections;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/12.
 */
public class MapTest {
    Maps map=new Maps();

    @Test
    public void testMap() throws Exception {
        Assert.assertEquals(map.decimals().get(45525),map.decimals().get(15));

    }
}
