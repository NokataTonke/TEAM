package okaimono;

public class HeroBag {
	static int money = 10000;
	static int yakuso;
	static int shodoku;
	static int sake;
	static int enmaku;
	static int tabako;

	public void showBag() {
		System.out.println
				("【あなたのバックの中身は以下の通りです】");
		System.out.println
				("-------------");
		System.out.println
				("所持金：" + "\\" + HeroBag.money);
		System.out.println();
		System.out.println
				("薬草　：" + HeroBag.yakuso + "個");
		System.out.println
				("消毒薬：" + HeroBag.shodoku + "個");
		System.out.println
				("酒　　：" + HeroBag.sake + "個");
		System.out.println
				("煙幕　：" + HeroBag.enmaku + "個");
		System.out.println
				("タバコ：" + HeroBag.tabako + "個");
		System.out.println
				("-------------");
		System.out.println();
	}

}
