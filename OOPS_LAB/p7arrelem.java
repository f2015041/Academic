public class p7arrelem {
	public static void main(String[]args) {
		int[] arr = { 1, 2, 3, 5, 3, 2 };
		int search = 2;
		//element to be searched is 2
		int i;
		for (i = 0; i <= 5; i++) {
			if (arr[i] == search) {
				System.out.println("Found at index " + i);
				break;
			}
		}
	}
}
