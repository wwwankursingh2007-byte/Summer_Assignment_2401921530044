class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<=mat.length-1;i++){
        //primary diagonal for i==j
        sum+=mat[i][i];
        //secondary diagonal i+j=matrix.length-1
        if(i!=mat.length-1-i){
            sum+=mat[i][mat.length-1-i];
        }
        
       }
        return sum;
    }
}