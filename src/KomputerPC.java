class KomputerPC extends Komputer {
	FabrykaPodzespolowKomputerowych fabrykaPodzespolowKomputerowych;
	
	public KomputerPC(FabrykaPodzespolowKomputerowych f){
		fabrykaPodzespolowKomputerowych = f;
		skladanie();
	}
	
	public void skladanie(){
		dysk = fabrykaPodzespolowKomputerowych.produkujemyDysk().dawajDysk();
		grafika = fabrykaPodzespolowKomputerowych.produkujemyGrafike().dawajGrafike();
		procesor = fabrykaPodzespolowKomputerowych.produkujemyProcesor().dawajProcesor();
		ram = fabrykaPodzespolowKomputerowych.produkujemyRam().dawajRam();
	}
}