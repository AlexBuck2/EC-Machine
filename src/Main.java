import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int []ecMachine = new int []{1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,10,19,1,19,5,23,2,23,9,27,1,5,27,31,1,9,31,35,1,35,10,39,2,13,39,43,1,43,9,47,1,47,9,51,1,6,51,55,1,13,55,59,1,59,13,63,1,13,63,67,1,6,67,71,1,71,13,75,2,10,75,79,1,13,79,83,1,83,10,87,2,9,87,91,1,6,91,95,1,9,95,99,2,99,10,103,1,103,5,107,2,6,107,111,1,111,6,115,1,9,115,119,1,9,119,123,2,10,123,127,1,127,5,131,2,6,131,135,1,135,5,139,1,9,139,143,2,143,13,147,1,9,147,151,1,151,2,155,1,9,155,0,99,2,0,14,0};
        ecCalculator(ecMachine);
      //  for(int i=0;i<ecMachine.length;i++) {
      //      System.out.println(ecMachine[i]);

      //  }
        input(ecMachine,19690720);
    }
    public static int ecCalculator(int[] ecMachine) {
        //ecMachine[1] = 12;
        //ecMachine[2] = 2;

        for (int i = 0; i < ecMachine.length; i += 4) {
            int intialIndex = ecMachine[i];

            int index2 = ecMachine[i + 1];
            int index3 = ecMachine[i + 2];
            int positionIndex = ecMachine[i + 3];

            if (intialIndex == 1) {
                ecMachine[positionIndex] = ecMachine[index2] + ecMachine[index3];
            } else if (intialIndex == 2) {
                ecMachine[positionIndex] = ecMachine[index2] * ecMachine[index3];
            } else if (intialIndex == 99) {
                break;
            }
        }
        return ecMachine[0];
    }

    public static int newEcCalculator(int[] ecMachine, int holder) {
        for (int i = 0; i < ecMachine.length; i+=4) {
            int ABCDE = ecMachine[i];
            int A = ABCDE / 10000;
            int B = (ABCDE / 1000) % 10;
            int C = (ABCDE / 100) % 10;
            int intialIndex = ABCDE % 100;

            int index2 = ecMachine[i + 1];
            int index3 = ecMachine[i + 2];
            int positionIndex = ecMachine[i + 3];


            if (A == 0 && B == 0 && C == 0) {
                //everything position
                if (intialIndex == 1) {
                    ecMachine[positionIndex] = ecMachine[index2] + ecMachine[index3];
                } else if (intialIndex == 2) {
                    ecMachine[positionIndex] = ecMachine[index2] * ecMachine[index3];
                } else if (intialIndex == 99) {
                    break;
                }


            }
            if (A == 0 && B == 0 && C == 1) {
                //first value is immediate mode
                if (intialIndex == 1) {
                    ecMachine[positionIndex] = ecMachine[i + 1] + ecMachine[index3];
                } else if (intialIndex == 2) {
                    ecMachine[positionIndex] = ecMachine[i + 1] * ecMachine[index3];
                } else if (intialIndex == 99) {
                    break;
                }


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
    public static String input(int [] ecMachine,int target){
        for(int i = 0; i< 99; i++){
          int[] memory = clone(ecMachine);
            for(int n = 0; n < 99; n++){
              memory = clone(ecMachine);
               memory[1] = i;
               memory [2] = n;
               if(ecCalculator(memory)==target){
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


