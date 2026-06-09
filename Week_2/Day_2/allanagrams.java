class Solution {
    public static boolean match(int []a,int []b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst=new ArrayList<>();
        int [] count1=new int [26];
        int [] count2=new int [26];
        if(p.length()>s.length())return lst;

        for(int i=0;i<p.length();i++){
            count1[s.charAt(i)-'a']++;
            count2[p.charAt(i)-'a']++;
        
        // if(match(count1,count2)){
        //     lst.add((i+1)-p.length());
        // }
        }
        if(match(count1,count2)){
            lst.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            count1[s.charAt(i)-'a']++;
            count1[s.charAt(i-p.length())-'a']--;
            if(match(count1,count2)){
                lst.add((i+1)-p.length());
            }
        }
        return lst;
        
    }
}