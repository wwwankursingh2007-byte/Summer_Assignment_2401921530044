import java.util.HashMap;
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int k=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                map.put(k,mat[i][j]);
                k++;
            }
        }
        int f=0;
        int reshape[][]=new int [r][c];
        if(mat.length*mat[0].length==r*c){
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    reshape[i][j]=map.get(f);
                    f++;

                }

            }

        }
        else return mat;
        return reshape;
        
    }
}
