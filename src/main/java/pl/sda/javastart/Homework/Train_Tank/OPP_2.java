package pl.sda.javastart.Homework.Train_Tank;

import java.util.Arrays;

public class OPP_2 {
    public static void main(String[] args) {
        newTrain();
        Train train = new Train();
        train.setNumberOfCars(4);
        train.setNumberOfPassengers(765);
        train.setTrainName("Telimena");
        train.setTrainWeight(78.6);
        train.attachSingleCar(new TrainCar(15.9,"Pierwsza",67,false));
        train.attachSingleCar(new TrainCar(16.9,"Druga",87,true));
        System.out.println(train);
    }

    private static void newTrain() {
        Train train = new Train();
        train.setNumberOfCars(4);
        train.setNumberOfPassengers(765);
        train.setTrainName("Telimena");
        train.setTrainWeight(78.6);

        TrainCar trainCar1 = new TrainCar();
        trainCar1.setCarClass("Pierwsza");
        trainCar1.setCarWeight(15.9);
        trainCar1.setNumberOfPassengers(67);
        trainCar1.setFoodAvailable(false);

        TrainCar trainCar2 = new TrainCar();
        trainCar2.setCarClass("Druga");
        trainCar2.setCarWeight(16.9);
        trainCar2.setNumberOfPassengers(60);
        trainCar2.setFoodAvailable(false);

        TrainCar trainCar3 = new TrainCar();
        trainCar3.setCarClass("Wars");
        trainCar3.setCarWeight(17.9);
        trainCar3.setNumberOfPassengers(30);
        trainCar3.setFoodAvailable(true);

        TrainCar[] attachedCar = new TrainCar[]{trainCar1,trainCar2,trainCar3};
        train.setAttachedCars(attachedCar);

        System.out.println(train);
    }
}
