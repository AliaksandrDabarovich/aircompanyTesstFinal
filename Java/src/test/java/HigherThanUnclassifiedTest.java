import Planes.ExperimentalPlane;
import models.ClassificationLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class HigherThanUnclassifiedTest extends BaseTest {
    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){


        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        Assert.assertFalse(experimentalPlanes.stream().anyMatch(p->p.getClassificationLevel()== ClassificationLevel.UNCLASSIFIED));

    }
}
