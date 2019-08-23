
//Definica triedy, v tomto subore sa pracuje iba s triedou NIE OBJEKTOM, vyrabas akoby formicku, kde potom odlejes Objekt
public class Auto {

	//Definovanie premennych, ake bude Auto mat na seba naviazane, mozu byt definovane uz aj s hodnotami, ale my hodnoty priradime az neskor
	//Klucove slovo "private" hovori o tom, ze s tou premennou sa bude manipulovat iba tu a priamo sa s nou bude dat robit iba v tejto triede
	private String farba;
	private int maxRychlost;
	private boolean funkcne;
	private String znackaAuta;
	
	//Konstruktor, ten sa zavola, ked sa odniekade bude vyzadovat vytvorenie objektu + pozaduje argument typu String, kde chce znacku auta
	public Auto(String znackaAuta) {
		//Tu si iba preradim argument do mojej premenej
		//Klucove slovo "this" odkazuje na tuto triedu, v ktorej akurat pracujes, musi sa udavat hlavne vtedy, ked ako tu, su dve premenne s rovnakymi nazvami
		this.znackaAuta = znackaAuta;
		
		//Priradujem mojim premennym hodnoty
		farba = "červená";
		maxRychlost = 80;
		funkcne = true;
		
	}
	
	//Teraz si tu mozem definovat hocijake funkcie/metody, ktore chcem aby trieda Auto malo
	public void zatrub() {
		System.out.println("Tutút");
	}
	
	public void vypisMaxRychlost() {
		System.out.println("Max rychlost: "+maxRychlost);
	}
	
	//Tieto metody sa nazyvaju gettre, normalne by sa malo napisat isFunkcne() alebo getFunkcne(), to akoby chces vytiahnut private hodnotu aj niekde mimo triedy
	public boolean vratCiJeFunkcne() {
		return this.funkcne;
	}

	
	//Klasicke gett-re/sett-re
	
	public String getFarba() {
		return farba;
	}

	public void setFarba(String farba) {
		this.farba = farba;
	}

	public String getZnackaAuta() {
		return znackaAuta;
	}

	public void setZnackaAuta(String znackaAuta) {
		this.znackaAuta = znackaAuta;
	}
	
}
