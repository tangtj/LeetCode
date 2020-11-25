package algorithms;

public class leet_1603 {

	private int[] nums = new int[3];

	public void ParkingSystem(int big, int medium, int small) {
		nums[2]= big;
		nums[1]= medium;
		nums[0]= small;

	}

	public boolean addCar(int carType) {
		int a = nums[carType - 1] - 1;
		if (a >= 0){
			nums[carType - 1] = a;
			return true;
		}else {
			return false;
		}
	}
}
