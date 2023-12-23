package io.squalo97.example.model;

public class Car implements Vehicle {
    private Wheel[] wheels = new Wheel[4];
    private short horsepower = 250;
    private float weight = 2_000;
    private FuelEnum fuel = FuelEnum.GASOLINE;
    private boolean leatherIntern = true;
    private String paint = "Blue";

    public Car() {
        Wheel wheel = new Wheel((byte) 17, WheelTypeEnum.WINTER, WheelSideEnum.LEFT, (byte) 1);
        wheels[0] = wheel;
        wheel = new Wheel((byte) 17, WheelTypeEnum.WINTER, WheelSideEnum.RIGHT, (byte) 1);
        wheels[1] = wheel;
        wheel = new Wheel((byte) 17, WheelTypeEnum.WINTER, WheelSideEnum.LEFT, (byte) 2);
        wheels[2] = wheel;
        wheel = new Wheel((byte) 17, WheelTypeEnum.WINTER, WheelSideEnum.RIGHT, (byte) 2);
        wheels[3] = wheel;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public short getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(short horsepower) {
        this.horsepower = horsepower;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public FuelEnum getFuel() {
        return fuel;
    }

    public void setFuel(FuelEnum fuel) {
        this.fuel = fuel;
    }

    public boolean isLeatherIntern() {
        return leatherIntern;
    }

    public void setLeatherIntern(boolean leatherIntern) {
        this.leatherIntern = leatherIntern;
    }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public String printPreassure() {
        String output = "";
        for (int i = 0; i < wheels.length; i++) {
            if (i > 0) {
                output += " ";
            }
            output += wheels[i].printPreassure();
        }
        return output;
    }

    @Override
    public void accelerate() {
        System.out.println("brum");
    }

    @Override
    public void stop() {
        System.out.println("stonk");
    }

    @Override
    public void reverse() {
        System.out.println("brum");
    }
}
