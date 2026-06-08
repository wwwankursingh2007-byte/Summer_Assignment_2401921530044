class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=new char[s.length()];
        char b[]=new char[t.length()];
        if(s.length()!=t.length())return false;
        else{
            for(int i=0;i<s.length();i++){
            a[i]=s.charAt(i);
        }
        Arrays.sort(a);
        for(int j=0;j<t.length();j++){
            b[j]=t.charAt(j);
        }
        Arrays.sort(b);
        for(int i=0;i<s.length();i++){
            if(a[i]!=b[i]){
                return false;

            }
        }

        }
        return true;
    }
}