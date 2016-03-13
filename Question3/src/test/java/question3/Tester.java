package question3;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class Tester
{
    ApplicationContext ctx = new AnnotationConfigApplicationContext(Configurations.class);
    private Names nam= (Names)ctx.getBean("impl");


    @org.junit.Test
    public void testNames() throws Exception {
        Names impl=new ImplementNames();
        Assert.assertEquals(impl.names(), "Encore");
    }
    @org.junit.Test
    public void testSurnames() throws Exception {
        Names impl=new ImplementNames();
        Assert.assertEquals(impl.surnames(), "Tomson");
    }
    @org.junit.Test
    public void testAge() throws Exception {
        Names impl=new ImplementNames();
        Assert.assertEquals(impl.age(),21);
    }


}
