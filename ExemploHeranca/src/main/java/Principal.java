
public class Principal {

	public static void main(String[] args) {
		Carro carro = new Carro("Celta",2000, 4);
		Moto moto = new Moto("Honda", 2015, 180);
		
		System.out.println(carro.imprimeDetalhes());
		System.out.println(moto.imprimeDetalhes());


	}

}
