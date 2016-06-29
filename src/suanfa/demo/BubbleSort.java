package suanfa.demo;

/**
 * 冒泡排序（Bubble Sort，台湾译为：泡沫排序或气泡排序）
 * 是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，
 * 如果他们的顺序错误就把他们交换过来。走访数列的工作是重复地进行直到没有再需要交换，
 * 也就是说该数列已经排序完成。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 * @author liu
 *
 */
public class BubbleSort {

	public static int[] bubbleSort(int array[]) {
		int length = array.length;
		int i = 0;
		int j = 0;
		int temp = 0;
		for (i = length - 1; 0 < i; i--) {
			System.out.println("外层-->" + i);
			for (j = 0; j < i; j++) {
				System.out.println("内层-->" + j);
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;

	}

	public static void main(String[] args) {
		int array[] = { 10, 20, 5, 3, 40, 80 };
		int[] buSort = bubbleSort2(array);
		for (int i = 0; i < buSort.length; i++) {
			System.out.println("" + buSort[i]);
		}
	}

	public static int[] bubbleSort2(int[] array) {
		int length = array.length;
		int i = 0;
		int j = 0;
		int temp = 0;
		for (i = length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

}
