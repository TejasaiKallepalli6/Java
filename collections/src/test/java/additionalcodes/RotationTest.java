package additionalcodes;

import org.junit.Assert;
import org.junit.Test;


public class RotationTest {
    Rotation stringRotation = new Rotation();
    @Test
    public void testCheckRotation() {
        boolean output = stringRotation.checkRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee");
        Assert.assertTrue(output);
    }

    @Test
    public void testCheckRotationFailure() {
        Assert.assertFalse(stringRotation.checkRotation("JavaJ2eeStrutsHibernate", "JavaJ2eeStrutsHibernate"));
    }

    @Test
    public void testCheckEdgeCase() {
        Assert.assertFalse(stringRotation.checkRotation("Teja", "Sai"));
    }
}