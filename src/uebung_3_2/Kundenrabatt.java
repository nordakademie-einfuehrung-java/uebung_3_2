package uebung_3_2;

public class Kundenrabatt
{
	public static void main(String[] args) 
	{
	double bestellwert = 2000;
	double bisherigesKundenBestellvolumen = 100;
	boolean istPremiumKunde = false;
	double Bestellhöhenrabatt;
	double zusaetzlicherrabatt;
	double supersonderrabatt;
	double gesamterrabatt;
	double preis;
	
	
	if (bestellwert >= 5000)
	{
		Bestellhöhenrabatt = 5;
	}
	
	else
	{
	if (bestellwert >= 2000)
	{
		Bestellhöhenrabatt = 3;
	}
	else
	{
	if (bestellwert >= 500)
	{
		Bestellhöhenrabatt = 2;
	}
	else
	{
	if (bestellwert >= 100)
	{
		Bestellhöhenrabatt = 1;
	}
	else
	{
		Bestellhöhenrabatt = 0;
	}
	}}}
		
	if (istPremiumKunde)	
	{
		Bestellhöhenrabatt=Bestellhöhenrabatt*2;
	}
	else 
	{
		
	}
	
	
	
	if (bisherigesKundenBestellvolumen >= 10000)
	{
		zusaetzlicherrabatt = 7.5;
	}
	
	if (bisherigesKundenBestellvolumen >= 50000)
	{
		zusaetzlicherrabatt = 12.5;
	}
	
	else
	{
		zusaetzlicherrabatt = 0;
	}
	
	if (bestellwert >= 2*bisherigesKundenBestellvolumen)
	{
		supersonderrabatt = 3;
	}
	
	else
	{
		supersonderrabatt = 0;
	}
	
	gesamterrabatt = supersonderrabatt + zusaetzlicherrabatt + Bestellhöhenrabatt;
	
	if (istPremiumKunde)
	{
		if (gesamterrabatt > 20)
		{
			gesamterrabatt = 20;
		}
		
		else
		{
			
		}
	}
	
	else
	{
		if (gesamterrabatt > 15)
		{
			gesamterrabatt = 15;
		}
		
		else
		{
			
		}
	}
	
	preis = bestellwert - ((bestellwert/100)*gesamterrabatt);
	
	/*System.out.println(Bestellhöhenrabatt);
	System.out.println(zusaetzlicherrabatt);
	System.out.println(supersonderrabatt);
	*/
	
	System.out.println("Der Rabatt beträgt "+gesamterrabatt);
	System.out.println("Der Bestellwert beträgt "+bestellwert);
	System.out.println("Der Preis beträgt "+preis);
	
	
}
}
