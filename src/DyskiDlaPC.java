class DyskDlaPC implements Dysk {
	String name = "DyskDlaPC";
	public Dysk dawajDysk(){
		System.out.println("Dodaje: " + name);
		return new DyskDlaPC();
	}
}