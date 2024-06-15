package leetcode;

import java.util.Arrays;

public class MinimumNumberOfSeatsToMoveEveryone {
	
	public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int sum = 0;
        for(int i=0; i<seats.length; i++) {
            sum += Math.abs(seats[i]-students[i]);
        }

        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumNumberOfSeatsToMoveEveryone minimumNumberOfSeatsToMoveEveryone = new MinimumNumberOfSeatsToMoveEveryone();
		int[] seats = {2, 2, 6, 6};
		int[] students = {1, 3, 2, 6};
		System.out.println("Number of Moves = " + minimumNumberOfSeatsToMoveEveryone.minMovesToSeat(seats, students));
	}

}
