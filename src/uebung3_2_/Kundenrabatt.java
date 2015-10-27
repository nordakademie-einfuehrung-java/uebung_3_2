package uebung3_2_;

public class Kundenrabatt {

	public static void main(String[] args) {
		double bestellwert = 500;
		double bisherigesKundenBestellvolumen = 20000;
		boolean istPremiumKunde = false;
		double rabatt = 0;

		if (bestellwert > 4999) {
			rabatt = 0.5;
		} else if (bestellwert > 1999) {
			rabatt = 0.3;
		} else if (bestellwert > 499) {
			rabatt = 0.2;
		} else if (bestellwert > 99) {
			rabatt = 0.1;
		}

		if (istPremiumKunde == true) {
			rabatt = rabatt * 2;
		}

		if (bisherigesKundenBestellvolumen > 49999) {
			rabatt = rabatt + 0.125;
		} else if (bisherigesKundenBestellvolumen > 9999) {
			rabatt = rabatt + 0.075;
		}

		if (bestellwert == bisherigesKundenBestellvolumen * 2) {
			rabatt = rabatt + 0.03;
		}

		if (istPremiumKunde == true) {
			if (rabatt >= 0.2) {
				rabatt = 0.2;
			}
		} else {
			if (rabatt >= 0.15) {
				rabatt = 0.15;
			}
		}

		System.out.println(rabatt);

	}
}
