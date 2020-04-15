import Planes.Plane;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SortByMaximumLoadCapacityTest extends BaseTest {
    @Test
    public void testSortByMaximumLoadCapacity() {

        airport.sortByMaximumLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();
        Assert.assertTrue(airport.verifyOrder(planesSortedByMaxLoadCapacity));
    }
}
