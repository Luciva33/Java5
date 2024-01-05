
public class Java8 {

	public static void main(String[] args) {
		// int型配列を受けとり、全ての要素を表示するメソッド
		
		int[] array = {1,2,3};
		printArray(array);  //配列を渡す
	}

	public static void printArray(int[] array) {
		for(int element : array ) {
		System.out.println(element);
	}
	}
}
