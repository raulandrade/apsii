package exemplo2;

public class Principal {

	public static void main(String[] args) {
		
		Banco b1 = new Banco("Raul", "000", 15);
		Banco b2 = new Banco();
		
		
		Banco b3 = new Banco("José", "0001", 5); // Criar
		System.out.println(b3.getNome()); // Imprimir nome
		b3.setNome("Joaquim"); // Atualizar nome
		System.out.println(b3.getNome()); // Imprimir n ome atualizado

	}

}
