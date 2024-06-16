package leetcode;

public class StrictlyPalindromicNumber {
	
	public String convertToNNary(int n, int base) {
        String nary = "";
        while (n > 0) {
            int rem = n % base;
            n = n / base;
            nary = nary + String.valueOf(rem);
        }
        return nary;
    }

    public boolean isStrictlyPalindromic(int n) {
        for(int i=2; i<=n-2; i++) {
            String nnaryVal = convertToNNary(n, i);
            int len = nnaryVal.length();
            int j = 0;
            int k = len - 1;
            while(j <= k) {
                if(nnaryVal.charAt(j) != nnaryVal.charAt(k))
                    return false;
                j++;
                k--;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrictlyPalindromicNumber strictlyPalindromicNumber = new StrictlyPalindromicNumber();
		System.out.println("Is Palindrom? = " + strictlyPalindromicNumber.isStrictlyPalindromic(4));

	}

}
