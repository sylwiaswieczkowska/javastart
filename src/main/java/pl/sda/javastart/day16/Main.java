package pl.sda.javastart.day16;

public class Main {
    public static void main(String[] args) {
        String typeOfOperation = args[0];
        String firstOperand = args[1];
        String secondOperand = args[2];

        
        System.out.println(typeOfOperation + ", " + firstOperand + ", " + secondOperand);
        int first = Integer.valueOf(firstOperand);
        int second = Integer.valueOf(secondOperand);

        if(typeOfOperation.equals("dodaj")){
            int sum = first + second;
            System.out.println(sum);
        }else if(typeOfOperation.equals("odejmij")){
            int difference = first -second;
            System.out.println(difference);
        }else if(typeOfOperation.equals("pomnóż")){
            int multiplication = first * second;
            System.out.println(multiplication);
        }else if(typeOfOperation.equals("podziel")){
            int division = first / second;
            System.out.println(division);

        }
    }
}
