
public class Java2 {

	public static void main(String[] args) {
		// 引数の例 渡す値が一つの場合
			System.out.println("メソッドを引き出します");
			hello("湊");
			hello("朝香");
			hello("菅原");
			System.out.println("メソッドの呼び出しが終わりました");
	}
	
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
}
