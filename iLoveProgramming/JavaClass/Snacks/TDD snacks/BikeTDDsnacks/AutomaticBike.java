
public class AutomaticBike {
    private boolean isOn;
    private int speed;
    private int gear;

    public AutomaticBike() {
        this.isOn = false;
        this.speed = 0;
        this.gear = 1;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
        this.speed = 0;
        this.gear = 1;
    }

    public void accelerate() {
        if (!isOn) return;

        switch (gear) {
            case 1 -> speed += 1;
            case 2 -> speed += 2;
            case 3 -> speed += 3;
            case 4 -> speed += 4;
        }
        updateGear();
    }

    public void decelerate() {
        if (!isOn || speed <= 0) return;

        switch (gear) {
            case 1 -> speed -= 1;
            case 2 -> speed -= 2;
            case 3 -> speed -= 3;
            case 4 -> speed -= 4;
        }
        if (speed < 0) speed = 0;
        updateGear();
    }

    private void updateGear() {
        if (speed >= 0 && speed <= 20) {
            gear = 1;
        } else if (speed >= 21 && speed <= 30) {
            gear = 2;
        } else if (speed >= 31 && speed <= 40) {
            gear = 3;
        } else if (speed >= 41) {
            gear = 4;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }
}
