package leetcode;

public class SumOfAllSubsetXorTotals {
	
	public int subsetXORSum(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for(int i=0; i<(1<<len); i++){
            int xorTotal = 0;
            for(int j=0; j<len; j++) {
                if((i & (1<<j)) != 0) {
                    xorTotal = xorTotal ^ nums[j];
                }
            }
            sum += xorTotal;
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3, 4, 5, 6, 7, 8};
		SumOfAllSubsetXorTotals sumOfAllSubsetXorTotals = new SumOfAllSubsetXorTotals();
		System.out.println("Sum = " + sumOfAllSubsetXorTotals.subsetXORSum(nums));
		
	}

}
