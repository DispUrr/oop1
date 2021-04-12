package ru.netology.domain;

public class Radio {
    String name;
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;
    private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    // установка границ переключения каналов
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // установка границ переключения громкости
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // условие увеличения громкости на +1
    public void setCurrentVolumeUp() {
        if (currentVolume < maxVolume)
            currentVolume++;
    }

    // условие уменьшения громкости на -1
    public void setCurrentVolumeDown() {
        if (currentVolume > minVolume)
            currentVolume--;
    }

    // переключение канала вперёд
    public void setCurrentStationUp() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    // переключение канала назад
    public void setCurrentStationDown() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

}
