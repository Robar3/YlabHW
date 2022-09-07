package hw2;

import java.util.Map;
import java.util.TreeMap;


import static hw2.ComplexExamples.RAW_DATA;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        System.out.println(ex1.distinctPersonAndGroupByNameAndSort(RAW_DATA));
    }

    public Map<String,Integer> distinctPersonAndGroupByNameAndSort(ComplexExamples.Person[] person){
        Map<String,Integer> sortMap=new TreeMap<>();
        int id=0;
        for (ComplexExamples.Person rawDatum : person) {
            if (rawDatum.getId() == id) {
                if (!sortMap.containsKey(rawDatum.getName())) {
                    sortMap.put(rawDatum.getName(), 1);
                } else {
                    sortMap.put(rawDatum.getName(), sortMap.get(rawDatum.getName()) + 1);
                }
                id++;
            }
        }
        return sortMap;
    }
}
