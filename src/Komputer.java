abstract class Komputer {
	Dysk dysk;
	Grafika grafika;
	Ram ram;
	Procesor procesor;
	Chlodzenie chlodzenie;
	
	public abstract void skladanie();
	
	public void instalowanieOprogramowania(){
		System.out.println("Instaluje oprogramowanie...");
	}
	
	public void pakowanie(){
		System.out.println("Pakuje sprzet...");
	}
	public void sprzedawanie(){
		System.out.println("Sprzedaje sprzet...");
	}
}
