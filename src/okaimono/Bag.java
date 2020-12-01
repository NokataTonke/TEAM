package okaimono;

public class Bag {
	static int money = 10000;
	private int yakuso = 10;
	private int enmaku = 3;
	private int sake = 5;
	private int tabako = 1;
	private int elixir = 1;

	final int yakusoMAX = 10;
	final int enmakuMAX = 3;
	final int sakeMAX = 5;
	final int tabakoMAX = 1;
	final int elixirMAX = 1;

	//Getter,Setter
	public int getYakuso() {return this.yakuso;}
	public void setYakuso(int yakuso) {this.yakuso = yakuso;}
	public int getEnmaku() {return this.enmaku;}
	public void setEnmaku(int enmaku) {this.enmaku = enmaku;}
	public int getSake() {return this.sake;}
	public void setSake(int sake) {this.sake = sake;}
	public int getTabako() {return this.tabako;}
	public void setTabako(int tabako) {this.tabako = tabako;}
	public int getElixir() {return this.elixir;}
	public void setElixir(int elixir) {this.elixir = elixir;}

//	アイテム表示のメソッド
	public void showBag() {
		System.out.println
				("-------------");
		System.out.println
				("【何を使用しますか？】");
		System.out.println();
		System.out.println
				("　　　　1.薬草　：" + getYakuso() + "個");
		System.out.println
				("　　　　2.煙幕　：" + getEnmaku() + "個");
		System.out.println
				("　　　　3.酒　　：" + getSake() + "個");
		System.out.println
				("　　　　4.タバコ：" + getTabako() + "個");
		System.out.println
				("　　　　5.ｴﾘｸｻｰ ：" + getElixir() + "個");
		System.out.println();
		System.out.println
				("{アイテムNo.を入力してください}(0.戻る)>");
		System.out.println
				("-------------");
		System.out.println();


	}

	//アイテム使用のメソッド
	public void useYakusoInB(Hero h) {
		if (getYakuso() > 0) {
			setYakuso(getYakuso() - 1);
			h.setHP(h.getHP() + 1);
			System.out.println("HPが10回復した！");
		} else {
			System.out.println("薬草がないため回復できない！");
		}
	}
	public void useYakusoOutB(Hero h) {
		if (getYakuso() > 0) {
			setYakuso(getYakuso() - 1);
			h.setHP(h.getHP() + 1);
			System.out.println("HPが10回復した！");
		} else {
			System.out.println("薬草がないため回復できない！");
		}
	}
	public void useEnmakuInB(Hero h) {
		if (getEnmaku() > 0) {
			setEnmaku(getEnmaku() - 1);
//			h.run(); 逃げるを確定で実行できるような処理を実装
		} else {
			System.out.println("煙幕を持っていない");
		}
	}
	public void useEnmakuOutB() {
		if (getEnmaku() > 0) {
			setEnmaku(getEnmaku() - 1);
			System.out.println("煙幕を使用した！");
			System.out.println("煙たくなっただけだった");
		} else {
			System.out.println("煙幕を持っていない");
		}
	}
	public void useSakeInB() {
		if (getSake() > 0) {
			setSake(getSake() - 1);
			System.out.println("戦闘中に酒を飲んだ！");
			System.out.println("歌でも歌いたい様ないい気分だ！");
		} else {
			System.out.println("酒を持っていない");
		}
	}
	public void useSakeOutB() {
		if (getSake() > 0) {
			setSake(getSake() - 1);
			System.out.println("昼から街中で酒を飲んだ！");
			System.out.println("陽気な気分になった！");
		} else {
			System.out.println("酒を持っていない");
		}
	}
	public void useTabakoInB() {
		if (getTabako() > 0) {
			setTabako(getTabako() - 1);
			System.out.println("戦闘中に喫煙した！");
			System.out.println("ふぅ…落ち着いてきた");
		} else {
			System.out.println("タバコを切らしている");
		}
	}
	public void useTabakoOutB() {
		if (getTabako() > 0) {
			setTabako(getTabako() - 1);
			System.out.println("路上喫煙に踏み切った！");
			System.out.println("周りの視線が痛い！");
		} else {
			System.out.println("タバコを切らしている");
		}
	}
	public void useElixirInB(Hero h) {
		if (getElixir() > 0) {
			setElixir(getElixir() - 1);
			h.setHP(h.getHPMAX());
			h.setMP(h.getMPMAX());
			System.out.println("エリクサーを使用した！");
			System.out.println("HPとMPが全回復した！");
		} else {
			System.out.println("エリクサーを持っていない");
		}
	}
	public void useElixirOutB() {
		if (getElixir() > 0) {
			System.out.println("エリクサーはあるものの…もったいない気がする");
		} else {
			System.out.println("エリクサーを持っていない");
		}
	}

	public void checkMAX(int i, int MAX) {
//		何かイベント上でアイテムが増えるときは必ず
//		Setterの前に
//		（現在の所持数 + 受け渡すアイテム数)を引数i、
//		該当するアイテムの最大所持数をMAXとして
//		このメソッドを実行する
		if (i > MAX) {
			System.out.println("所持数がいっぱいだ！");
			i = MAX;
			System.out.println("持ちきれないアイテムは溢れてしまった！");
		}
	}
}
