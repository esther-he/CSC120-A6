import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest {
    /**
     * 1)
     * Tests that the Computer constructor uses the given price argument to create the Computer object.
     */
    @Test
    public void testComputerConstructorPrice() {
        Computer myComp = new Computer("2019 MacBook Pro", "Intel", 256, 64, "High Sierra", 2019, 1000);
        assertEquals(1000, myComp.price);
    }

    /**
     * 2)
     * Tests that the Computer constructor uses the given memory argument to create the Computer object.
     */
    @Test
    public void testComputerConstructorMemory() {
        Computer myComp = new Computer("2019 MacBook Pro", "Intel", 256, 64, "High Sierra", 2019, 1000);
        assertEquals(64, myComp.memory);
    }

    /**
     * 3)
     * Tests that the setOS method sets the OS variable to the given OS.
     */
    @Test
    public void testSetOS() {
        Computer myComp = new Computer("2019 MacBook Pro", "Intel", 256, 64, "High Sierra", 2019, 1000);
        myComp.setOS("OS");
        assertEquals("OS", myComp.operatingSystem);
    }

    /**
     * 4)
     * Tests that the buy() method adds the given computer to the shop's inventory.
     */
    @Test
    public void testBuy() throws Exception {
        ResaleShop shop = new ResaleShop();
        Computer comp = new Computer("2019 MacBook Pro", "Intel", 256, 64, "High Sierra", 2019, 1000);
        shop.buy(comp);
        assertTrue(shop.inventory.contains(comp));
    }

    /**
     * 5)
     * Tests that the buy method throws an Exception when a computer is already in the inventory.
     */
    @Test(expected = Exception.class)
    public void testBuyException() throws Exception {
        ResaleShop shop = new ResaleShop();
        Computer sameComp = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        shop.buy(sameComp);
    }
    
    /**
     * 6)
     * Tests that the sell method throws an Exception when the computer is not in the inventory.
     */
    @Test(expected = Exception.class)
    public void testSellException() throws Exception {
        ResaleShop shop = new ResaleShop();
        Computer comp = new Computer("New MacBook Pro", "Intel", 256, 64, "High Sierra", 2019, 1000);
        shop.sell(comp);
    }

    /**
     * 7)
     * Tests if the printInventory method throws an exception when printing the inventory.
     */
    @Test
    public void testPrintInventory() {
        ResaleShop shop = new ResaleShop();
        try {
            shop.printInventory();
        } catch (Exception e){
            fail(e.toString());
        }
    }

    /**
     * 8)
     * Tests that the refurbish method updates the OS.
     */
    @Test 
    public void testRefurbishOS() throws Exception {
        ResaleShop shop = new ResaleShop();
        Computer comp = shop.inventory.get(0);
        shop.refurbish(comp, "new os");
        assertEquals("new os", comp.operatingSystem);
    }

    /**
     * 9)
     * Tests that the toString method returns the correct stats in the string for the computer.
     */
    @Test
    public void testToString() {
        Computer comp = new Computer("2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000);
        assertEquals("2019 MacBook Pro\nIntel\n256\n 16 \nHigh Sierra\n2019\n1000", comp.toString());
    }

    /**
     * 10)
     * Tests that the refurbish method throws an exception if the Computer is not in the inventory.
     */
    @Test
    public void testRefurbishException() throws Exception {
        ResaleShop shop = new ResaleShop();
        Computer notInInv = new Computer("New MacBook Pro", "Intel", 256, 64, "High Sierra", 2018, 1000);
        shop.refurbish(notInInv, "newOS");
    }
}

