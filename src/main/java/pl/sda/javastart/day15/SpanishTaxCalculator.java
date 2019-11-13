package pl.sda.javastart.day15;

public class SpanishTaxCalculator implements TaxCalculator {

    @Override
    public int calculateTax(int amountToCalculate) {
        return (int) (amountToCalculate * 1.29);
    }
}
