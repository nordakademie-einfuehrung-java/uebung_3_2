package uebung_3_2;

public class uebung_3_2 {

	public static void main(String[] args) {
		
		double bestellwert = 1;
		double bisherigesKundenBestellvolumen =  2;
		boolean istPremiumKunde = true ;
		double rabatt;
		double rabatt2;
		
		// Mengenrabatt
		
		if (bestellwert >= 5000) {
			rabatt = 0.05; } else  {
			if (bestellwert >=200) {
				rabatt = 0.03; } else {
					if (bestellwert >= 500) {
						rabatt = 0.02; } else {
							if  (bestellwert >= 100) {
								rabatt = 0.01; } else {
							}
					}
			}
		}
		
		// Premiumkunden Doppel
		
		if (istPremiumKunde = true) {rabatt=rabatt*2; } else {};
		
		// Rabatt nach Bestellvolumen
		
		if (bisherigesKundenBestellvolumen >= 50000) {
			rabatt2 = 0.125; } else {
				if (bisherigesKundenBestellvolumen >= 10000) { rabatt2 = 0.075; } else {}
				
		}
		
		// Rabatt Eingrenzung
		if 
		
		
		System.out.println(rabatt);
		System.out.println(bestellwert);
		System.out.println(bestellwertrabatt);
		
}
}