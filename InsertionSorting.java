public class InsertionSorting {

	public static void main(String[] args) {
		int arr[] = { 5, 1,6, 2, 4 };
		int i, j, temp;

		for (i = 1; i < 5; i++) {
			j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				j--;
			}
		}
		for (i = 0; i < 5; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

}
