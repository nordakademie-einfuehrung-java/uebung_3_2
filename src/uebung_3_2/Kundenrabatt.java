package uebung_3_2;

public class Kundenrabatt
{
	public static void main(String[] args) 
	{
	double bestellwert = 2000;
	double bisherigesKundenBestellvolumen = 100;
	boolean istPremiumKunde = false;
	double Bestellh�henrabatt;
	double zusaetzlicherrabatt;
	double supersonderrabatt;
	double gesamterrabatt;
	double preis;
	
	
	if (bestellwert >= 5000)
	{
		Bestellh�henrabatt = 5;
	}
	
	else
	{
	if (bestellwert >= 2000)
	{
		Bestellh�henrabatt = 3;
	}
	else
	{
	if (bestellwert >= 500)
	{
		Bestellh�henrabatt = 2;
	}
	else
	{
	if (bestellwert >= 100)
	{
		Bestellh�henrabatt = 1;
	}
	else
	{
		Bestellh�henrabatt = 0;
	}
	}}}
		
	if (istPremiumKunde)	
	{
		Bestellh�henrabatt=Bestellh�henrabatt*2;
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
	
	gesamterrabatt = supersonderrabatt + zusaetzlicherrabatt + Bestellh�henrabatt;
	
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
	
	/*System.out.println(Bestellh�henrabatt);
	System.out.println(zusaetzlicherrabatt);
	System.out.println(supersonderrabatt);
	*/
	
	System.out.println("Der Rabatt betr�gt "+gesamterrabatt);
	System.out.println("Der Bestellwert betr�gt "+bestellwert);
	System.out.println("Der Preis betr�gt "+preis);
	
	
}
}
