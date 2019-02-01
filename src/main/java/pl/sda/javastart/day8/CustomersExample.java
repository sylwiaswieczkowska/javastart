package pl.sda.javastart.day8;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CustomersExample {

    private static Customer[] people = new Customer[]{
            new Customer("Anna", "Nowak   ", 33, "1200"),
            new Customer("Beata", "Kowalska", 22, "1200"),
            new Customer("Marek", " Nowak", 25, "1250"),
            new Customer("Adam", "Twardowski", 33, "1100"),
            new Customer("Monika  ", "Kos", 25, "2500"),
            new Customer("Adam ", "Rudy", 45, "3333"),
            new Customer("Marek", "Rudy", 15, 2210),
            new Customer("Adam", "Madej", 15, 3333)};

    public static void main(String[] args) {
        System.out.println(customerNamesList());
        System.out.println(customerNamesListWithStream());
        System.out.println(salariesMap());
        System.out.println(salariesMapWithMergedInfosWithStream());
        System.out.println(customerIdMap());
        System.out.println(salaryStatistics());
        System.out.println(nameSalaryStatistics());

    }
    public static List<Customer> customerList() {
        List<Customer> customers = new ArrayList<>();
        for (Customer customer : people) {
            customers.add(customer);
        }
        return customers;
    }
    public List<Customer> customerListWithStream() {
        return Arrays.stream(people)
                .collect(Collectors.toList());
    }
    public List<Customer> customerListWithArrays() {
        return Arrays.asList(people);
    }
    public static List<String> customerNamesList() {
        System.out.println("Lista z imon i nazwisk:");
        List<String> resultList = new ArrayList<>();
        for (Customer customer : people) {
            resultList.add(customer.getFirstName().trim() + " " + customer.getSurname().trim());
        }
        return resultList;
    }
    public static List<String> customerNamesListWithStream() {
        System.out.println("Stream - Lista z imon i nazwisk:");
        return customerList().stream()
                .map(e -> e.getFirstName().trim() + " " + e.getSurname().trim())
                .collect(Collectors.toList());
    }
    public static Map<BigDecimal, List<String>> salariesMap() {
        System.out.println("Mapa osób według zarobków:");
        Map<BigDecimal, List<String>> resultMap = new HashMap<>();
        for (Customer customer : people) {
            if (resultMap.containsKey(customer.getSalary())) {
                List<String> innerList = resultMap.get(customer.getSalary());
                innerList.add(customer.getId() + ", " + customer.getFirstName().trim() + " " + customer.getSurname().trim());
            } else {
                List<String> innerList = new ArrayList<>();//zasieg zmiennej tylko w tym bloku
                innerList.add(customer.getId() + ", " + customer.getFirstName().trim() + " " + customer.getSurname().trim());
                resultMap.put(customer.getSalary(), innerList);
            }
        }
        return resultMap;
    }
    private static Map<BigDecimal, List<Customer>> salariesMapWithStream() {
        return customerList().stream()
                .collect(Collectors.groupingBy(e -> e.getSalary()));
    }
    private static Map<BigDecimal, List<String>> salariesMapWithMergedInfosWithStream() {
        System.out.println("Stream - Mapa osób według zarobków:");
        return customerList().stream()
                .collect(Collectors.groupingBy(e -> e.getSalary(), Collectors.mapping(e -> e.getId() + ", " + e.getFirstName().trim() + ", " + e.getSurname().trim(), Collectors.toList())));
    }
    private static Map<Integer, List<String>> customerIdMap() {
        System.out.println("Mapa osób z Id");
        Map<Integer, List<String>> resultMap = new HashMap<>();
        for (Customer customer : people) {
            if (resultMap.containsKey(customer.getId())) {
                List<String> innerList = resultMap.get(customer.getId());
                innerList.add(customer.getFirstName().trim() + " " + customer.getSurname().trim());
            } else {
                List<String> innerList = new ArrayList<>();
                innerList.add(customer.getFirstName().trim() + " " + customer.getSurname().trim());
                resultMap.put(customer.getId(), innerList);
            }
        }
        return resultMap;
    }
    private static Map<Double, Integer> salaryStatistics() {
        System.out.println("Mapa, statystyka ile jest osób z danymi zarobkami:");
        Map<Double, Integer> resultMap = new HashMap<>();
        for (Customer customer : people) {
            Double salary = customer.getSalary().doubleValue();
            if (resultMap.containsKey(salary)) {
                int counter = resultMap.get(salary);
                resultMap.replace(salary, counter + 1);

            } else {
                resultMap.put(salary, 1);
            }
        }
        return resultMap;
    }
    private static Map<String, Map<BigDecimal, Integer>> nameSalaryStatistics() {
        System.out.println("Mapa map <imię,<zarobki,liczba_osób_z_takimi_zarobkami>>:");
        Map<String, Map<BigDecimal, Integer>> resultMap = new HashMap<>();
        for (Customer customer : people) {
            Map<BigDecimal, Integer> innerMap = new HashMap<>();
            if (resultMap.containsKey(customer.getFirstName().trim())) {
                innerMap = resultMap.get(customer.getFirstName().trim());
                if (innerMap.containsKey(customer.getSalary())) {
                    int counter = innerMap.get(customer.getSalary());
                    innerMap.replace(customer.getSalary(), counter + 1);
                    resultMap.replace(customer.getFirstName().trim(), innerMap);
                } else {
                    innerMap.put(customer.getSalary(), 1);
                    resultMap.put(customer.getFirstName().trim(), innerMap);
                }

            } else {
                innerMap.put(customer.getSalary(), 1);
                resultMap.put(customer.getFirstName().trim(), innerMap);
            }
        }
        return resultMap;
    }
}
