/* 配列について */
import java.util.Arrays;

class Array{
    public static void main(String[] args){
        int[] score1 = new int[3];  //配列生成方法
        score1[0] = 5;
        score1[1] = 10;
        score1[2] = 12;
        String[] score2 = {"A", "B", "C"};  //初期化記述方法
        System.out.println(score1);
        System.out.println(score2);
        System.out.println(Arrays.toString(score2));
    }
}

/* 多次元配列について */

class MultiArray{
   public static void main(String[] args){
        int[][] multiScore1 = new int[2][3];  //多次元配列生成方法
        multiScore1[0][0] = 1;
        multiScore1[0][1] = 2;
        multiScore1[0][2] = 3;
        multiScore1[1][0] = 4;
        multiScore1[1][1] = 5;
        multiScore1[1][2] = 6;
        String[][] multiScore2 = {{"A", "B", "C"}, {"D", "E", "F"}};  //初期化記述方法
        System.out.println(Arrays.deepToString(multiScore1));
        System.out.println(Arrays.deepToString(multiScore2));
        System.out.println(multiScore2.length);
        System.out.println(multiScore2[0].length);
    } 
}