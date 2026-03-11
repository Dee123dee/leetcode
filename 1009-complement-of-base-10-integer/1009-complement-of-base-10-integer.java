class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;

        String binary = Integer.toBinaryString(n);
        String result = "";

        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) == '0')
                result += '1';
            else
                result += '0';
        }

        return Integer.parseInt(result, 2);
    }
}