
public class Carro extends Veiculo{
	public int numPortas;
	
	public Carro(String modelo, int ano, int numPortas) {
		super(modelo, ano);
		this.numPortas = numPortas;
	}

	@Override
	public String imprimirDetalhes() {
		return super.imprimirDetalhes() + "\nNúmero de portas: " + this.numPortas;
	}

	@Override
	public String acelerar() {
		return "Carro acelerando";
	}
	
	

}
