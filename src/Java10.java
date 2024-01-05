
public class Java10 {

	public static void main(String[] args) {
		// 戻り値が配列の場合
		
		int[] array = makeArray(3);
		for(int i : array) {
			System.out.println(i);
		}
		
	}
		
	public static int[] makeArray(int size) {
		int[] newArray = new int[size];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
			return newArray;
	}
		

}
