public class BubbleSort {

	public static void main(String[] args) {
		int bubbleSort[] = { 5, 1, 6, 2, 4, 3 };
		int i, j, temp;
		int flag;

		for (i = 0; i < 6; i++) {
			flag = 0;
			for (j = 0; j < 6 - i - 1; j++) {
				if (bubbleSort[j] > bubbleSort[j + 1]) {
					temp = bubbleSort[j];
					bubbleSort[j] = bubbleSort[j + 1];
					bubbleSort[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag != 1) {
				break;
			}
		}
		for (i = 0; i < 6; i++) {
			System.out.print(bubbleSort[i] + ", ");
		}
	}

}
