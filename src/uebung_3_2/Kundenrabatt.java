package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double bestellwert = 110000;
	double bisherigesKundenBestellvolumen = 50000;
	double rabattbw;
	double rabattbv;
	double rabattpk;
	double rabattbonus;
	boolean istPremiumKunde = false; 
	
		
	if (istPremiumKunde=true) {rabattpk = 2;} else {rabattpk = 1;}
	
	if (bestellwert>=5000) { rabattbw = 0.05; } else if (bestellwert>=2000) { rabattbw = 0.03; } 
	else if (bestellwert>=500) {rabattbw = 0.02; } else if (bestellwert>=100) {rabattbw = 0.01; } else {rabattbw = 0; }
	
	if (bisherigesKundenBestellvolumen>=50000) {rabattbv = 0.125; } else if (bisherigesKundenBestellvolumen>10000)
	{ rabattbv = 0.075; } else { rabattbv = 0; }
	
	if (bestellwert>=2*bisherigesKundenBestellvolumen) { rabattbonus = 0.03; } else { rabattbonus = 0; }
	
	double rabattgesamt = rabattbw*rabattpk+rabattbv+rabattbonus;
	
	if (rabattgesamt>0.2&&(istPremiumKunde=true)) { System.out.println("Ihr Rabatt beträgt 20%"); } 
	else { if (rabattgesamt>0.15&&(istPremiumKunde=false)) { System.out.println("Ihr Rabatt beträgt 15%"); }
	else { System.out.println("Ihr Rabatt beträgt " + rabattgesamt*100 + "%"); }}
	}
	
   }
