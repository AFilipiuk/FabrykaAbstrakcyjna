class DyskDlaLaptopa implements Dysk {
	String name = "DyskDlaLaptopa";
	public Dysk dawajDysk(){
		System.out.println("Dodaje: " + name);
		return new DyskDlaLaptopa();
	}
}