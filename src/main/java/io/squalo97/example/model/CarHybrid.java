package io.squalo97.example.model;

public class CarHybrid extends Car {
    private int batteryW = 1000;
    private short horsePowerElectric = 80;

    public int getBatteryW() {
        return batteryW;
    }

    public void setBatteryW(int batteryW) {
        this.batteryW = batteryW;
    }

    public short getHorsePowerElectric() {
        return horsePowerElectric;
    }

    public void setHorsePowerElectric(short horsePowerElectric) {
        this.horsePowerElectric = horsePowerElectric;
    }

    @Override
    public void accelerate() {
        System.out.println("tzzz");
    }
}
