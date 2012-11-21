interface Ram {
	public Ram dawajRam();
}

class DDR3 implements Ram {
	String name = "DDR3";
	public Ram dawajRam(){
		System.out.println("Dodaje: " + name);
		return new DDR3();
	}
}

class DDR2 implements Ram {
	String name = "DDR2";
	public Ram dawajRam(){
		System.out.println("Dodaje: " + name);
		return new DDR2();
	}
}