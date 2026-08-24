
public class Principal {

	public static void main (String [] ags) {
		
		Veiculo v1 = new Veiculo("Corola", 2000);
		Carro c1 = new Carro("Corola", 2000, 4);
		Moto m1 = new Moto("Honda", 2000, 2);
		
		System.out.println(m1.imprimirDetalhes());
		
	}

}
