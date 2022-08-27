import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Test1 {

    public static void main(String[] args) {
        int lengthArr = 15;
        Test1 test1 = new Test1();
            test1.minMaxAVG(lengthArr);
    }

    public int rnd(int max) {
        Date time0 = new Date();
        String t0 = Long.toString(time0.getTime());
        String ee= t0.substring(t0.length()-1);
        int lastSymbol=Integer.parseInt(ee);
        AtomicInteger i = new AtomicInteger();
        Thread rnd =new Thread(()->{
            while (!Thread.currentThread().isInterrupted()){
                if (i.get()<max){
                    i.getAndIncrement();
                }else {
                    i.set(0);
                }
            }
        });
        rnd.start();
        try {
            if (lastSymbol>0)
            Thread.sleep(lastSymbol);
            else Thread.sleep(4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        rnd.interrupt();
        return i.get();
    }

    public void minMaxAVG(int length) {
        int[][] arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = rnd(1000000);
            }

        }
        int min = arr[0][0];
        int max = arr[0][0];
        int sum = 0;
        for (int[] a : arr) {
            for (int b : a) {
                if (b < min) min = b;
                if (b > max) max = b;
                sum += b;
            }
        }
        for (int[] a :
                arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("avg = " + (sum / (length * length)));

    }
}
