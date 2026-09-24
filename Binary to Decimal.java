class Solution {
    public int binaryToDecimal(String b) {
        // code here
        int ans = 0;
        int pow = 1;
        for(int i=b.length() - 1;i>=0;i--){
            int digit = b.charAt(i)-'0';
            ans += digit*pow;
            pow *= 2;
        }
        return ans;
    }
}
