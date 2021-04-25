package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();
    // Громкость
    @Test
    public void shouldChangeVolume(){
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());

    }
    @Test
    public void shouldChangeVolumeOverMax(){
        radio.setCurrentVolume(15);
        assertEquals(15, radio.getCurrentVolume());

    }

    @Test
    public void shouldChangeVolumeUnderMin(){
        radio.setCurrentVolume(-7);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldChangeVolumeUp(){
        radio.setCurrentVolume(6);
        radio.setCurrentVolumeUp();
        assertEquals(7, radio.getCurrentVolume());

    }

    @Test
    public void shouldChangeVolumeDowm(){
        radio.setCurrentVolume(6);
        radio.setCurrentVolumeDown();
        assertEquals(5, radio.getCurrentVolume());

    }

    @Test
    public void shouldChangeVolumeDowmUnderMin(){
        radio.setCurrentVolume(0);
        radio.setCurrentVolumeDown();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldChangeVolumeUpOverMax(){
        radio.setCurrentVolume(16);
        radio.setCurrentVolumeUp();
        assertEquals(17, radio.getCurrentVolume());

    }
    // Станции
    @Test
    public void shouldChangeStation(){
        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationConstructor(){
        Radio radio = new Radio(37);
        radio.setCurrentStation(17);
        assertEquals(17, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationOverMax(){
        radio.setCurrentStation(17);
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationOverMaxConstructor(){
        Radio radio = new Radio(37);
        radio.setCurrentStation(45);
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationUnderMin(){
        radio.setCurrentStation(-5);
        assertEquals(10, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationUp(){
        radio.setCurrentStation(5);
        radio.setCurrentStationUp();
        assertEquals(6, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationDowm(){
        radio.setCurrentStation(5);
        radio.setCurrentStationDown();
        assertEquals(4, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationUpOverMax(){
        radio.setCurrentStation(10);
        radio.setCurrentStationUp();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationDowmUnderMin(){
        radio.setCurrentStation(0);
        radio.setCurrentStationDown();
        assertEquals(10, radio.getCurrentStation());

    }

}
