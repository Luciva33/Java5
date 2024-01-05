
public class Java3 {

	public static void main(String[] args) {
		// 引数の例（渡す値が複数の場合）
		add(100,20);
		//add(200,50);
		
	}
	//複数の値を受け取るaddメソッド
	public static int add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
		System.out.printf("%d+ %d = %d\n", x , y ,ans);
		System.out.printf("%d+ %d = %d\n", x , y ,ans);
		//特殊な変数が入りますよ
		//printfは改行しないので、\nをつける
		return ans;
	}
}
