package okaimono;

public class SellConfirm {
	public void sellConfirm(Bag b, int i, int hbItem) {
		String selectItem = null;
		int sellingPrice = 0;
		int nowGold = Bag.gold;
//		最大所持数でも買うことができるのがおかしい

		switch(i) {
			case 1:
				selectItem = "薬草";
				sellingPrice = 100;
				break;
			case 2:
				selectItem = "エリクサー";
				sellingPrice = 250;
				break;
			case 3:
				selectItem = "酒";
				sellingPrice = 300;
				break;
			case 4:
				selectItem = "煙幕";
				sellingPrice = 500;
				break;
			case 5:
				selectItem = "タバコ";
				sellingPrice = 480;
				break;
		}

		System.out.println
				("アイテム屋のおばちゃん：「" + selectItem + "を1つ売ってくれるのかい？」");
		System.out.println
				("-------------");
		System.out.println
				("[買取金額] \\" + sellingPrice);
		System.out.println
				("[あなたの所持金] \\" + Bag.gold + "　→　\\" + (nowGold + sellingPrice));
		System.out.println
				("現在の" + selectItem + "所持数：" + hbItem + "個");
		System.out.println
				("-------------");
		System.out.println();
		System.out.println
				("1.YES 2.NO");
		System.out.println();

		int j = new java.util.Scanner(System.in).nextInt();
			if(j == 1) { // 売る。YESを選択した場合
				if(hbItem > 0) { // 選択した売りたいアイテムが1つ以上ある場合
				System.out.println
						(selectItem + "を1つ売った！");
					switch(i) {
						case 1:
							b.setYakuso(b.getYakuso()-1);
							Bag.gold += sellingPrice;
							break;
						case 2:
							b.setElixir(b.getElixir()-1);
							Bag.gold += sellingPrice;
							break;
						case 3:
							b.setSake(b.getSake()-1);
							Bag.gold += sellingPrice;
							break;
						case 4:
							b.setEnmaku(b.getEnmaku()-1);
							Bag.gold += sellingPrice;
							break;
						case 5:
							b.setTabako(b.getTabako()-1);
							Bag.gold += sellingPrice;
							break;
					}
					System.out.println
							("[あなたの所持金] \\" + Bag.gold);
					System.out.println();

				} else { // 選択した売りたいアイテムが1つもない（0以下）の場合
					System.out.println
							("アイテム屋のおばちゃん：「なんだ、1つも持ってないじゃないか。」");
					System.out.println();

				}

			}
			if(j == 2) { //売らない。NOの時の処理
				System.out.println
						("アイテム屋のおばちゃん：「売らないのかい？わかったよ。」");
				System.out.println();

			}
	}
}
