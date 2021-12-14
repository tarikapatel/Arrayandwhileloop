//9. Write a 2-D array and WAP to transpose a matrix
/*Transpose of a matrix is defined as "A Matrix which is formed by turning all
 the rows of a given matrix into columns and Vice-versa
*/
public class TransposeMatrix {
    public static void main(String[]args){
        int[][] matrixOriginal = new int[][]
                {   {1, 2, 3},
                    {5, 6, 7}
                };
        System.out.println("Original transpose:");
        for (int i = 0; i < matrixOriginal.length; i++)
        {
            for (int j = 0; j < matrixOriginal[i].length; j++)
            {
                System.out.print( matrixOriginal[i][j]+ " ");
            }
            System.out.println(" ");
        }
        System.out.println("matrix transpose:");
        // transpose
        if (matrixOriginal.length > 0) {
            for (int i = 0; i < matrixOriginal[0].length; i++) {
                for (int j = 0; j < matrixOriginal.length; j++) {
                    System.out.print(matrixOriginal[j][i] + " ");
                }
                System.out.println(" ");
            }
        }
    }

}
