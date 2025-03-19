
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    @Test
    public void testBikeCanTurnOnAndOff() {
        AutomaticBike bike = new AutomaticBike();
        assertFalse(bike.isOn());

        bike.turnOn();
        assertTrue(bike.isOn());

        bike.turnOff();
        assertFalse(bike.isOn());
    }

   @Test
   public void testBikeCanAccelerate(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.accelerate();
       bike.accelerate();
       bike.accelerate();
       bike.accelerate();
       bike.accelerate();
       assertEquals(1, bike.getGear());

   }
   @Test
   public void testBikeCanDecelerate(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.accelerate();
        bike.accelerate();
        assertEquals(2, bike.getSpeed());
        bike.decelerate();
        assertEquals(1, bike.getSpeed());
   }


    @Test
    public void testBikeAcceleratesCorrectlyInGearOne() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();

        bike.accelerate();
        assertEquals(1, bike.getSpeed());
        assertEquals(1, bike.getGear());

        bike.accelerate();
        assertEquals(2, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void testBikeAutomaticallyChangesToGearTwo() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();

        for (int i = 0; i < 21; i++) {
            bike.accelerate();
        }

        assertEquals(21, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void testBikeDeceleratesCorrectlyInGearTwo() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();

        for (int acceleration  = 0; acceleration < 25; acceleration++) {
            bike.accelerate();
        }
        assertEquals(29, bike.getSpeed());
        assertEquals(2, bike.getGear());

        bike.decelerate();
        assertEquals(27, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void testBikeDoesNotAccelerateWhenOff() {
        AutomaticBike bike = new AutomaticBike();

        bike.accelerate();
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void testBikeGearFourForHighSpeed() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();

        for (int i = 0; i < 50; i++) {
            bike.accelerate();
        }

        assertEquals(123, bike.getSpeed());
        assertEquals(4, bike.getGear());
    }
}
