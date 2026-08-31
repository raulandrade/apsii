
public class Moto extends Veiculo {
	public int cilindradas;
	
	public Moto(String modelo, int ano, int cilindradas) {
		super(modelo, ano);
		this.cilindradas = cilindradas;
	}

	@Override
	public String imprimeDetalhes() {
		return super.imprimeDetalhes() + "\nCilindradas: " + this.cilindradas;
	}
	
	

}
