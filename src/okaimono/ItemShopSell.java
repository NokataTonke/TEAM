package okaimono;

public class ItemShopSell {
	public void optionDisply() {

		System.out.println
				("-------------");
		System.out.println
				("アイテム屋のおばちゃん：「何を売りたいんだい？」");
		System.out.println
				("[あなたの所持金] \\" + Bag.money);
		System.out.println();
		System.out.println(
				"1.薬草(\\100)" + "(" + Bag.yakuso + "有)　" +
				"2.エリクサー(\\250)" + "(" + Bag.elixir + "有)　" +
				"3.酒(\\300)" +  "(" + Bag.sake + "有)　");
		System.out.println(
				"4.煙幕(\\500)" + "(" + Bag.enmaku + "有)　" +
				"5.タバコ(\\480)" + "(" + Bag.tabako + "有)　");
		System.out.println();

		int i = new java.util.Scanner(System.in).nextInt();
		SellConfirm sc = new SellConfirm();

		switch(i) {
			case 1:
				sc.sellConfirm(1, Bag.yakuso);
				break;
			case 2:
				sc.sellConfirm(2, Bag.elixir);
				break;
			case 3:
				sc.sellConfirm(3, Bag.sake);
				break;
			case 4:
				sc.sellConfirm(4, Bag.enmaku);
				break;
			case 5:
				sc.sellConfirm(5, Bag.tabako);
				break;
		}

		int k;
		do {
			System.out.println
					("-------------");
			System.out.println
					("アイテム屋のおばちゃん：「他にも売りたい物はあるかい？」");
			System.out.println
					("[あなたの所持金] \\" + Bag.money);
			System.out.println();
			System.out.println(
					"1.薬草(\\100)" + "(" + Bag.yakuso + "有)　" +
					"2.エリクサー(\\250)" + "(" + Bag.elixir + "有)　" +
					"3.酒(\\300)" +  "(" + Bag.sake + "有)　");
			System.out.println(
					"4.煙幕(\\500)" + "(" + Bag.enmaku + "有)　" +
					"5.タバコ(\\480)" + "(" + Bag.tabako + "有)　" +
					"6. もう大丈夫");
			System.out.println();

			k = new java.util.Scanner(System.in).nextInt();
			switch(k) {
				case 1:
					sc.sellConfirm(1, Bag.yakuso);
					break;
				case 2:
					sc.sellConfirm(2, Bag.elixir);
					break;
				case 3:
					sc.sellConfirm(3, Bag.sake);
					break;
				case 4:
					sc.sellConfirm(4, Bag.enmaku);
					break;
				case 5:
					sc.sellConfirm(5, Bag.tabako);
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
