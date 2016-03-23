package CentralPoint;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.geom.Point2D;

import static org.junit.Assert.assertEquals;

/**
 * Created by jvdwi on 22-3-2016.
 */
public class MaterialTest {
    private Material material;

    /**
     * set up the unittest
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        material = new Material(1, "bla", "bla", new Point2D.Double(12.2222, 12.3), false);
        new Material("bla", "bla2", new Point2D.Double(12.2, 12.3), true);
    }

    /**
     * teardown the unittest
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {

    }

    /**
     * test getting id
     * @throws Exception
     */
    @Test
    public void testGetId() throws Exception {
        assertEquals("ids aren't equal", 1, material.getId());
    }

    /**
     * test getting name
     * @throws Exception
     */
    @Test
    public void testGetName() throws Exception {
        assertEquals("names aren't equal", "bla", material.getName());
    }

    /**
     * test setting name
     * @throws Exception
     */
    @Test
    public void testSetName() throws Exception {
        material.setName("bla2");
        assertEquals("name not changed", "bla2", material.getName());
    }

    /**
     * test getting sort
     * @throws Exception
     */
    @Test
    public void testGetSort() throws Exception {
        assertEquals("sorts aren't equal", "bla", material.getSort());
    }

    /**
     * test setting sort
     * @throws Exception
     */
    @Test
    public void testSetSort() throws Exception {
        material.setSort("bla2");
        assertEquals("sort not changed", "bla2", material.getSort());
    }

    /**
     * test getting location
     * @throws Exception
     */
    @Test
    public void testGetLocation() throws Exception {
        assertEquals("locations aren't equal", new Point2D.Double(12.2222, 12.3), material.getLocation());
    }

    /**
     * test getting locationString
     * @throws Exception
     */
    @Test
    public void testGetLocationString() throws Exception {
        assertEquals("String is incorrect", "12.22; 12.3", material.getLocationString());
    }

    /**
     * test setting location
     * @throws Exception
     */
    @Test
    public void testSetLocation() throws Exception {
        material.setLocation(new Point2D.Double(0.0, 0.0));
        assertEquals("location not changed", new Point2D.Double(0.0, 0.0), material.getLocation());
    }

    /**
     * test getting onLocation
     * @throws Exception
     */
    @Test
    public void testIsOnLocation() throws Exception {
        assertEquals("onLocation isn't correct", false, material.isOnLocation());
    }

    /**
     * test setting onLocation
     * @throws Exception
     */
    @Test
    public void testSetOnLocation() throws Exception {
        material.setOnLocation(true);
        assertEquals("onLocation not changed", true, material.isOnLocation());
    }
}