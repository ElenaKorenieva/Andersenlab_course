package Lesson_2;

public class Lesson_2 {
    public static void main(String[] args) {
        within10and20(4,-1);
        isPositiveOrNegative(0);
        isNegative(-1);
        printWordNTimes("image", 5);
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
    }

    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) return true;
        return false;
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        }
        return false;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++)  {
            System.out.println(word);
        }
        System.out.println();
    }

    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                arr[i]=0;
            } else {
                arr[i]=1;
            }
            System.out.println(arr);
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(arr);
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(arr);
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                arr[i][j] = (i == j || j == (4 - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }

}
