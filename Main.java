
//Hlavna trieda, tato sa nepretvori do objektu nikdy, lebo je hlavna
public class Main {
	
	//Tuto metodu Java vyhlada a spusti ako prvu z celeho programu
	public static void main(String[] args) {
		
		//Idem si vytvorit objekt auto, k tomu budem potrebovat formicku, ktoru na to auto pouzijem, preto pouzijem triedu Auto, ktora je pripravena na to, aby mi vytovorila objekt Auta
		Auto mojeAuticko = new Auto("Porsche"); //Klucove slovo "new" teraz spustilo konstruktor, ktory sa teraz zacal vykonavat + zadal som argument znacku auta, ktory po mne pozadoval
		//mojeAuticko je v tomto pripade uz OBJEKT, vsetko co pouzijem s mojeAuticko, uz pouzivam z OBJEKTU
		
		mojeAuticko.zatrub(); // vyuzil som funkciu auta - objektu mojeAuticko, ktore bolo vytovrene vo formicke triedy Auto
		mojeAuticko.vypisMaxRychlost();
		
		boolean funkcne = mojeAuticko.vratCiJeFunkcne();
		if(funkcne) {
			System.out.println("Juchú, ideme na výlet.");
		}else {
			System.out.println("Dnes sedime doma :(");
		}
		
	}
}
