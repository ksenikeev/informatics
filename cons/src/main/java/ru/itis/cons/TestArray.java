package ru.itis.cons;

public class TestArray {

    public static void main(String[] args) {

        int[] iarr = new int[5];
        int[] b = new int[]{1,2,3,4};
        int[] c = {1,2,3,4};

        int[][]d = {{1,2},{1,3},{2}};

        int x = b[0];
/*
        for(int i = 0; i < b.length ; ++i) {
            iarr[i] = b[i];
        }
*/
        System.arraycopy(b, 0, iarr, 0, b.length);

/*
        for(int i = 0; i < iarr.length ; ++i) {
            System.out.println(iarr[i]);
        }
*/


        for (int i = 0; i < d.length; ++i) {
            for(int j = 0; j < d[i].length; ++j) {
                System.out.print(d[i][j] + ",");
            }
            System.out.println();
        }



    }

}
