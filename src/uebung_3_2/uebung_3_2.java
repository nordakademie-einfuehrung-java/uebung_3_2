package uebung_3_2;

public class uebung_3_2 {

	public static void main(String[] args) {
		
		double bestellwert = 10000;
		double bisherigesKundenBestellvolumen =  0;
		boolean istPremiumKunde = false ;
		double rabatt = 0; 
		
		
		// Mengenrabatt
		
		if (bestellwert >= 5000) {
			rabatt = 0.05; } else if (bestellwert >=200) {
				rabatt = 0.03; } else if (bestellwert >= 500) {
						rabatt = 0.02; } else if (bestellwert >= 100) {
								rabatt = 0.01; } 
						
		
		
		// Premiumkunden Doppel
		
		if (istPremiumKunde) {rabatt=rabatt*2; }
		
		// Rabatt nach Bestellvolumen
		
		if (bisherigesKundenBestellvolumen >= 50000) {
			rabatt = rabatt + 0.125; } 
		else if (bisherigesKundenBestellvolumen >= 10000) { rabatt = rabatt + 0.075; }
				
		if (bestellwert >= ( 2* bisherigesKundenBestellvolumen)) { rabatt = rabatt + 0.03; }
		
		// Rabatt Eingrenzung
	
		if (istPremiumKunde && (rabatt > 0.2)) { rabatt = 0.20;}
		if ((!istPremiumKunde) && (rabatt > 0.15)) { rabatt = 0.15;}
		
		
		double rabattInProzent = rabatt * 100;
		
		System.out.println(rabattInProzent);
		System.out.println(bestellwert);
		
	
	}		
}
