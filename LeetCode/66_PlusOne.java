class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] < 9) {
		digits[digits.length - 1]++;
		return digits;
	}
    for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
    }
}
