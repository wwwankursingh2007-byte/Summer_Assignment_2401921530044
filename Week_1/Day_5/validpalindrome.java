class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()>1){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        String str2=sb.toString();
        for(int i=0;i<str2.length()/2;i++){
           if(str2.charAt(i)!=str2.charAt(str2.length()-1-i)){
            return false;
           }
        }
        return true;}
        else return true;
    }
}