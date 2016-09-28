public class MergeSorting {
	int array[];
	int tempMergArr[];
	int length;

	public void mergeSort(int inputArray[]) {
		this.array = inputArray;
		this.length = inputArray.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}

	public void doMergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}

		int i = lowerIndex;// 1 subarray
		int j = middle + 1;// 2subarray
		int k = lowerIndex;// original array
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}
	}

	public static void main(String[] args) {
		int inputArray[] = { 32, 45, 67, 2, 7 };
		System.out.println("Unsorted Array: ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + ", ");
		}
		System.out.println(" ");
		MergeSorting mergeSort = new MergeSorting();
		mergeSort.mergeSort(inputArray);
		System.out.println("Sorted Array: ");
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + ", ");
		}
		System.out.println(" ");
	}

}
