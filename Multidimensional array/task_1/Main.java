package task_1;

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int rows = twoDimArray.length;
        int cols = twoDimArray[0].length;
        System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][cols - 1]);
        System.out.println(twoDimArray[rows - 1][0] + " " + twoDimArray[rows - 1][cols - 1]);
    }
}