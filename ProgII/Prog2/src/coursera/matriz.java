package coursera;

public class matriz {
    public static void main(String[]args){
        int i,j;
        int [][]matriz = new int[][]{{2, 4, 6, 8}, {10, 12, 14, 16}, {18, 20, 22, 24}, {26, 28, 30, 32},};

        for(i=0;i<4;i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
