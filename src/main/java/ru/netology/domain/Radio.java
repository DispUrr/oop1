package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Radio {
    private int currentStation;
    private int minStation = 0;
    private int maxStation = 10;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio(int maxStation) {
        this.maxStation = maxStation;
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
