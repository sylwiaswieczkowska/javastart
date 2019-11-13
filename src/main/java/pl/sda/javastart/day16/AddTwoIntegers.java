package pl.sda.javastart.day16;

public class AddTwoIntegers {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;

        int sum = firstNumber + secondNumber;
        StringBuilder sb = new StringBuilder();
        sb.append("The sum is: ");
        sb.append(sum);
        System.out.println(sb.toString());
    }
}
