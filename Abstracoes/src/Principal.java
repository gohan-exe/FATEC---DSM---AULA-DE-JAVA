
public class Principal {

	public static void main(String[] args) {
		Computador pc1 = new Computador();
		
		pc1.proc = "i9";
		pc1.mem = "16GB";
		pc1.ssd = "1TB";
		
		Computador pc2 = new Computador();
		pc2.proc = "Celeron";
		pc2.mem = "2GB";
		pc2.ssd = "128GB";
		
		pc1.ligar();
		System.out.println(pc2.desligar());
		System.out.println(pc1.proc + " x " + pc2.proc);

	}

}
