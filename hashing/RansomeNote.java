// Problem: Ransom Note
// Pattern: Hashing (Frequency Count)
// Time: O(n)
// Space: O(1)  // fixed size array of 26

class RansomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[]=new int[26];
        for(int i=0;i<magazine.length();i++){
            int index=magazine.charAt(i) -'a';
            arr[index]++;
        }
        for(int j=0;j<ransomNote.length();j++){
            int index=ransomNote.charAt(j)-'a';
            arr[index]--;
            if(arr[index]<0){
                return false;
            }
        }
        return true;
    }
}