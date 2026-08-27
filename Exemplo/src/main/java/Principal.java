
public class Principal {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Corola", 2018);		
		Carro c1 = new Carro("Camaro", 2018,2);
		Pista p = new Pista();
		
		

		System.out.println(p.iniciarCorrida(v1));
		System.out.println(p.iniciarCorrida(c1));


	}

}
