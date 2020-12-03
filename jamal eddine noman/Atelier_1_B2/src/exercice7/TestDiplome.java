package exercice7;

public class TestDiplome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diplome d1 = new Diplome("Technicien Spécialisé en Réseaux Informatiques","bien",2017);
		Diplome d2 = new Diplome();
		d2.setTitre("Technicien Spécialisé en Développement Informatiques");
		d2.setMention("trés bien");
		d2.setAnobtenu(2019);
		d1.infoDiplome();
		d2.infoDiplome();
	}

}
