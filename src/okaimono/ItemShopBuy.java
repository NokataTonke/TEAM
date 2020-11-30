package okaimono;

public class ItemShopBuy {
	public void optionDisply(Bag b) {

		System.out.println
				("-------------");
		System.out.println
				("アイテム屋のおばちゃん：「何が欲しいんだい？」");
		System.out.println
				("[あなたの所持金] \\" + Bag.money);
		System.out.println();
		System.out.println(
				"1.薬草(\\100)" + "(" + Bag.yakuso + "有)　" +
				"2.エリクサー(\\250)" + "(" + Bag.elixir + "有)　" +
				"3.酒(\\300)" +  "(" + Bag.sake + "有)　");
		System.out.println(
				"4.煙幕(\\500)" + "(" + Bag.enmaku + "有)　" +
				"5.タバコ(\\3000)" + "(" + Bag.tabako + "有)　");
		System.out.println();

		int i = new java.util.Scanner(System.in).nextInt();
		BuyConfirm bc = new BuyConfirm();

		switch(i) {
			case 1:
				bc.buyConfirm(1, Bag.yakuso);
				break;
			case 2:
				bc.buyConfirm(2, Bag.elixir);
				break;
			case 3:
				bc.buyConfirm(3, Bag.sake);
				break;
			case 4:
				bc.buyConfirm(4, Bag.enmaku);
				break;
			case 5:
				bc.buyConfirm(5, Bag.tabako);
				break;
		}

		int k;
		do {
			System.out.println
					("-------------");
			System.out.println
					("アイテム屋のおばちゃん：「他に欲しい物はあるかい？」");
			System.out.println
					("[あなたの所持金] \\" + Bag.money);
			System.out.println();
			System.out.println(
					"1.薬草(\\100)" + "(" + Bag.yakuso + "有)　" +
					"2.エリクサー(\\250)" + "(" + Bag.elixir + "有)　" +
					"3.酒(\\300)" +  "(" + Bag.sake + "有)　");
			System.out.println(
					"4.煙幕(\\500)" + "(" + Bag.enmaku + "有)　" +
					"5.タバコ(\\3000)" + "(" + Bag.tabako + "有)　" +
					"6. もう大丈夫");
			System.out.println();

			k = new java.util.Scanner(System.in).nextInt();
			switch(k) {
				case 1:
					bc.buyConfirm(1, Bag.yakuso);
					break;
				case 2:
					bc.buyConfirm(2, Bag.elixir);
					break;
				case 3:
					bc.buyConfirm(3, Bag.sake);
					break;
				case 4:
					bc.buyConfirm(4, Bag.enmaku);
					break;
				case 5:
					bc.buyConfirm(5, Bag.tabako);
					break;
				case 6:
					System.out.println
							("アイテム屋のおばちゃん：「他にも何かようかい？」");
					System.out.println
							("[あなたの所持金] \\" + Bag.money);
					System.out.println();
					break;
			}
		} while (k != 6);

	}
}
