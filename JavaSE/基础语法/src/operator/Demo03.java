package operator;

import java.util.Arrays;

public class Demo03 {
    public static void main(String[] args) {
        int [][]test = new int[11][11];
        test[1][2] = 1;
        test[2][3] = 2;

        int dateNum = 0;
        for (int[] x:test){
            for (int y:x){
                if(y>0){
                    dateNum++;
                }
            }
        }
        int [][] testArray = new int[dateNum+1][3];
        testArray[0][0] = test.length;
        testArray[0][1] = test.length;
        testArray[0][2] = dateNum;

        int num = 1;
        for(int i = 0;i<test.length;i++){
            for(int j=0;j<test[i].length;j++){
                if(test[i][j]>0){

                    testArray[num][0] = i;
                    testArray[num][1] = j;
                    testArray[num][2] = test[i][j];
                    num++;
                }
            }
        }

        System.out.println(Arrays.deepToString(test));
        System.out.println("===================");
        System.out.println(Arrays.deepToString(testArray));

        int newNum = 1;
        int[][] testArray1 = new int[testArray[0][0]][testArray[0][1]];
        for (int i=0;i<testArray1.length;i++){
            for(int j=0;j<testArray1[i].length;j++){
                if(newNum <= testArray[0][2] && i == testArray[newNum][0] && j == testArray[newNum][1]){
                    testArray1[i][j] = testArray[newNum][2];
                    newNum++;
                }
            }
        }
        System.out.println(Arrays.deepToString(testArray1));

        multiply(15);


    }

    public static void multiply(int x){
        for(int i=1;i<=x;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
