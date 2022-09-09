package hw2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static hw2.ComplexExamples.RAW_DATA;


class Ex1Test {

    Ex1 ex1 = new Ex1();
    Map<String, Long> sortMap = ex1.distinctPersonAndGroupByNameAndSort(RAW_DATA);
    Map<String, Long> expected = new HashMap<>();





    @Test
    void distinctPersonAndGroupByNameAndSortTest() {
        expected.put("Amelia",(long) 4);
        expected.put("Emily",(long)1);
        expected.put("Harry",(long)3);
        expected.put("Jack",(long)1);
        Assertions.assertEquals(expected,sortMap);
    }
}