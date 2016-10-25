package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {

		double bestellwert = 10000, bisherigesKundenBestellvolumen = 50000;
		boolean istPremiumKunde = true;
		double rabatt1 = 0, rabatt2 = 0, rabatt3 = 0, rabatt = 0;

		// Bestellhöhe
		if (bestellwert >= 100) {
			rabatt1 = 1;
		}

		if (bestellwert >= 500) {
			rabatt1 = 2;
		}

		if (bestellwert >= 2000) {
			rabatt1 = 3;
		}

		if (bestellwert >= 5000) {
			rabatt1 = 5;
		}

		if (istPremiumKunde == true) {
			rabatt1 = rabatt1 * 2;
		}

		// Bisheriges Bestellvolumen
		if (bisherigesKundenBestellvolumen >= 10000) {
			rabatt2 = 7.5;
		}

		if (bisherigesKundenBestellvolumen >= 50000) {
			rabatt2 = 12.5;
		}

		if ((bestellwert * 2) > bisherigesKundenBestellvolumen) {
			rabatt3 = 3;
		}

		rabatt = rabatt1 + rabatt2 + rabatt3;

		if (istPremiumKunde == true) {

			if (rabatt > 20) {
				rabatt = 20;
			}
		} else {
			if (rabatt > 15) {
				rabatt = 15;
			}
		}
		System.out.println("Rabatt = " + rabatt);
		System.out.println("Bestellwert = " + (bestellwert - bestellwert * (rabatt / 100)));
	}

}
