import Planes.MilitaryPlane;
import models.MilitaryType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HasBomberPlanesTest extends BaseTest {

    @Test

    public void testHasAtLeastOneBomberInMilitaryPlanes() {

        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        Assert.assertTrue(bomberMilitaryPlanes.stream().anyMatch(p->p.getType()==MilitaryType.BOMBER));
    }




}