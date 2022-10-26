package personnages;

public class Yakuza extends Humain {
	String clan;
	int reputation = 0;
	
	public Yakuza(String nom, String boissonPref, int argent, String clan) {
		super(nom, boissonPref, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		String nomVictime = victime.getNom() ;
		
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe "
				+ "par l� ?");
		parler(nomVictime + ", si tu tiens � la vie donne moi ta bourse !");
		
		int gain = victime.seFaireExtorquer();
		argent += gain;
		
		parler("J�ai piqu� les " + gain + " sous de " + nomVictime + ", ce qui "
				+ "me fait 45 sous dans ma poche. Hi ! Hi !");
		
		reputation += 1;
	}
}