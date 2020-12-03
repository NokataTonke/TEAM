package okaimono;

import java.util.Scanner;

public class Bag {
	static int money = 1000;

	final int yakusoMAX = 10;
	final int enmakuMAX = 3;
	final int sakeMAX = 5;
	final int tabakoMAX = 1;
	final int elixirMAX = 1;

	private int stockArray[] = {8, 3, 5, 1, 1};

	String infoArray[] = {
	"使うとHPを10回復\n" +
	"　　　　用法容量を守ろう",
	"尋常ではない量の煙を起こす\n" +
	"　　　　戦闘から退避する際に便利",
	"気つけや嗜好品として使用される\n" +
	"　　　　使うとテンションアップ",
	"ニコチンとタールを摂取できる\n" +
	"　　　　喫煙者の必需品",
	"強力な秘薬\n" +
	"　　　　使いどころが肝要"
	};

	String nameArray[] = {
		"薬草",
		"煙幕",
		"酒",
		"タバコ",
		"ｴﾘｸｻｰ"
	};

//	boolean h.inBattle = false;
	// バトル中か否かを判定するために必要なフィールドをどこが持つか
	// バトルクラスからHeroクラスかBagに書き込むなどいろいろ

	//Getter,Setter
	public int getYakuso() {return getCount(0);}
	public void setYakuso(int yakuso) {checkMAX(yakuso, yakusoMAX);this.stockArray[0] = yakuso;}
	public int getEnmaku() {return getCount(1);}
	public void setEnmaku(int enmaku) {checkMAX(enmaku, enmakuMAX);this.stockArray[1] = enmaku;}
	public int getSake() {return getCount(2);}
	public void setSake(int sake) {checkMAX(sake, sakeMAX);this.stockArray[2] = sake;}
	public int getTabako() {return getCount(3);}
	public void setTabako(int tabako) {checkMAX(tabako, tabakoMAX);this.stockArray[3] = tabako;}
	public int getElixir() {return getCount(4);}
	public void setElixir(int elixir) {checkMAX(elixir, elixirMAX);this.stockArray[4] = elixir;}

	public int getCount(int n) {
		return this.stockArray[n];
	}

//	アイテム表示のメソッド
	public void showBag(Hero h, Bag b) {
		int i = 0;
		do{
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

			i = new Scanner(System.in).nextInt();

			int k = 0;
			SelectItem si = new SelectItem();

			switch (i) {
			case 0:
				break;
			case 1:
				si.selectItem(b, h, i);

				k = new Scanner(System.in).nextInt();
				if (k == 1) {
					if (h.inBattle == true) {
						b.useYakusoInB(h);
					} else {
						b.useYakusoOutB(h);
					}
				}else if (k == 2) {
					//何もしない
				}
				break;
			case 2:
				si.selectItem(b, h, i);

				k = new Scanner(System.in).nextInt();
				if (k == 1) {
					if (h.inBattle == true) {
						b.useEnmakuInB(h);
					} else {
						b.useEnmakuOutB();
					}
				}else if (k == 2) {
					//何もしない
				}
				break;
			case 3:
				si.selectItem(b, h, i);

				k = new Scanner(System.in).nextInt();
				if (k == 1) {
					if (h.inBattle == true) {
						b.useSakeInB();
					} else {
						b.useSakeOutB();
					}
				}else if (k == 2) {
					//何もしない
				}
				break;
			case 4:
				si.selectItem(b, h, i);

				k = new Scanner(System.in).nextInt();
				if (k == 1) {
					if (h.inBattle == true) {
						b.useTabakoInB();
					} else {
						b.useTabakoOutB();
					}
				}else if (k == 2) {
					//何もしない
				}
				break;
			case 5:
				si.selectItem(b, h, i);

				k = new Scanner(System.in).nextInt();
				if (k == 1) {
					if (h.inBattle == true) {
						b.useElixirInB(h);
					} else {
						b.useElixirOutB();
					}
				}else if (k == 2) {
					//何もしない
				}
				break;
			}
		}while(i != 0);
	}

	//アイテム使用のメソッド
	public void useYakusoInB(Hero h) {
		if (getYakuso() > 0) {
			if(h.getHP() < h.getHPMAX()) {
				int kizu = h.getHPMAX()-h.getHP();
				if(kizu < 10) {
					setYakuso(getYakuso()-1);
					h.setHP(h.getHP() + kizu);
					System.out.println("HPが" + kizu + "回復した！");
					System.out.println("HPが最大の" + h.getHPMAX() + "になった！");
				} else {
					setYakuso(getYakuso()-1);
					h.setHP(h.getHP() + 10);
					System.out.println("HPが10回復した！");
					System.out.println("HP:" + h.getHP() + "/" + h.getHPMAX());
				}
			} else {
				System.out.println("HPは十分にある。元気だから使わなくていいかな。");
			}

		} else {
			System.out.println("薬草がないため回復できない！");
		}
	}
	public void useYakusoOutB(Hero h) {
		if (getYakuso() > 0) {
			if(h.getHP() < h.getHPMAX()) {
				int kizu = h.getHPMAX()-h.getHP();
				if(kizu < 10) {
					setYakuso(getYakuso()-1);
					h.setHP(h.getHP() + kizu);
					System.out.println("HPが" + kizu + "回復した！");
					System.out.println("HPが最大の" + h.getHPMAX() + "になった！");
				} else {
					setYakuso(getYakuso()-1);
					h.setHP(h.getHP() + 10);
					System.out.println("HPが10回復した！");
					System.out.println("HP:" + h.getHP() + "/" + h.getHPMAX());
				}			} else {
				System.out.println("HPは十分にある。元気だから使わなくていいかな。");
			}
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
			System.out.println("昼から酒を飲んだ！");
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
//		このメソッドを実行する→Setterに含めておいた
		if (i > MAX) {
			System.out.println("所持数がいっぱいだ！");
			i = MAX;
			System.out.println("持ちきれないアイテムは溢れてしまった！");
		}
	}
}
