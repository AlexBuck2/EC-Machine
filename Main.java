import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       int []ecMachine = new int [] {3,225,1,225,6,6,1100,1,238,225,104,0,1102,72,20,224,1001,224,-1440,224,4,224,102,8,223,223,1001,224,5,224,1,224,223,223,1002,147,33,224,101,-3036,224,224,4,224,102,8,223,223,1001,224,5,224,1,224,223,223,1102,32,90,225,101,65,87,224,101,-85,224,224,4,224,1002,223,8,223,101,4,224,224,1,223,224,223,1102,33,92,225,1102,20,52,225,1101,76,89,225,1,117,122,224,101,-78,224,224,4,224,102,8,223,223,101,1,224,224,1,223,224,223,1102,54,22,225,1102,5,24,225,102,50,84,224,101,-4600,224,224,4,224,1002,223,8,223,101,3,224,224,1,223,224,223,1102,92,64,225,1101,42,83,224,101,-125,224,224,4,224,102,8,223,223,101,5,224,224,1,224,223,223,2,58,195,224,1001,224,-6840,224,4,224,102,8,223,223,101,1,224,224,1,223,224,223,1101,76,48,225,1001,92,65,224,1001,224,-154,224,4,224,1002,223,8,223,101,5,224,224,1,223,224,223,4,223,99,0,0,0,677,0,0,0,0,0,0,0,0,0,0,0,1105,0,99999,1105,227,247,1105,1,99999,1005,227,99999,1005,0,256,1105,1,99999,1106,227,99999,1106,0,265,1105,1,99999,1006,0,99999,1006,227,274,1105,1,99999,1105,1,280,1105,1,99999,1,225,225,225,1101,294,0,0,105,1,0,1105,1,99999,1106,0,300,1105,1,99999,1,225,225,225,1101,314,0,0,106,0,0,1105,1,99999,1107,677,226,224,1002,223,2,223,1005,224,329,101,1,223,223,7,677,226,224,102,2,223,223,1005,224,344,1001,223,1,223,1107,226,226,224,1002,223,2,223,1006,224,359,1001,223,1,223,8,226,226,224,1002,223,2,223,1006,224,374,101,1,223,223,108,226,226,224,102,2,223,223,1005,224,389,1001,223,1,223,1008,226,226,224,1002,223,2,223,1005,224,404,101,1,223,223,1107,226,677,224,1002,223,2,223,1006,224,419,101,1,223,223,1008,226,677,224,1002,223,2,223,1006,224,434,101,1,223,223,108,677,677,224,1002,223,2,223,1006,224,449,101,1,223,223,1108,677,226,224,102,2,223,223,1006,224,464,1001,223,1,223,107,677,677,224,102,2,223,223,1005,224,479,101,1,223,223,7,226,677,224,1002,223,2,223,1006,224,494,1001,223,1,223,7,677,677,224,102,2,223,223,1006,224,509,101,1,223,223,107,226,677,224,1002,223,2,223,1006,224,524,1001,223,1,223,1007,226,226,224,102,2,223,223,1006,224,539,1001,223,1,223,108,677,226,224,102,2,223,223,1005,224,554,101,1,223,223,1007,677,677,224,102,2,223,223,1006,224,569,101,1,223,223,8,677,226,224,102,2,223,223,1006,224,584,1001,223,1,223,1008,677,677,224,1002,223,2,223,1006,224,599,1001,223,1,223,1007,677,226,224,1002,223,2,223,1005,224,614,101,1,223,223,1108,226,677,224,1002,223,2,223,1005,224,629,101,1,223,223,1108,677,677,224,1002,223,2,223,1005,224,644,1001,223,1,223,8,226,677,224,1002,223,2,223,1006,224,659,101,1,223,223,107,226,226,224,102,2,223,223,1005,224,674,101,1,223,223,4,223,99,226};


        System.out.print(ecCalculator(ecMachine, 1));
       // System.out.print(ecCalculator(ecMachine, 5));
      //  for(int i=0;i<ecMachine.length;i++) {
      //      System.out.println(ecMachine[i]);

      //  }
       // input(ecMachine,19690720);
    }
    public static int ecCalculator(int[] ecMachine, int input) {
        int relative = 0;


        for (int i = 0; i >= 0 && i < ecMachine.length; ) {
            int opcode = ecMachine[i] % 100;
            int index1 = (ecMachine[i] / 100) % 10;
            int index2 = (ecMachine[i] / 1000) % 10;
            int fromIndex2 = ecMachine[i + 1];
            int fromIndex3 = ecMachine[i + 2];
            int positionIndex = ecMachine[i + 3];


            if (opcode == 1) {
                ecMachine[positionIndex] = getData(ecMachine, i + 1, index1, relative) + getData(ecMachine, i + 2, index2, relative);
                i += 4;
            }
            if (opcode == 2) {
                ecMachine[positionIndex] = getData(ecMachine, i + 1, index1, relative) * getData(ecMachine, i + 2, index2, relative);
                i += 4;
            }
            if (opcode == 3) {
                ecMachine[fromIndex2] = input;
                i += 2;
            }
            if (opcode == 4) {
                System.out.println(getData(ecMachine, i + 1, index1, relative));
                i += 2;
            }
            if (opcode == 5) {
                i = (getData(ecMachine, i + 1, index1, relative) != 0) ? getData(ecMachine, i + 2, index2, relative) : i + 3;
            }
            if (opcode == 6) {
                i = (getData(ecMachine, i + 1, index1, relative) == 0) ?
                        getData(ecMachine, i + 2, index2, relative) : i + 3;
            }
            if (opcode == 7) {
                int param1 = getData(ecMachine, i + 1, index1, relative);
                int param2 = getData(ecMachine, i + 2, index2, relative);
                ecMachine[positionIndex] = (param1 < param2) ? 1 : 0;
                i += 4;
            }
            if (opcode == 8) {
                int param1 = getData(ecMachine, i + 1, index1, relative);
                int param2 = getData(ecMachine, i + 2, index2, relative);
                ecMachine[positionIndex] = (param1 == param2) ? 1 : 0;
                i += 4;
            }
            if (opcode == 9) {
                relative += getData(ecMachine, i + 1, index1, relative);
                i += 2;
            }
            if (opcode == 99) {
                return ecMachine[0];
            }
            if (opcode != 1 && opcode != 2 && opcode != 3 && opcode != 4 && opcode != 5 && opcode != 6 && opcode != 7 && opcode != 8 && opcode != 9 && opcode != 99) {
                throw new IllegalArgumentException("No opcode");
            }
        }
        return ecMachine[0];
    }


    public static int getData(int []code,int index,int mode,int rel){
        if(mode==0) {
            return code[code[index]];
        }
        else{
            return code[index];
        }
    }  /**if (A == 0 && B == 0 && C == 0) {
            //everything position
            if (intialIndex == 1) {
                ecMachine[positionIndex] = ecMachine[index2] + ecMachine[index3];
            } else if (intialIndex == 2) {
                ecMachine[positionIndex] = ecMachine[index2] * ecMachine[index3];
            } else if(intialIndex == 3){
                ecMachine[ecMachine[i +1]] = input;
                i -=2;
            } else if(i == 4){

            }

            else if (intialIndex == 99) {
                break;
            }


        }
        if (A == 0 && B == 0 && C == 1) {
            //first value is immediate mode
            if (intialIndex == 1) {
                ecMachine[positionIndex] = ecMachine[i + 1] + ecMachine[index3];
            } else if (intialIndex == 2) {
                ecMachine[positionIndex] = ecMachine[i + 1] * ecMachine[index3];
            }
        } else if(intialIndex == 3){
            ecMachine[ecMachine[intialIndex +1]] = input;
        }
        else if (intialIndex == 99) {
                break;



        }
        if (A == 0 && B == 1 && C == 1) {
            //both values are immediate mode
            if (intialIndex == 1) {
                ecMachine[positionIndex] = ecMachine[i + 1] + ecMachine[i + 2];
            } else if (intialIndex == 2) {
                ecMachine[positionIndex] = ecMachine[i + 1] * ecMachine[i + 2];
            } else if (intialIndex == 99) {
                break;
            }

        }
        if (A == 1 && B == 1 && C == 1) {
            //all values are immediate
            if (intialIndex == 1) {
                ecMachine[i + 3] = ecMachine[i + 1] + ecMachine[i + 2];
            } else if (intialIndex == 2) {
                ecMachine[i + 3] = ecMachine[i + 1] * ecMachine[i + 2];
            } else if (intialIndex == 99) {
                break;
            }
        }
        if (A == 1 && B == 1 && C == 0) {
            //all values are immediate
            if (intialIndex == 1) {
                ecMachine[i + 3] = ecMachine[i + 1] + ecMachine[index3];
            } else if (intialIndex == 2) {
                ecMachine[i + 3] = ecMachine[i + 1] * ecMachine[index3];
            } else if (intialIndex == 99) {
                break;
            }
        }

        if (A == 1 && B == 0 && C == 0) {
            //all values are immediate      //all values are immediate
            if (intialIndex == 1) {
                ecMachine[i + 3] = ecMachine[index2] + ecMachine[index3];
            } else if (intialIndex == 2) {
                ecMachine[i + 3] = ecMachine[index2] * ecMachine[index3];
            } else if (intialIndex == 99) {
                break;
            }
        }

        if (A == 1 && B == 0 && C == 1) {
            //all values are immediate
            if (intialIndex == 1) {
                ecMachine[i + 3] = ecMachine[index2] + ecMachine[i + 2];
            } else if (intialIndex == 2) {
                ecMachine[i + 3] = ecMachine[index2] * ecMachine[i + 2];
            } else if (intialIndex == 99) {
                break;
            }
        }

        if (A == 0 && B == 1 && C == 0) {
            //all values are immediate
            if (intialIndex == 1) {
                ecMachine[positionIndex] = ecMachine[i + 1] + ecMachine[index2];
            } else if (intialIndex == 2) {
                ecMachine[positionIndex] = ecMachine[i + 1] * ecMachine[index2];
            } else if (intialIndex == 99) {
                break;
            }
        }
        if (A == 1 && B == 0 && C == 1) {
            if (intialIndex == 1) {
                ecMachine[i + 3] = ecMachine[index2] + ecMachine[i + 2];
            } else if (intialIndex == 2) {
                ecMachine[i + 3] = ecMachine[index2] * ecMachine[i + 2];
            } else if (intialIndex == 99) {
                break;
            }
            //all values are immediate
        }
    }
    return ecMachine[0];

         }
         */



