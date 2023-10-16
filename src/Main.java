import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ecMachine = new ArrayList<Integer>();
        ecMachine.add(1);
        ecMachine.add(0);
        ecMachine.add(1);
        ecMachine.add(3);
        ecMachine.add(0);
        ecMachine.add(0);
        // ecMachine.add();
        // ecMachine.add();
        //System.out.println("Hello world!");
        int n = 0;
        while(ecMachine.get(n) != 99 && n < ecMachine.size()){
            if(ecMachine.get(n) == 1){
            ifOne(ecMachine, n);
            }
            else if(ecMachine.get(n) == 2){
                ifTwo(ecMachine, n);
            }
            n++;
        }
       for(int q =0; q < ecMachine.size(); q++)
            System.out.print(ecMachine.get(q));

    }

    public static void ifOne(ArrayList<Integer> ecMachine, int index){
        int sum = ecMachine.get(ecMachine.get(index+1)) + ecMachine.get(ecMachine.get(index+2));
        ecMachine.set(index + 3, sum);
    }
    public static void ifTwo(ArrayList<Integer> ecMachine, int index){
        int product = ecMachine.get(ecMachine.get(index+1)) * ecMachine.get(ecMachine.get(index+2));
        ecMachine.set(index + 3, product);
    }
}