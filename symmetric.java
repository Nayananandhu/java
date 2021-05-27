
import java.io.*;
class symmetric {
 static int  MAX = 100;
 static void transpose(int mat[][], int tr[][], int N)
{
    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            tr[i][j] = mat[j][i];
}
 static boolean isSymmetric(int mat[][], int N)
{
    int tr[][] = new int[N][MAX];
    transpose(mat, tr, N);
    for (int i = 0; i < N; i++)
        for (int j = 0; j < N; j++)
            if (mat[i][j] != tr[i][j])
                return false;
    return true;
}
    public static void main (String[] args)
 {
         
        int mat[][] = { { 1, 3, 5 },
                    { 3, 2, 4 },
                    { 5, 4, 1 } };
 
    if (isSymmetric(mat, 3))
        System.out.println( "matrix is symmetric");
    else
        System.out.println ( "matrix is not symmetric");
     
    }
}