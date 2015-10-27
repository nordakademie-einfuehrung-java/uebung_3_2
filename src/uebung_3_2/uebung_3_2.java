package uebung_3_2;

public class uebung_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * - Schreiben Sie ein Programm, welches einen Kundenrabatt für eine Bestellung ermittelt. Als Ausgangswerte nehmen Sie:
  - Zwei ```double```-Variablen namens ```bestellwert``` und ```bisherigesKundenBestellvolumen``` 
  - sowie eine ```boolean``` Variable ```istPremiumKunde```.
- Der Rabatt soll in Prozent gemäß der Rabattstaffeln (siehe unten) ermittelt und ausgegeben werden.
- Außerdem soll der Bestellwert vor und nach Rabattierung ausgegeben werden.
- Der Einfachheit halber ignorieren wir mögliche Rundungsfehler bei ```double```-Variablen.

- Teilrabatte addieren sich und werden erst am Ende auf den Bestellwert angewendet.
 */
		
double bestellwert = 3000;
double bisherigesKundenBestellvolumen = 1;
double mengenrabatt = 0;
double bestellvolumenrabatt = 0;
double bestellwertrabatt = 0;
boolean istPremiumKunde = false;


/*Ab einer Bestellhoehe von 
		100 gibt es 1% Mengenrabatt, 
		ab 500 2%, 
		ab 2000 3%, 
		ab 5000 5%. 
		Bei Premiumkunden gibt es hier doppel so viel.*/


if(bestellwert > 5000) {
mengenrabatt = 0.05;

} else if(bestellwert >= 2000) {
mengenrabatt = 0.03;	

} else if(bestellwert >= 500) {
mengenrabatt = 0.02;	

} else if(bestellwert >= 100) {
mengenrabatt = 0.01;	
} 	

	
if (istPremiumKunde)
{ mengenrabatt = mengenrabatt* 2;}

/* Liegt das bisherige Bestellvolumen des Kunden 
 * über 10000, so erhält dieser zusätzlich 7,5%, 
 * ab 50000 12,5% Treuerabatt. */

if (bisherigesKundenBestellvolumen >= 10000 && bisherigesKundenBestellvolumen < 50000) 
{
bestellvolumenrabatt = 0.075;		
}
if (bisherigesKundenBestellvolumen > 50000) 
{
bestellvolumenrabatt = 0.125;		
}

/* Ist die aktuelle Bestellung doppelt so hoch wie das gesamte bisherige Bestellvolumen, 
 * so gibt es weitere 3% Bonus-Rabatt. */
if (bestellwert >= 2*bisherigesKundenBestellvolumen)
{
bestellwertrabatt = 0.03;	
}
/*- Entsteht ein Rabatt von mehr als 15%, so wird er wieder auf 
15% gekürzt - 
 * außer bei Premiumkunden, dort liegt die Grenze bei 20%./*
 */
double Gesamtrabatt = mengenrabatt + bestellvolumenrabatt + bestellwertrabatt;

if (Gesamtrabatt > 15 && !istPremiumKunde) {
Gesamtrabatt = 0.15;	
} 
if (Gesamtrabatt > 20 && istPremiumKunde) {
Gesamtrabatt = 0.20;	
} 




double Endbestellwert = bestellwert - bestellwert * Gesamtrabatt;

System.out.println("Bestellwert vor Rabatt =" + bestellwert);
System.out.println("Bestellwert nach Rabatt =" + Endbestellwert);
System.out.println("Rabatt = " + Gesamtrabatt );
	}

}
