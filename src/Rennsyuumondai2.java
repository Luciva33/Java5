
public class Rennsyuumondai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String address = "xxxx@xxx.com";
		String text = "今度○○しませんか？";
		String title = "○○";
		email(address,text);
	}
	public static void  email(String address , String text) {
		System.out.println
			(address + "に以下のメールを送信しました");
		System.out.println("件名 : 無題");
		
		System.out.println("本文" + text);
	}
	
	public static void  email(String title, String address , String text) {
		System.out.println
			(address + "に以下のメールを送信しました");
		System.out.println("件名 :"  + title);
	
		System.out.println("本文" + text);
	}
}
