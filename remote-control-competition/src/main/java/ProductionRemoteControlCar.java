class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceUnits = 0;
    private int numberOfVictories = 0;
    public void drive() {
        distanceUnits += 10;
    }
    public int getDistanceTravelled() {
        return distanceUnits;
    }
    public int getNumberOfVictories() {
        return numberOfVictories;
    }
    public void setNumberOfVictories(int numberOfVictories) {
        
        this.numberOfVictories = numberOfVictories;
    }
    public int compareTo(ProductionRemoteControlCar arg0) {
        return arg0.getNumberOfVictories() - this.getNumberOfVictories();
    }
}
