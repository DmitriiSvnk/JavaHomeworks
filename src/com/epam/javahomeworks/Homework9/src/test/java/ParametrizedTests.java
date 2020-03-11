import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

public class ParametrizedTests {
    static TemperatureConverter myCon = new TemperatureConverter();

    @RunWith(Parameterized.class)
    public static class CheckConversionCtoF {
        public double value;
        public double expected;

        public CheckConversionCtoF (double value, double expected) {
            this.value = value;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Collection <Object []> getTestData () {
            return Arrays.asList(new Object[][]{
                    {10.0, 50.0},
                    {21.0, 69.8},
                    {-21.0, -5.8},
                    {0, 32.0},
                    {0.8, 33.4}
            });
        }

        @Test
        public void CheckConversionCtoFHappyPath () {
            double result = myCon.convertCtoF(value);
            Assert.assertEquals("Result" + result + " isn’t equals to :" + expected, expected, result, 0.1);
        }
    }

    @RunWith(Parameterized.class)
    public static class CheckConversionCtoK {
        public double value;
        public double expected;

        public CheckConversionCtoK (double value, double expected) {
            this.value = value;
            this.expected = expected;
        }
        @Parameterized.Parameters
        public static Collection <Object []> getTestData () {
            return Arrays.asList(new Object[][]{
                    {777.0, 1050.2},
                    {0.0, 273.2},
                    {-208.0, 65.2},
                    {-323.2, -50.0},
                    {0.4, 273.6}
            });
        }

        @Test
        public void CheckConversionCtoKHappyPath () {
            double result1 = myCon.convertCtoK(value);
            Assert.assertEquals("Result " + result1 + " isn’t equals to :" + expected, expected, result1, 0.1);
        }
    }
}