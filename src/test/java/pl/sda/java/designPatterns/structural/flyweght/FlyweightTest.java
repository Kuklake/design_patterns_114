package pl.sda.java.designPatterns.structural.flyweght;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightTest {

    @Test
    void shouldReturnSameObjectWithColorPink() {
        Color pink = Color.PINK;

        Vehicle veh1 = VehicleFactory.createVehicle(pink);
        Vehicle veh2 = VehicleFactory.createVehicle(pink);

        assertTrue(veh1 == veh2);
    }

    @Test
    void shouldReturnDiffObjectsWithDiffColors() {
        Color pink = Color.PINK;
        Color blue = Color.BLUE;

        Vehicle veh1 = VehicleFactory.createVehicle(pink);
        Vehicle veh2 = VehicleFactory.createVehicle(blue);

        assertFalse(veh1 == veh2);
    }
}