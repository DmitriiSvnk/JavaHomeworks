import org.junit.Test;
import org.junit.Assert;

public class ModuleTests {
    TemperatureConverter myCon = new TemperatureConverter();

    @Test
    public void convertFtoC() {
        Assert.assertEquals(37.78, myCon.convertFtoC(100.0), 0.1);

    }

    @Test
    public void convertCtoF() {
        Assert.assertEquals(212.00, myCon.convertCtoF(100.0), 0.1);

    }

    @Test
    public void convertCtoK() {
        Assert.assertEquals(373.15, myCon.convertCtoK(100.0), 0.1);
    }

    @Test
    public void convertKtoC() {
        Assert.assertEquals(-173.15, myCon.convertKtoC(100.0), 0.1);
    }

    @Test
    public void convertFtoK() {
        Assert.assertEquals(310.93, myCon.convertFtoK(100.0), 0.1);
    }

    @Test
    public void convertKtoF() {
        Assert.assertEquals(-279.67, myCon.convertKtoF(100.0), 0.1);
    }
}