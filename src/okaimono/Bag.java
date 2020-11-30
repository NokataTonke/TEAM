package okaimono;

public class Bag {
	static int money = 10000;
	static int yakuso;
	static int elixir;
	static int sake;
	static int enmaku;
	static int tabako;

	public void showBag() {
		System.out.println
				("【あなたのバックの中身は以下の通りです】");
		System.out.println
				("-------------");
		System.out.println
				("所持金：" + "\\" + Bag.money);
		System.out.println();
		System.out.println
				("薬草　：" + Bag.yakuso + "個");
		System.out.println
				("酒　　：" + Bag.sake + "個");
		System.out.println
				("煙幕　：" + Bag.enmaku + "個");
		System.out.println
				("タバコ：" + Bag.tabako + "個");
		System.out.println
				("ｴﾘｸｻｰ ：" + Bag.elixir + "個");
		System.out.println();
		System.out.println("　　　0.戻る");
		System.out.println
				("-------------");
		System.out.println();
	}

}
