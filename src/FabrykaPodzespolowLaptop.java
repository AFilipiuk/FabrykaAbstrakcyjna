class FabrykaPodzespolowLaptop implements FabrykaPodzespolowKomputerowych{
	public Dysk produkujemyDysk(){
		return new DyskDlaLaptopa();
	}
	
	public Grafika produkujemyGrafike(){
		return new GrafikaDlaLaptopa();
	}
	
	public Ram produkujemyRam(){
		return new DDR2();
	}
	
	public Procesor produkujemyProcesor(){
		return new ProcesorDlaLaptopa();
	}
	
	public Chlodzenie produkujemyChlodzenie(){
		return new ChlodzenieDlaLaptopa();
	}
}