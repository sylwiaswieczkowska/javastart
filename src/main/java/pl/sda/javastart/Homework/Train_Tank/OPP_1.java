package pl.sda.javastart.Homework.Train_Tank;

public class OPP_1 {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.setFuelTankCapacity(1200);
        tank.setMassOfTank(55.15);
        tank.setTankBurning(550);
        tank.setTankName("Leopard");
        System.out.println(tank.toString());
        System.out.println("Czołg przejedzie: " + tank.kilometersTankWillDefeat(1200) + "km.");
    }
}
