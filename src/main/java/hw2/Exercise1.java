package hw2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static hw2.ComplexExamples.RAW_DATA;

public class Exercise1 {
    public static void main(String[] args) {
        Exercise1 ex1 = new Exercise1();
        Map<String, Long> sortMap = ex1.distinctPersonAndGroupByNameAndSort(RAW_DATA);
        sortMap.forEach((key, value) -> System.out.println("Key: " + key + "\nValue: " + value));
    }

    public Map<String, Long> distinctPersonAndGroupByNameAndSort(ComplexExamples.Person[] person) {

        return person==null?new HashMap<String,Long>() :Stream.of(person).distinct()
                .collect(Collectors.groupingBy(ComplexExamples.Person::getName, Collectors.counting()));
    }
}