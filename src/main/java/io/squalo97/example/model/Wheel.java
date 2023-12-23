package io.squalo97.example.model;

public class Wheel {
    private byte hp = 100;
    private byte inches;
    private WheelTypeEnum type = WheelTypeEnum.FOUR_SEASON;
    private WheelSideEnum side;
    private byte sidePosition;

    public Wheel(byte inches, WheelSideEnum side, byte sidePosition) {
        this.inches = inches;
        this.side = side;
        this.sidePosition = sidePosition;
    }

    public Wheel(byte inches, WheelTypeEnum type, WheelSideEnum side, byte sidePosition) {
        this(inches, side, sidePosition);
        this.type = type;
    }

    public byte getHp() {
        return hp;
    }

    public void setHp(byte hp) {
        this.hp = hp;
    }

    public byte getInches() {
        return inches;
    }

    public void setInches(byte inches) {
        this.inches = inches;
    }

    public WheelTypeEnum getType() {
        return type;
    }

    public void setType(WheelTypeEnum type) {
        this.type = type;
    }

    public WheelSideEnum getSide() {
        return side;
    }

    public void setSide(WheelSideEnum side) {
        this.side = side;
    }

    public byte getSidePosition() {
        return sidePosition;
    }

    public void setSidePosition(byte sidePosition) {
        this.sidePosition = sidePosition;
    }

    public String printPreassure() {
        String output = "";
        output += sidePosition;
        switch (side) {
            default:
            case LEFT:
                output += "L";
                break;
            case RIGHT:
                output += "R";
        }
        output += ": ok";
        return output;
    }
}
