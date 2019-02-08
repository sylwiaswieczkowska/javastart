package pl.sda.javastart.Homework.Train_Tank;

public class TrainCar {
    private Double carWeight;
    private String carClass;
    private Integer numberOfPassengers;
    private Boolean foodAvailable;

    public TrainCar() {
    }
    public TrainCar(Double carWeight, String carClass, Integer numberOfPassengers, Boolean foodAvailable) {
        this.carWeight = carWeight;
        this.carClass = carClass;
        this.numberOfPassengers = numberOfPassengers;
        this.foodAvailable = foodAvailable;
    }
    public Double getCarWeight() {
        return carWeight;
    }
    public void setCarWeight(Double carWeight) {
        this.carWeight = carWeight;
    }
    public String getCarClass() {
        return carClass;
    }
    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }
    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }
    public void setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    public Boolean getFoodAvailable() {
        return foodAvailable;
    }
    public void setFoodAvailable(Boolean foodAvailable) {
        this.foodAvailable = foodAvailable;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("wagon: ");
        sb.append("masa wagonu = ").append(carWeight);
        sb.append(", klasa wagaonu = ").append(carClass);
        sb.append(", liczba pasażerów = ").append(numberOfPassengers);
        sb.append(", dostępnośc jedzenia = ").append(foodAvailable);
        sb.append(',');
        return sb.toString();
    }
}
