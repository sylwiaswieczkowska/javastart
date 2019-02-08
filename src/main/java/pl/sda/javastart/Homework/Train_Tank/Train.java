package pl.sda.javastart.Homework.Train_Tank;

import java.util.Arrays;

public class Train {

    private Double trainWeight;
    private String trainName;
    private Integer numberOfPassengers;
    private Integer numberOfCars;
    private TrainCar[] attachedCars;

    public void attachSingleCar(TrainCar singleCar) {

        if (getAttachedCars() == null) {
            setAttachedCars(new TrainCar[]{});
        }
        attachedCars = Arrays.copyOf(attachedCars, attachedCars.length + 1);
        attachedCars[attachedCars.length - 1] = singleCar;
    }
    public Double getTrainWeight() {
        return trainWeight;
    }

    public void setTrainWeight(Double trainWeight) {
        this.trainWeight = trainWeight;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(Integer numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public Integer getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(Integer numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public TrainCar[] getAttachedCars() {
        return attachedCars;
    }

    public void setAttachedCars(TrainCar[] attachedCars) {
        this.attachedCars = attachedCars;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Charakterystyka pociagu: ");
        sb.append("masa pociągu = ").append(trainWeight);
        sb.append("t, nazwa pociągu = ").append(trainName);
        sb.append(", liczba pasażerów = ").append(numberOfPassengers);
        sb.append(", liczba wagonów = ").append(numberOfCars);
        sb.append(", charakterystyka wagonów: ").append(Arrays.toString(attachedCars));
        return sb.toString();
    }
}
