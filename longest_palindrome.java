class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                count +=2;
                set.remove(c);
            }
            else{
                set.add(c);
                }
        }
        if(!set.isEmpty()) count ++;
        return count;
        
    }
}

//Time and space complexity is O(n)
