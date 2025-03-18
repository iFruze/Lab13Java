package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CarTest {

    @Test
    public void test() {
        Car car = new Car();
        assertFalse(car.car());
    }
}
