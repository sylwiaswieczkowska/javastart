package pl.sda.javastart.Homework.Train_Tank;

public class Tank {
    private Double massOfTank;
    private String tankName;
    private Integer fuelTankCapacity;
    private Integer tankBurning;

    public int kilometersTankWillDefeat( int fuelAmount){
        return (100* fuelAmount)/tankBurning;
    }
    public Double getMassOfTank() {
        return massOfTank;
    }
    public void setMassOfTank(Double massOfTank) {
        this.massOfTank = massOfTank;
    }
    public String getTankName() {
        return tankName;
    }
    public void setTankName(String tankName) {
        this.tankName = tankName;
    }
    public Integer getFuelTankCapacity() {
        return fuelTankCapacity;
    }
    public void setFuelTankCapacity(Integer fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }
    public Integer getTankBurning() {
        return tankBurning;
    }
    public void setTankBurning(Integer tankBurning) {
        this.tankBurning = tankBurning;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Charakterystyka czołgu:");
        sb.append(" masa = ").append(massOfTank);
        sb.append("t, nazwa = ").append(tankName).append('\'');
        sb.append(", pojemnośc zbiornika paliwa = ").append(fuelTankCapacity);
        sb.append("l, spslsnie = ").append(tankBurning);
        sb.append("na 100km, ");
        return sb.toString();
    }
}
