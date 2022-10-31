import org.example.ComplexNumber;
import org.junit.Assert;
import org.junit.Test;

public class ComplexNumberUnitTest {

    public ComplexNumber fixture;

    @Test
    public void zeroConstructor(){
        fixture = new ComplexNumber();

        Double expected = 0.0;
        Double actualReal = fixture.getRealPart();
        Double actualImaginary = fixture.getImaginaryPart();

        Assert.assertEquals(expected, actualReal);
        Assert.assertEquals(expected, actualImaginary);
    }

    @Test
    public void nontrivalConstructor(){
        fixture = new ComplexNumber(1.0, 2.0);

        Double expectedReal = 1.0;
        Double expectedImaginary = 2.0;
        Double actualReal = fixture.getRealPart();
        Double actualImaginary = fixture.getImaginaryPart();

        Assert.assertEquals(expectedReal, actualReal);
        Assert.assertEquals(expectedImaginary, actualImaginary);
    }

    @Test
    public void zeroLength(){
        fixture = new ComplexNumber();

        Double expected = 0.0;
        Double actual = fixture.getLength();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nonzeroLength(){
        fixture = new ComplexNumber(3.0, 4.0);

        Double expected = 5.0;
        Double actual = fixture.getLength();

        Assert.assertEquals(expected, actual);
    }

}