/**
     *c static int ecCalculatorA(int[] ecMachine) {
     *         //ecMachine[1] = 12;
     *         //ecMachine[2] = 2;
     *
     *         for (int i = 0; i < ecMachine.length; i += 4) {
     *             int intialIndex = ecMachine[i];
     *             int index2 = ecMachine[i + 1];
     *             int index3 = ecMachine[i + 2];
     *             int positionIndex = ecMachine[i + 3];
     *
     *             if (intialIndex == 1) {
     *                 ecMachine[positionIndex] = ecMachine[index2] + ecMachine[index3];
     *             } else if (intialIndex == 2) {
     *                 ecMachine[positionIndex] = ecMachine[index2] * ecMachine[index3];
     *             } else if (intialIndex == 99) {
     *                 break;
     *             }
     *         }
     *         return ecMachine[0];
     *     }
     * for(int i = 0; i < ecMachine.length; i +=4){
     *     int number = ecMachine[i];
     *     String numberStr = String.valueOf(number)
           int length = numberStr.length();
            while(length > 0){
                if(length == 5)
                    if(numberStr.substring(1,2)).equals("1"){
                        //set postion mode
                else{
                    positionMode = 0;
               }
                if(length == 4){

            }

     }
     }
     *
     *
     * }


     }
     *
     *
     * @param ecMachine
     * @param target
     * @return
     */
public static String inputFinder(int [] ecMachine,int target){
    for(int i = 0; i< 99; i++){
        int[] memory = clone(ecMachine);
        for(int n = 0; n < 99; n++){
            memory = clone(ecMachine);
            memory[1] = i;
            memory [2] = n;
            if(ecCalculator(memory, 0)==target){
                String output = "noun="+ i + "verb="+ n;
                System.out.println(output);
                return output;
            }

        }


    }
    return null;
}
    public static int[] clone(int [] ecMachine){
        int[] copy = new int[ecMachine.length];
        for(int i =0; i< ecMachine.length; i++){
            copy[i] = ecMachine[i];
        }
        return copy;
    }

}
    /**public static void ifOne(ArrayList<Integer> ecMachine, int index){
        int sum = ecMachine.get(ecMachine.get(index+1)) + ecMachine.get(ecMachine.get(index+2));
        ecMachine.set(index + 3, sum);
    }
    public static void ifTwo(ArrayList<Integer> ecMachine, int index){
        int product = ecMachine.get(ecMachine.get(index+1)) * ecMachine.get(ecMachine.get(index+2));
        ecMachine.set(index + 3, product);
    }

*/
