package uebung_3_2;

public class uebung_3_2 {

	public static void main(String[] args) {
	double bestellwert = 5000;
	double bisherigesKundenBestellvolumen = 200000;
	double rabatt = 0;
	boolean istPremiumKunde = true;
	
	//Bestellwertkontrolle
	if (bestellwert >= 100 && bestellwert < 500) 
        {rabatt = 0.01;}
	else { if(bestellwert >= 500 && bestellwert < 2000)
    	{rabatt = 0.02;}
    else { if(bestellwert >= 2000 && bestellwert < 5000)
    	{rabatt = 0.03;}
    else { if(bestellwert >= 5000)
    	{rabatt = 0.05;}
    else {rabatt = 0;}}}}
    
	//PremiumKunde
	if (istPremiumKunde == true)
		rabatt = rabatt*2;
	
	//BisherigesBestellvolumenkontrolle
	if (bisherigesKundenBestellvolumen >= 10000)
		rabatt = rabatt+0.075;
	else if (bisherigesKundenBestellvolumen >= 50000)
		rabatt = rabatt+0.125;
	
	//Doppelt
	if (bestellwert >= 2*bisherigesKundenBestellvolumen)
	{rabatt = rabatt+0.03;}
	
	//MaxRabatt
	if (rabatt > 0.15)
	{rabatt = 0.15;}
	
	//Ausgabe
	double nachabzug = bestellwert-(bestellwert*rabatt);
			
	System.out.println("Bestellwert vor der Rabattierung = "+ bestellwert+"€");
	System.out.println("Rabatt = "+ rabatt*100 + "%");
	System.out.println("Bestellwert abzüglich des Rabattes = "+ nachabzug+"€");
	}
}

