package uebung_3_2;

public class uebung_3_2 {

	public static void main(String[] args) {
		double bestellwert = 100;
		double bisherigesKundenBestellvolumen = 50000;

		boolean istPremiumKunde = true;

		double R1 = 0;
		double R2 = 0;
		double R3 = 0;

		if (istPremiumKunde == true) {
			if (bestellwert >= 100) {
				R1 = 2;
				if (bestellwert >= 500) {
					R1 = 4;
					if (bestellwert >= 2000) {
						R1 = 6;
						if (bestellwert >= 5000) {
							R1 = 10;
						}
					}
				}
			}
		}

		else {
			if (bestellwert >= 100) {
				R1 = 1;
			}
			if (bestellwert >= 500) {
				R1 = 2;
				if (bestellwert >= 2000) {
					R1 = 3;
					if (bestellwert >= 5000) {
						R1 = 5;
					}
				}
			}
		}

		if (bisherigesKundenBestellvolumen > 10000) {
			R2 = 7.5;
			if (bisherigesKundenBestellvolumen >= 50000) {
				R2 = 12.5;
			}
		}

		if (bestellwert >= 2 * bisherigesKundenBestellvolumen) {
			R3 = 3;
		}

		double RG = R1 + R2 + R3;

		if (istPremiumKunde == true)

		{
			if (RG >= 20) {
				RG = 20;
			} else {
				if (RG >= 15) {
					RG = 15;
				}
			}
		}
		
		double rabattInEuro = bestellwert * (RG/100);
		double neuerBestellwert = bestellwert - rabattInEuro;
		
		System.out.println("Gesamtrabatt = " + RG + "%");
		System.out.println("Rabatt in Euro = " + rabattInEuro + "€");
		System.out.println("neuer Bestellwert = " + neuerBestellwert + "€");

	}
}
