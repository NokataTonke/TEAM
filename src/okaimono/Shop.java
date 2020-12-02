package okaimono;

public class Shop {
	Bag b;
	Weapon w;

	public Shop(Bag b, Weapon w) {
		this.b = b;
		this.w = w;
	}
	public void goItemShop(Bag b) {
		System.out.println("-------------");
		System.out.println
				("アイテム屋のおばちゃん：「いらっしゃい！いいものあるよ。」");
		System.out.println
				("[あなたの所持金] \\" + Bag.money);
		System.out.println();

		while(true) {
			System.out.println
					("1.買う 2.売る 3.話す 4.アイテム屋を去る");
			int i = new java.util.Scanner(System.in).nextInt();
			switch (i) {
				case 1:
					ItemShopBuy isb = new ItemShopBuy();
					isb.optionDisply(b);
					break;
				case 2:
					ItemShopSell iss = new ItemShopSell();
					iss.optionDisply(b);
					break;
				case 3:
					ItemShopTalk.toObatyan();
					break;
				case 4:
					System.out.println
							("アイテム屋のおばちゃん：「そうかい。また来るんだよ！」");
					System.out.println();
					break;
				default:
			}
			if(i == 4) {
				break;
			}
		}
	}
	public void goWeaponShop(Weapon w) {
		System.out.println
				("-------------");
		System.out.println
				("武具屋の親父：「らっしゃい！調子はどうだい？」");
		System.out.println();

	}
//	public class EnterTest {
//
//		public static void main(String[] args)throws InterruptedException {
//			int count = 1;
//
//			do {
//				showText("Enterをおしてね", 30);
//				String e;
//				e = new Scanner(System.in).nextLine();
//				String succesText = "成功！" + count + "回目";
//				showText(succesText, 30);
//				System.out.println();
//				System.out.println("");
//				count++;
//			} while(count < 11);
//
//		}
//
//		private static void showText( String text, int dispSpeedMsec ) throws InterruptedException {
//	        String[] textArray = text.split( "" );
//
//	        for( int i = 0; i < textArray.length; i++ ){
//	            // 文字を表示
//	            System.out.print( textArray[ i ] );
//
//	            // dispSpeedMsecの時間だけ処理を停止
//	            Thread.sleep( dispSpeedMsec );
//	        }
//
//	    }
//	}
}
