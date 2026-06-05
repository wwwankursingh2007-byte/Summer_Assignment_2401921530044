class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder("");
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int n=Math.min(s1.length(),s2.length());
        for(int i=0;i<n;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        if(sb.length()>0) return sb.toString();
        else return "";
    }
}