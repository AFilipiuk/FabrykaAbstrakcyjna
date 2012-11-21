class FabrykaPodzespolowPC implements FabrykaPodzespolowKomputerowych {
	public Dysk produkujemyDysk(){
		return new DyskDlaPC();
	}
	
	public Grafika produkujemyGrafike(){
		return new GrafikaDlaPC();
	}
	
	public Ram produkujemyRam(){
		return new DDR3();
	}
	
	public Procesor produkujemyProcesor(){
		return new ProcesorDlaPC();
	}
	
	public Chlodzenie produkujemyChlodzenie(){
		return null;
	}
}
