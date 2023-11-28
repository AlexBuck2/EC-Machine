import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       long []ecMachine = new long [] {3,225,1,225,6,6,1100,1,238,225,104,0,1102,72,20,224,1001,224,-1440,224,4,224,102,8,223,223,1001,224,5,224,1,224,223,223,1002,147,33,224,101,-3036,224,224,4,224,102,8,223,223,1001,224,5,224,1,224,223,223,1102,32,90,225,101,65,87,224,101,-85,224,224,4,224,1002,223,8,223,101,4,224,224,1,223,224,223,1102,33,92,225,1102,20,52,225,1101,76,89,225,1,117,122,224,101,-78,224,224,4,224,102,8,223,223,101,1,224,224,1,223,224,223,1102,54,22,225,1102,5,24,225,102,50,84,224,101,-4600,224,224,4,224,1002,223,8,223,101,3,224,224,1,223,224,223,1102,92,64,225,1101,42,83,224,101,-125,224,224,4,224,102,8,223,223,101,5,224,224,1,224,223,223,2,58,195,224,1001,224,-6840,224,4,224,102,8,223,223,101,1,224,224,1,223,224,223,1101,76,48,225,1001,92,65,224,1001,224,-154,224,4,224,1002,223,8,223,101,5,224,224,1,223,224,223,4,223,99,0,0,0,677,0,0,0,0,0,0,0,0,0,0,0,1105,0,99999,1105,227,247,1105,1,99999,1005,227,99999,1005,0,256,1105,1,99999,1106,227,99999,1106,0,265,1105,1,99999,1006,0,99999,1006,227,274,1105,1,99999,1105,1,280,1105,1,99999,1,225,225,225,1101,294,0,0,105,1,0,1105,1,99999,1106,0,300,1105,1,99999,1,225,225,225,1101,314,0,0,106,0,0,1105,1,99999,1107,677,226,224,1002,223,2,223,1005,224,329,101,1,223,223,7,677,226,224,102,2,223,223,1005,224,344,1001,223,1,223,1107,226,226,224,1002,223,2,223,1006,224,359,1001,223,1,223,8,226,226,224,1002,223,2,223,1006,224,374,101,1,223,223,108,226,226,224,102,2,223,223,1005,224,389,1001,223,1,223,1008,226,226,224,1002,223,2,223,1005,224,404,101,1,223,223,1107,226,677,224,1002,223,2,223,1006,224,419,101,1,223,223,1008,226,677,224,1002,223,2,223,1006,224,434,101,1,223,223,108,677,677,224,1002,223,2,223,1006,224,449,101,1,223,223,1108,677,226,224,102,2,223,223,1006,224,464,1001,223,1,223,107,677,677,224,102,2,223,223,1005,224,479,101,1,223,223,7,226,677,224,1002,223,2,223,1006,224,494,1001,223,1,223,7,677,677,224,102,2,223,223,1006,224,509,101,1,223,223,107,226,677,224,1002,223,2,223,1006,224,524,1001,223,1,223,1007,226,226,224,102,2,223,223,1006,224,539,1001,223,1,223,108,677,226,224,102,2,223,223,1005,224,554,101,1,223,223,1007,677,677,224,102,2,223,223,1006,224,569,101,1,223,223,8,677,226,224,102,2,223,223,1006,224,584,1001,223,1,223,1008,677,677,224,1002,223,2,223,1006,224,599,1001,223,1,223,1007,677,226,224,1002,223,2,223,1005,224,614,101,1,223,223,1108,226,677,224,1002,223,2,223,1005,224,629,101,1,223,223,1108,677,677,224,1002,223,2,223,1005,224,644,1001,223,1,223,8,226,677,224,1002,223,2,223,1006,224,659,101,1,223,223,107,226,226,224,102,2,223,223,1005,224,674,101,1,223,223,4,223,99,226};
       String [] ecMachine31 = new String[] {"1102", "34463338", "34463338", "63", "1007", "63", "34463338", "63", "1005", "63", "53", "1102", "1", "3", "1000", "109", "988", "209", "12",
               "9", "1000", "209", "6", "209", "3", "203", "0", "1008", "1000", "1", "63", "1005", "63", "65", "1008", "1000", "2", "63", "1005", "63", "904", "1008", "100",
               "0", "0", "63", "1005", "63", "58", "4", "25", "104", "0", "99", "4", "0", "104", "0", "99", "4", "17", "104", "0", "99", "0", "0", "1102", "1", "21", "1004", "1101", "28",
               "0", "1016", "1101", "0", "27", "1010", "1102", "36", "1", "1008", "1102", "33", "1", "1013", "1101", "0", "22", "1012", "1101", "0", "37", "1011", "1102",
               "34", "1", "1017", "1102", "466", "1", "1027", "1102", "1", "484", "1029", "1102", "1", "699", "1024", "1102", "1", "1", "1021", "1101", "0", "0", "1020",
               "1102", "1", "24", "1015", "1101", "0", "473", "1026", "1101", "653", "0", "1022", "1102", "26", "1", "1007", "1102", "25", "1", "1006", "1101", "0", "3",
               "9", "1014", "1102", "646", "1", "1023", "1101", "690", "0", "1025", "1102", "1", "29", "1019", "1101", "32", "0", "1018", "1101", "30", "0", "1002", "11",
               "01", "0", "20", "1001", "1102", "1", "38", "1005", "1102", "1", "23", "1003", "1101", "0", "31", "1000", "1101", "35", "0", "1009", "1101", "0", "493", "10",
               "28", "109", "5", "1208", "0", "37", "63", "1005", "63", "201", "1001", "64", "1", "64", "1106", "0", "203", "4", "187", "1002", "64", "2", "64", "109", "-4", "21",
               "07", "36", "8", "63", "1005", "63", "223", "1001", "64", "1", "64", "1105", "1", "225", "4", "209", "1002", "64", "2", "64", "109", "18", "21107", "40", "41",
               "-9", "1005", "1010", "243", "4", "231", "1105", "1", "247", "1001", "64", "1", "64", "1002", "64", "2", "64", "109", "6", "21107", "41", "40", "-9", "1005", "1",
               "016", "267", "1001", "64", "1", "64", "1106", "0", "269", "4", "253", "1002", "64", "2", "64", "109", "-19", "21102", "42", "1", "5", "1008", "1011", "42", "6",
               "3", "1005", "63", "291", "4", "275", "1105", "1", "295", "1001", "64", "1", "64", "1002", "64", "2", "64", "109", "15", "1205", "0", "309", "4", "301", "1105",
               "1", "313", "1001", "64", "1", "64", "1002", "64", "2", "64", "109", "-27", "2101", "0", "9", "63", "1008", "63", "20", "63", "1005", "63", "333", "1106", "0", "3",
               "39", "4", "319", "1001", "64", "1", "64", "1002", "64", "2", "64", "109", "19", "21102", "43", "1", "6", "1008", "1019", "45", "63", "1005", "63", "363", "100",
               "1", "64", "1", "64", "1105", "1", "365", "4", "345", "1002", "64", "2", "64", "109", "1", "21108", "44", "47", "-3", "1005", "1011", "385", "1001", "64", "1", "6",
               "4", "1106", "0", "387", "4", "371", "1002", "64", "2", "64", "109", "-22", "1201", "9", "0", "63", "1008", "63", "21", "63", "1005", "63", "411", "1001", "64",
               "1", "64", "1106", "0", "413", "4", "393", "1002", "64", "2", "64", "109", "9", "1207", "0", "19", "63", "1005", "63", "433", "1001", "64", "1", "64", "1106", "0",
               "435", "4", "419", "1002", "64", "2", "64", "109","9", "2107", "30", "8", "63", "1005", "63", "453", "4", "441", "1105", "1", "457", "1001", "64", "1", "64", "1002", "64", "2", "64", "109", "25", "2106", "0", "10", "1001", "64",
               "1", "64", "1106", "0", "475", "4", "463", "1002", "64", "2", "64", "109", "11", "2106", "0", "0", "4", "481", "1001", "64", "1", "64", "1105", "1", "493", "1002", "64", "2", "64", "109",
               "-18", "2108", "21", "-6", "63", "1005", "63", "511", "4", "499", "1106", "0", "515", "1001", "64", "1", "64", "1002", "64", "2", "64", "109", "-12", "2108", "18", "6", "63", "1005", "63",
               "535", "1001", "64", "1", "64", "1106", "0", "537", "4", "521", "1002", "64", "2", "64", "109", "19", "21101", "45", "0", "-7", "1008", "1010", "45", "63", "1005", "63", "563", "4", "543",
               "1001", "64", "1", "64", "1105", "1", "563", "1002", "64", "2", "64", "109", "-10", "1207", "-5", "31", "63", "1005", "63", "581", "4", "569", "1106", "0", "585", "1001", "64", "1", "64",
               "1002", "64", "2", "64", "109", "-8", "2102", "1", "5", "63", "1008", "63", "21", "63", "1005", "63", "611", "4", "591", "1001", "64", "1", "64", "1105", "1", "611", "1002", "64", "2", "64",
               "109", "5", "1201", "0", "0", "63", "1008", "63", "21", "63", "1005", "63", "633", "4", "617", "1106", "0", "637", "1001", "64", "1", "64", "1002", "64", "2", "64", "109", "13", "2105", "1",
               "6", "1001", "64", "1", "64", "1106", "0", "655", "4", "643", "1002", "64", "2", "64", "109", "-7", "1202", "-3", "1", "63", "1008", "63", "26", "63", "1005", "63", "681", "4", "661", "1001",
               "64", "1", "64", "1106", "0", "681", "1002", "64", "2", "64", "109", "12", "2105", "1", "2", "4", "687", "1001", "64", "1", "64", "1105", "1", "699", "1002", "64", "2", "64", "109", "-28",
               "1208", "8", "30", "63", "1005", "63", "717", "4", "705", "1106", "0", "721", "1001", "64", "1", "64", "1002", "64", "2", "64", "109", "10", "1202", "1", "1", "63", "1008", "63", "40", "63",
               "1005", "63", "745", "1001", "64", "1", "64", "1105", "1", "747", "4", "727", "1002", "64", "2", "64", "109", "10", "21108", "46", "46", "-2", "1005", "1012", "765", "4", "753", "1105", "1",
               "769", "1001", "64", "1", "64", "1002", "64", "2", "64", "109", "-2", "1205", "8", "781", "1106", "0", "787", "4", "775", "1001", "64", "1", "64", "1002", "64", "2", "64", "109", "-9", "2101",
               "0", "0", "63", "1008", "63", "23", "63", "1005", "63", "809", "4", "793", "1105", "1", "813", "1001", "64", "1", "64", "1002", "64", "2", "64", "109", "9", "1206", "8", "831", "4", "819", "1001",
               "64", "1", "64", "1106", "0", "831", "1002", "64", "2", "64", "109", "-9", "2102", "1", "-2", "63", "1008", "63", "22", "63", "1005", "63", "855", "1001", "64", "1", "64", "1106", "0", "857", "4",
               "837", "1002", "64", "2", "64", "109", "4", "21101", "47", "0", "10", "1008", "1017", "50", "63", "1005", "63", "877", "1105", "1", "883", "4", "863", "1001", "64", "1", "64", "1002", "64", "2",
               "64", "109", "18", "1206", "-4", "895", "1105", "1", "901", "4", "889", "1001", "64", "1", "64", "4", "64", "99", "21101", "0", "27", "1", "21102", "915", "1", "0", "1106", "0", "922", "21201", "1", "56639", "1", "204", "1", "99", "109", "3", "1207", "-2", "3", "63", "1005", "63", "964", "21201", "-2", "-1", "1", "2102", "1", "942","0", "1106", "0", "922", "22102"," 1", "1", "-1"," 21201", "-2", "-3", "1", "21101", "0", "957", "0",
               "1106"," 0", "922", "22201", "1", "-1", "-2", "1106", "0"," 968", "22102", "1"," -2", "-2"," 109", "-3", "2106"," 0"," 0"};
        int[] ecMachineAsLong = new int[ecMachine31.length];
                for(int n = 0; n <ecMachine31.length; n++){
                    ecMachineAsLong[n] = Integer.parseInt(ecMachine31[n]);
                }

       // System.out.print(ecCalculator(ecMachine, 1));
        System.out.println(ecCalculator(ecMachineAsLong,1));
        //System.out.println(ecCalculator(ecMachine,5));//Assignment 2.1
       // System.out.println(ecCalculator(ecMachine,1));
      //  System.out.print(ecCalculator(ecMachine, 1));
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
                ecMachine[ecMachine[i + 3]] = getData(ecMachine, i + 1, index1, relative) + getData(ecMachine, i + 2, index2, relative);
                i += 4;
            }
            if (opcode == 2) {
                ecMachine[ecMachine[i + 3]] = getData(ecMachine, i + 1, index1, relative) * getData(ecMachine, i + 2, index2, relative);
                i += 4;
            }
            if (opcode == 3) {
                ecMachine[ecMachine[i + 1]] = input;
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
                i = (getData(ecMachine, i + 1, index1, relative) == 0) ? getData(ecMachine, i + 2, index2, relative) : i + 3;
            }
            if (opcode == 7) {
                int param1 = getData(ecMachine, i + 1, index1, relative);
                int param2 = getData(ecMachine, i + 2, index2, relative);
                ecMachine[ecMachine[i + 3]] = (param1 < param2) ? 1 : 0;
                i += 4;
            }
            if (opcode == 8) {
                int param1 = getData(ecMachine, i + 1, index1, relative);
                int param2 = getData(ecMachine, i + 2, index2, relative);
                ecMachine[ecMachine[i + 3]] = (param1 == param2) ? 1 : 0;
                i += 4;
            }
            if (opcode == 9) {
                relative += getData(ecMachine, i + 1, index1, relative);
                i += 2;
            }
            if (opcode == 99) {
                return ecMachine[0];
            }
            if (opcode != 1 && opcode != 2 && opcode != 3 && opcode != 4 && opcode != 5 &&
                    opcode != 6 && opcode != 7 && opcode != 8 && opcode != 9 && opcode != 99) {
                throw new IllegalArgumentException("No opcode");
            }
        }
        return ecMachine[0];
    }


    public static int getData(int []code,int index,int mode,int rel){
        if(mode==0) {
            return code[code[index]];
        }
        else if(mode ==1){
            return code[index];
        } else if(mode ==2){
            return code[code[index] + rel];
        } else {
            throw new IllegalArgumentException("Unknown param"  + mode);
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
