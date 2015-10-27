package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {
		double bestellwert = 20000 ;
		double bisherigesKundenBestellvolumen = 10000 ;
		boolean istpremiumKunde = true ;
		double rabatt = 0 ;
		
		//Bestellung Kontrolle
		if (bestellwert < 100)
			{rabatt = 0;}
		else {if (bestellwert < 500)
			{rabatt = 1;}
		else {if (bestellwert < 2000)
		{rabatt = 2;}
		else {if (bestellwert < 5000)
			{rabatt = 3;}
		else {if (bestellwert >= 5000)
			{rabatt = 5;}
		else {rabatt = 0;}}}}
		
		//Premiumkunde
		if (istpremiumKunde == true)
		{rabatt = rabatt*2;}
		
		//Treuerabatt
		if (bisherigesKundenBestellvolumen >= 10000 && bisherigesKundenBestellvolumen < 50000)
			{rabatt = rabatt + 7.5;}
		else {if (bisherigesKundenBestellvolumen >= 50000)
			{rabatt = rabatt + 12.5;}}
		
		//Zusatzrabatt
		if (bestellwert >= 2*bisherigesKundenBestellvolumen)
			{rabatt = rabatt + 3;}
		
		//Begrenzung des Rabatts
		if (rabatt > 15 && istpremiumKunde == false)
		{rabatt = 15;}
		else {if (istpremiumKunde == true && rabatt > 20)
		{rabatt = 20;}}
		
		//Berechnung des gesamtbestellwertes nach Rabatt
		double loesung = bestellwert * (1-(rabatt*1/100)) ;
		
		
		System.out.println("Der Bestellwert betr�gt " + bestellwert + " Euro.");
		System.out.println("Das bisherige Bestellvolumen betr�gt " + bisherigesKundenBestellvolumen + " Euro.");
		System.out.println("Der Rabatt betr�gt " + rabatt + " %.");
		System.out.println("Bestellwert nach der Rabattierung = " + loesung + " Euro.");
		
		
		}
		
		
		/* - Schreiben Sie ein Programm, welches einen Kundenrabatt für eine Bestellung ermittelt. Als Ausgangswerte nehmen Sie:
		  - Zwei ```double```-Variablen namens ```bestellwert``` und ```bisherigesKundenBestellvolumen```
		  - sowie eine ```boolean``` Variable ```istPremiumKunde```.
		- Der Rabatt soll in Prozent gemäß der Rabattstaffeln (siehe unten) ermittelt und ausgegeben werden.
		- Außerdem soll der Bestellwert vor und nach Rabattierung ausgegeben werden.
		- Der Einfachheit halber ignorieren wir mögliche Rundungsfehler bei ```double```-Variablen.

		## Rabattstaffeln

		- Ab einer Bestellhöhe von 100 gibt es 1% Mengenrabatt, ab 500 2%, ab 2000 3%, ab 5000 5%. Bei Premiumkunden gibt es hier doppel so viel.
		- Liegt das bisherige Bestellvolumen des Kunden über 10000, so erhält dieser zusätzlich 7,5%, ab 50000 12,5% Treuerabatt.
		- Ist die aktuelle Bestellung doppelt so hoch wie das gesamte bisherige Bestellvolumen, so gibt es weitere 3% Bonus-Rabatt.
		- Entsteht ein Rabatt von mehr als 15%, so wird er wieder auf 15% gekürzt - außer bei Premiumkunden, dort liegt die Grenze bei 20%.
		- Teilrabatte addieren sich und werden erst am Ende auf den Bestellwert angewendet.
*/
	}

}
