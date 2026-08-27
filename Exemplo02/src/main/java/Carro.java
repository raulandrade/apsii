
public class Carro extends Veiculo {

	public int numPortas;
	
	public Carro(String modelo, int ano, int numPortas) {
		super(modelo, ano);
		this.numPortas = numPortas;
	}

	@Override
	public String imprimeDetalhes() {
		return super.imprimeDetalhes() + "\nNúmero de portas: " + this.numPortas;
	}
	

}
