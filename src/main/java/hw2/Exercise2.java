package hw2;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 ex2 =new Exercise2();
        Integer[] arr={3, 4, 2, 7};
        System.out.println(Arrays.toString(ex2.sumNumbers(arr,10)));

    }

    public int[] sumNumbers(Integer[] arr,int number){
        int[] result=new int[2];
        List<Integer> list = Arrays.asList(arr);
        for (int i = 0; i < arr.length; i++) {
           if (list.contains(number-list.get(i))){
               result[0]=list.get(i);
               result[1]=number-list.get(i);
               return result;
           }
        }
        return result;
    }
}
