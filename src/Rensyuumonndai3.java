
public class Rensyuumonndai3 {

	public static void main(String[] args) {
		//- BMIクラスを作成する。
		//- BMIクラスの中に身長(cm)と体重(kg)を受け取るとBMIを返却する
		//以下のメソッドを作成する
		System.out.print("身長を入力してください(cm)>");
		double height=new java.util.Scanner(System.in).nextDouble();
		System.out.print("体重を入力してください(kg)>");
		double weight=new java.util.Scanner(System.in).nextDouble();
		System.out.printf("あなたのBMIは%.2fです。\n",getBMI(height,weight));
	}
	/*
	身長(cm)と体重(kg)を引数で受け取っとBMIを返却するメソッド
	*/
	public static double getBMI(double heightCm,double weightKg){
		double heightM = heightCm/100;
		return weightKg / (heightM*heightM);
	}
		
		
	
}
