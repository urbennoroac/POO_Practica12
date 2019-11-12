import java.util.*;
public class WhaleDataCalculator2 {
        public int processRecord(int input){
                try{
                        Thread.sleep(10);
                } catch (InterruptedException e){
                }
                return input+1;
        }
        public void processAllData(List<Integer>data){
                data.parallelStream().map(a -> processRecord(a)).count();
        }

        public static void main(String[] args){
                WhaleDataCalculator2 calculator = new WhaleDataCalculator2();

                List<Integer> data = new ArrayList<Integer>();
                for (int i=0;i<4000;i++) data.add(i);

                        long start = System.currentTimeMillis();
                calculator.processAllData(data);
                double time = (System.currentTimeMillis()-start)/1000.0;

                System.out.println("\nTasks completed in: "+time+" seconds");
        }
}