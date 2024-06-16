package leetcode;

public class SmallestEvenMultiple {
	
	public int smallestEvenMultiple(int n) {
        if(n%2 == 0)
            return n;
        return 2 * n;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestEvenMultiple smallestEvenMultiple = new SmallestEvenMultiple();
		System.out.println("Smallest = " + smallestEvenMultiple.smallestEvenMultiple(6));

	}

}
