package okaimono;

public class Bag {
	static int money = 10000;
	private int yakuso;
	private int enmaku;
	private int sake;
	private int tabako;
	private int elixir;

//	一応最大数のフィールドを用意するが最大所持数は決めない方向にしたいが…
//　引数でバッグとって解決
	final int yakusoMAX = 10;
	final int enmakuMAX = 3;
	final int sakeMAX = 5;
	final int tabakoMAX = 1;
	final int elixirMAX = 1;

	//Getter,Setter
	public int getYakuso() {
		return this.yakuso;
	}
	public void setYakuso(int yakuso) {
		if(yakuso >= 0) {
			this.yakuso = yakuso;
		} else {
			System.out.println("薬草が負の値です！");
		}
	}
	public int getEnmaku() {
		return this.enmaku;
	}
	public void setEnmaku(int enmaku) {
		if(enmaku >= 0) {
			this.enmaku = enmaku;
		} else {
			System.out.println("煙幕が負の値です！");
		}
	}
	public int getSake() {
		return this.sake;
	}
	public void setSake(int sake) {
		if(sake >= 0) {
			this.sake = sake;
		} else {
			System.out.println("酒が負の値です！");
		}
	}
	public int getTabako() {
		return this.tabako;
	}
	public void setTabako(int tabako) {
		if(tabako >= 0) {
			this.tabako = tabako;
		} else {
			System.out.println("タバコが負の値です！");
		}
	}
	public int getElixir() {
		return this.elixir;
	}
	public void setElixir(int elixir) {
		if(elixir >= 0) {
			this.elixir = elixir;
		} else {
			System.out.println("エリクサーが負の値です！");
		}
	}

	public void showBag() {
		System.out.println
				("【あなたのバックの中身は以下の通りです】");
		System.out.println
				("-------------");
		System.out.println
				("所持金：" + "\\" + Bag.money);
		System.out.println();
		System.out.println
				("薬草　：" + getYakuso() + "個");
		System.out.println
				("煙幕　：" + getEnmaku() + "個");
		System.out.println
				("酒　　：" + getSake() + "個");
		System.out.println
				("タバコ：" + getTabako() + "個");
		System.out.println
				("ｴﾘｸｻｰ ：" + getElixir() + "個");
		System.out.println();
		System.out.println("　　　0.戻る");
		System.out.println
				("-------------");
		System.out.println();
	}

//	public void useYakusoInB() {
//		if (Bag.yakuso > 0) {
//			Bag.yakuso--;
//			set
//		}
//	}

}
