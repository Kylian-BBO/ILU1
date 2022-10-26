package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	protected int argent;
	
	public Humain(String nom, String boissonPref, int argent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoissonPref() {
		return boissonPref;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println('(' + nom + ") - " + texte);
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m�appelle " + nom 
					+ " et j�aime boire du " + boissonPref + '.');
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais "
					+ "pouvoir m'offrir " + bien + " � " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent +" sous en poche."
					+ " Je ne peux m�me pas m'offrir " + bien + " � "
					+ prix + " sous.");
		}
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
		if (argent<0) {
			argent = 0;
		}
	}

}
