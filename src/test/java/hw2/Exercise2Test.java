package hw2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Exercise2Test {

    Exercise2 ex2 = new Exercise2();
    Integer[] arr={3, 4, 2, 7};
    int[]expected={3,7};
    Integer[] arr2={5,5,5,5,5};
    int[]expected2={5,5};

    Integer[] arr3={};
    int[]expected3=new int[2];

    @Test
    void sumNumbersTest() {
        Assertions.assertArrayEquals(expected,ex2.sumNumbers(arr,10));;
    }
    @Test
    void sumNumbersIdenticalNumbersTest() {
        Assertions.assertArrayEquals(expected2,ex2.sumNumbers(arr2,10));;
    }
    @Test
    void sumNumbersEmptyArrTest() {
        Assertions.assertArrayEquals(expected3,ex2.sumNumbers(arr3,10));;
    }
}