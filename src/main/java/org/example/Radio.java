package org.example;

public class Radio {
    private int currentStationNumber;
    private int currentVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber >= 0 && currentStationNumber <= 9) {
            this.currentStationNumber = currentStationNumber;
        }
    }

    public void next() {
        if (currentStationNumber == 9) {
            currentStationNumber = 0;
        } else {
            currentStationNumber = currentStationNumber + 1;
        }
    }

    public void prev() {
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
        } else {
            currentStationNumber = currentStationNumber - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}