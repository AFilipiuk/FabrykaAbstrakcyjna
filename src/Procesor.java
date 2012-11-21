
interface Procesor {
	public Procesor dawajProcesor();
}

class ProcesorDlaPC implements Procesor {
	String name = "ProcesorDlaPC";
	public Procesor dawajProcesor(){
		System.out.println("Dodaje: " + name);
		return new ProcesorDlaPC();
	}
}

class ProcesorDlaLaptopa implements Procesor {
	String name = "ProcesorDlaLaptopa";
	public Procesor dawajProcesor(){
		System.out.println("Dodaje: " + name);
		return new ProcesorDlaLaptopa();
	}
}