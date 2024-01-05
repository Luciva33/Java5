
public class Java9 {

	
	public static void incArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		// 同じ配列を参照していることをかくにんする
		
		int[] array = {1,2,3};
		incArray(array);
		for(int i : array) {
			System.out.println(i);
		}
	}

}
