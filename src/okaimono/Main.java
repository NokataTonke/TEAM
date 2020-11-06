package okaimono;

public class Main {

	public static void main(String[] args) {
		while(true) {
			System.out.println
					("【何をしようか？】");
			System.out.println
					("[あなたの所持金] \\" + HeroBag.money);
			System.out.println();
			System.out.println
					("1.アイテム屋へ 2.武具屋へ 3.バック確認");
			System.out.println();

			int i = new java.util.Scanner(System.in).nextInt();
			switch (i) {
				case 1:
					Okaimono oi = new Okaimono();
					oi.goItemShop();
					break;
				case 2:

					System.out.println();
					System.out.println("！！！！！！！！！！！！！");
					System.out.println("!【この処理はまだ未完成】!");
					System.out.println("！！！！！！！！！！！！！");
					System.out.println();

					Okaimono ow = new Okaimono();
					ow.goWeaponShop();
					break;
				case 3:
					HeroBag hb = new HeroBag();
					hb.showBag();
					break;
				default:
			}
		}
	}
}

