package okaimono;

public class ItemShopSell {
	public void optionDisply() {
		System.out.println
				("-------------");
		System.out.println
				("アイテム屋のおばちゃん：「何を売りたいんだい？」");
		System.out.println
				("[あなたの所持金] \\" + HeroBag.money);
		System.out.println();
		System.out.println(
				"1.薬草(\\100)" + "(" + HeroBag.yakuso + "有)　" +
				"2.消毒薬(\\250)" + "(" + HeroBag.shodoku + "有)　" +
				"3.酒(\\300)" +  "(" + HeroBag.sake + "有)　");
		System.out.println(
				"4.煙幕(\\500)" + "(" + HeroBag.enmaku + "有)　" +
				"5.タバコ(\\480)" + "(" + HeroBag.tabako + "有)　");
		System.out.println();

		int i = new java.util.Scanner(System.in).nextInt();
		SellConfirm sc = new SellConfirm();

		switch(i) {
			case 1:
				sc.sellConfirm(1, HeroBag.yakuso);
				break;
			case 2:
				sc.sellConfirm(2, HeroBag.shodoku);
				break;
			case 3:
				sc.sellConfirm(3, HeroBag.sake);
				break;
			case 4:
				sc.sellConfirm(4, HeroBag.enmaku);
				break;
			case 5:
				sc.sellConfirm(5, HeroBag.tabako);
				break;
		}

		int k;
		do {
			System.out.println
					("-------------");
			System.out.println
					("アイテム屋のおばちゃん：「他にも売りたい物はあるかい？」");
			System.out.println
					("[あなたの所持金] \\" + HeroBag.money);
			System.out.println();
			System.out.println(
					"1.薬草(\\100)" + "(" + HeroBag.yakuso + "有)　" +
					"2.消毒薬(\\250)" + "(" + HeroBag.shodoku + "有)　" +
					"3.酒(\\300)" +  "(" + HeroBag.sake + "有)　");
			System.out.println(
					"4.煙幕(\\500)" + "(" + HeroBag.enmaku + "有)　" +
					"5.タバコ(\\480)" + "(" + HeroBag.tabako + "有)　" +
					"6. もう大丈夫");
			System.out.println();

			k = new java.util.Scanner(System.in).nextInt();
			switch(k) {
				case 1:
					sc.sellConfirm(1, HeroBag.yakuso);
					break;
				case 2:
					sc.sellConfirm(2, HeroBag.shodoku);
					break;
				case 3:
					sc.sellConfirm(3, HeroBag.sake);
					break;
				case 4:
					sc.sellConfirm(4, HeroBag.enmaku);
					break;
				case 5:
					sc.sellConfirm(5, HeroBag.tabako);
					break;
				case 6:
					System.out.println
							("アイテム屋のおばちゃん：「他にも何かようかい？」");
					System.out.println
							("[あなたの所持金] \\" + HeroBag.money);
					System.out.println();
					break;
			}
		} while (k != 6);

	}
}
