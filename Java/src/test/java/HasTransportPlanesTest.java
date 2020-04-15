import models.MilitaryType;
import org.testng.Assert;
import org.testng.annotations.Test;
import Planes.MilitaryPlane;
import java.util.List;

public class HasTransportPlanesTest extends BaseTest{

    @Test
    public void testHasAtLeastOneTransportMilitaryPlanes() {


        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        Assert.assertTrue(transportMilitaryPlanes.stream().anyMatch(p -> p.getType() == MilitaryType.TRANSPORT));
    }


}
