interface Grafika {
	public Grafika dawajGrafike();
}

class GrafikaDlaPC implements Grafika {
	String name = "GrafikaDlaPC";
	public Grafika dawajGrafike(){
		System.out.println("Dodaje: " + name);
		return new GrafikaDlaPC();
	}
}

class GrafikaDlaLaptopa implements Grafika {
	String name = "GrafikaDlaPC";
	public Grafika dawajGrafike(){
		System.out.println("Dodaje: " + name);
		return new GrafikaDlaPC();
	}
}