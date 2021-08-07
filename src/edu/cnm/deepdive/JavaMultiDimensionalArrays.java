package edu.cnm.deepdive;

public class JavaMultiDimensionalArrays {

  public static void main(String[] args) {

    //1D array

    int[] myArray = {0, 1};

    //2D array
    int[][] array = new int[2][4];
    int anotherArray[][] = new int[2][4];//is also legal
    int[] myIntArray[] = new int[2][4]; //is legal for a 2D array but very bad practice.

    String[][] my2ndArray = new String[][] {
        {"One", "Two"},//first row with 2 elements
        {"Three", "Four", "Five"},// second row with 3 elements
        {"Six", "Seven", "Eight", "Nine"},// third row wih 4 elements
        null //fourth row with zero elements
    };

    int[][] numberTable = new int[2][3];
    numberTable[0][0] = 1;
    numberTable[0][1] = 2;
    numberTable[0][2] = 3;
    //numberTable[0][3] = 4; gives OutOfBoundsException because there are only 3 columns

    //3D array has pages (or planes), row, columns
    int[][][] threeArray = new int[3][3][3];
    int[] anotherTreeArray[][];//is legal but bad practice
    int[][][] threeDArray = {
        {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},//first page
        {{10, 11, 12}, {13, 14, 15}},
        {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
    };



  }

}
