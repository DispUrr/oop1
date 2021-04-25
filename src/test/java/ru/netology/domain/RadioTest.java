package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldUseRadio(){
        Radio radio = new Radio(37);
        assertEquals(37, radio.getMaxStation());

    }

    // Громкость
    @Test
    public void shouldChangeVolume(){
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());

    }
    @Test
    public void shouldChangeVolumeOverMax(){
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void shouldChangeVolumeUnderMin(){
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldChangeVolumeUp(){
        radio.setCurrentVolume(6);
        radio.setCurrentVolumeUp();
        assertEquals(7, radio.getCurrentVolume());

    }

    @Test
    public void shouldChangeVolumeDown(){
        radio.setCurrentVolume(6);
        radio.setCurrentVolumeDown();
        assertEquals(5, radio.getCurrentVolume());

    }

    @Test
    public void shouldChangeVolumeDownUnderMin(){
        radio.setCurrentVolume(0);
        radio.setCurrentVolumeDown();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldChangeVolumeUpOverMax(){
        radio.setCurrentVolume(101);
        radio.setCurrentVolumeUp();
        assertEquals(100, radio.getCurrentVolume());

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
    public void shouldChangeStationUnderMinConstructor(){
        Radio radio = new Radio(37);
        radio.setCurrentStation(-5);
        assertEquals(37, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationUp(){
        radio.setCurrentStation(5);
        radio.setCurrentStationUp();
        assertEquals(6, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationUpConstructor(){
        Radio radio = new Radio(41);
        radio.setCurrentStation(16);
        radio.setCurrentStationUp();
        assertEquals(17, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationDown(){
        radio.setCurrentStation(5);
        radio.setCurrentStationDown();
        assertEquals(4, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationDownConstructor(){
        Radio radio = new Radio(31);
        radio.setCurrentStation(9);
        radio.setCurrentStationDown();
        assertEquals(8, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationUpOverMax(){
        radio.setCurrentStation(10);
        radio.setCurrentStationUp();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationUpOverMaxConstructor(){
        Radio radio = new Radio(78);
        radio.setCurrentStation(78);
        radio.setCurrentStationUp();
        assertEquals(0, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationDownUnderMin(){
        radio.setCurrentStation(0);
        radio.setCurrentStationDown();
        assertEquals(10, radio.getCurrentStation());

    }

    @Test
    public void shouldChangeStationDownUnderMinConstructor(){
        Radio radio = new Radio(403);
        radio.setCurrentStation(0);
        radio.setCurrentStationDown();
        assertEquals(403, radio.getCurrentStation());

    }

}
