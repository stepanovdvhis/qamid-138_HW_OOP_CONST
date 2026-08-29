package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(5);

        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    void shouldNotSetStationBelowZero() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);

        radio.setCurrentStationNumber(-1);

        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    void shouldNotSetStationAboveNine() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);

        radio.setCurrentStationNumber(10);

        assertEquals(5, radio.getCurrentStationNumber());
    }

    @Test
    void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);

        radio.next();

        assertEquals(6, radio.getCurrentStationNumber());
    }

    @Test
    void shouldSwitchFromNineToZero() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.next();

        assertEquals(0, radio.getCurrentStationNumber());
    }

    @Test
    void shouldSwitchToPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(5);

        radio.prev();

        assertEquals(4, radio.getCurrentStationNumber());
    }

    @Test
    void shouldSwitchFromZeroToNine() {
        Radio radio = new Radio();

        radio.prev();

        assertEquals(9, radio.getCurrentStationNumber());
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolumeAbove100() {
        Radio radio = new Radio();

        for (int i = 0; i < 100; i++) {
            radio.increaseVolume();
        }

        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBelowZero() {
        Radio radio = new Radio();

        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }
}