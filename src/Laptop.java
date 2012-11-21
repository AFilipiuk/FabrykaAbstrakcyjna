class Laptop extends Komputer {
	FabrykaPodzespolowLaptop fabrykaPodzespolowLaptop;
	
	public Laptop(FabrykaPodzespolowLaptop fabrykaPodzespolowLaptop){
		this.fabrykaPodzespolowLaptop = fabrykaPodzespolowLaptop;
		skladanie();
	}
	
	public void skladanie(){
		dysk = fabrykaPodzespolowLaptop.produkujemyDysk().dawajDysk();
		grafika = fabrykaPodzespolowLaptop.produkujemyGrafike().dawajGrafike();
		procesor = fabrykaPodzespolowLaptop.produkujemyProcesor().dawajProcesor();
		ram = fabrykaPodzespolowLaptop.produkujemyRam().dawajRam();
		chlodzenie = fabrykaPodzespolowLaptop.produkujemyChlodzenie().dawajChlodzenie();
	}
}