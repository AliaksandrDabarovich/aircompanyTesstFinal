import Planes.PassengerPlane;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxPassengerCapacityTest extends BaseTest{
    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {


        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        Assert.assertTrue(expectedPlaneWithMaxPassengersCapacity.equals(planeWithMaxPassengerCapacity));
    }
}
