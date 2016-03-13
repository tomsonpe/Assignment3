package question2;

import junit.framework.Assert;

/**
 * Created by student on 2016/03/12.
 */
public class ImplementNamesTest {
    ImplementNames impl;

    @org.junit.Test
    public void testImplementNames() throws Exception {
        impl=new ImplementNames();
        Assert.assertEquals(impl.names(), "Encore");
    }
}
