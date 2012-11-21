class ChlodzenieDlaLaptopa implements Chlodzenie{
	String name = "ChlodzenieDlaLaptopa";
	public Chlodzenie dawajChlodzenie(){
		System.out.println("Dodaje: " + name);
		return new ChlodzenieDlaLaptopa();
	}
}