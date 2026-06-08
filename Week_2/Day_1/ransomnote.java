class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    char a[]=new char[ransomNote.length()];
    char b[]=new char[magazine.length()];
    for(int i=0;i<ransomNote.length();i++){
        a[i]=ransomNote.charAt(i);
    }
    for(int j=0;j<magazine.length();j++){
        b[j]=magazine.charAt(j);
    }
    Arrays.sort(a);
    Arrays.sort(b);
    int i=0,j=0;
    while(i<a.length && j<b.length){
        if(a[i]==b[j]){
            i++;
            j++;
        }
        else if(a[i]>b[j]){
            j++;
        }
        else return false;

    }
    if(i==a.length)return true;
    return false;
    }
}