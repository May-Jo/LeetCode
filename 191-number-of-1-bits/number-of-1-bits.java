class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count=0;
        int strlength = binary.length();

        for(int i=0; i<strlength; i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}