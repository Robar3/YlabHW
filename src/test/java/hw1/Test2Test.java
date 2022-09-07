package hw1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test2Test {

    Test2 test2 = new Test2();
    int[] arr={5,6,3,2,5,1,4,9};
    int[] sortArr={1, 2, 3, 4, 5, 5, 6, 9};

    int[] voidArr={};
    int[] sortVoidArr={};

    @Test
    public void  quickSortTest(){
        test2.quickSort(arr,0,arr.length-1);
      Assertions.assertArrayEquals(sortArr,arr);
    }
    @Test
    public void quickSortEmptyTest(){
        test2.quickSort(voidArr,0,arr.length-1);
        Assertions.assertArrayEquals(sortVoidArr,voidArr);
    }
}