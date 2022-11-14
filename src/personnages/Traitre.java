package personnages;

public class Traitre extends Samourai {
	int niveauTraitrise = 0;
	
	public Traitre(String seigneur, String nom, String boissonPref, int argent) {
		super(seigneur, nom, boissonPref, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		System.out.println("Mais je suis un tra�tre et mon niveau de tra�trise est : " + niveauTraitrise 
				+ ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise<3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = argentCommercant*(2/10);
			
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			
			niveauTraitrise++;
			
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! " 
					+ "Donne-moi " + argentRanconner + " sous ou gare � toi !");
			
			commercant.parler("Tout de suite grand " + nom + '.');
		}
		else {
			parler("Mince je ne peux plus ran�onner personne sinon un samoura� risque de"
				+ "me d�masquer !");
		}
	}
}
