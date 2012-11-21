public class Factory {
	public static void main(String[]args){
		FabrykaKomputerow fabrykaKomputerow = new FabrykaKomputerow();
		System.out.println("PC");
		Komputer pc = fabrykaKomputerow.wydajKomputer("PC");
		System.out.println("\n\nLaptop");
		Komputer laptop = fabrykaKomputerow.wydajKomputer("Laptop");
	}
}
