package unit;

import org.example.CarPropertyFinder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.example.Car;

public class CarPropertyFinderUnitTest {

    private Car validCar;
    private Car classicCar;

    @Before
    public void setUp(){
        validCar = new Car("Volkswagen", "Jetta", 2017);
        classicCar = new Car("Volkswagen", "Beetle", 1965);
    }

    @Test
    public void validateTransmissionType(){
        CarPropertyFinder fixture = new CarPropertyFinder(validCar);

        String expected = "rear-wheel";
        String actual = fixture.getTransmissionLayout();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void validateClassicCar(){
        CarPropertyFinder fixture = new CarPropertyFinder(classicCar);

        Assert.assertTrue(fixture.isClassic());
    }

    @Test
    public void validateNonClassicCar(){
        CarPropertyFinder fixture = new CarPropertyFinder(validCar);

        Assert.assertFalse(fixture.isClassic());
    }

     // example of fuzzing
    // negative testing/assertions
    // security testing
    @FuzzTest
    public void roadSerializerTest(FuzzedDataProvider data){
        // automatically generated inputs by CIFUZZ
        initializedRoad.deserialize(data.consumeBytes());

        // test that exception is thrown/not thrown as needed
        Integer actual;

        Assert.assertTrue(actual > 0.0);
        Assert.assertEquals(""); // OOM never happes
        Assert.assertEquals(); //
        // fuzzing as negative testing
        // assert not null for inputs
        // assert no IOException, StackOverlflowException
    }

}
