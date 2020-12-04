package okaimono;

public class ItemShopSell {
	public void optionDisply(Bag b) {

		System.out.println
				("-------------");
		System.out.println
				("アイテム屋のおばちゃん：「何を売りたいんだい？」");
		System.out.println
				("[あなたの所持金] \\" + b.gold);
		System.out.println();
		System.out.println(
				"1.薬草(\\100)" + "(" + b.getYakuso() + "有)　" +
				"2.エリクサー(\\250)" + "(" + b.getElixir() + "有)　" +
				"3.酒(\\300)" +  "(" + b.getSake() + "有)　");
		System.out.println(
				"4.煙幕(\\500)" + "(" + b.getEnmaku() + "有)　" +
				"5.タバコ(\\480)" + "(" + b.getTabako() + "有)　");
		System.out.println();

		int i = new java.util.Scanner(System.in).nextInt();
		SellConfirm sc = new SellConfirm();

		switch(i) {
			case 1:
				sc.sellConfirm(b, 1, b.getYakuso());
				break;
			case 2:
				sc.sellConfirm(b, 2, b.getElixir());
				break;
			case 3:
				sc.sellConfirm(b, 3, b.getSake());
				break;
			case 4:
				sc.sellConfirm(b, 4, b.getEnmaku());
				break;
			case 5:
				sc.sellConfirm(b, 5, b.getTabako());
				break;
		}

		int k;
		do {
			System.out.println
					("-------------");
			System.out.println
					("アイテム屋のおばちゃん：「他にも売りたい物はあるかい？」");
			System.out.println
					("[あなたの所持金] \\" + b.gold);
			System.out.println();
			System.out.println(
					"1.薬草(\\100)" + "(" + b.getYakuso() + "有)　" +
					"2.エリクサー(\\250)" + "(" + b.getElixir() + "有)　" +
					"3.酒(\\300)" +  "(" + b.getSake() + "有)　");
			System.out.println(
					"4.煙幕(\\500)" + "(" + b.getEnmaku() + "有)　" +
					"5.タバコ(\\480)" + "(" + b.getTabako() + "有)　" +
					"6. もう大丈夫");
			System.out.println();

			k = new java.util.Scanner(System.in).nextInt();
			switch(k) {
				case 1:
					sc.sellConfirm(b, 1, b.getYakuso());
					break;
				case 2:
					sc.sellConfirm(b, 2, b.getElixir());
					break;
				case 3:
					sc.sellConfirm(b, 3, b.getSake());
					break;
				case 4:
					sc.sellConfirm(b, 4, b.getEnmaku());
					break;
				case 5:
					sc.sellConfirm(b, 5, b.getTabako());
					break;
				case 6:
					System.out.println
							("アイテム屋のおばちゃん：「他にも何かようかい？」");
					System.out.println
							("[あなたの所持金] \\" + b.gold);
					System.out.println();
					break;
			}
		} while (k != 6);

	}
}
