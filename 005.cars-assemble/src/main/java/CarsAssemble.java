public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        // return (double) 221 * speed * 0.85;
        if (speed == 0) {
            return 0;
        } else if (speed >= 1 && speed <= 4) {
            return (double) 221 * speed;
        } else if (speed >= 5 && speed <= 8) {
            return (double) 221 * speed * 0.9;
        } else if (speed == 9 ) {
            return (double) 221 * speed * 0.8;
        } else if (speed == 10) {
            return (double) 221 * speed * 0.77;
        }
        return (double) 0;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
