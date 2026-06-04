import java.util.ArrayList;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> lst=new ArrayList<>();
        int sr=0;
        int er=matrix.length-1;
        int sc=0;
        int ec=matrix[0].length-1;
        while(sr<=er && sc<=ec){
            //top
            for(int j=sc;j<=ec;j++ ){
                lst.add(matrix[sr][j]);
            }
            //right
            for(int i=sr+1;i<=er;i++){
                lst.add(matrix[i][ec]);
            }
            if(sr<er){
                  //bottom
            for(int j=ec-1;j>=sc;j--){
                lst.add(matrix[er][j]);}
            }
            if(sc<ec){
                for(int i=er-1;i>=sr+1;i--){
                lst.add(matrix[i][sc]);}
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
        return lst;

        
    }
}