import java.util.Scanner; //1

public class Principal {

	public static void main(String[] args) {
	Veiculo carro = new Carro();
	Veiculo moto = new Moto();
	
	Pista pista = new Pista();
	
	Scanner scanner = new Scanner(System.in); //2
	
	String nome = scanner.nextLine(); //3
	
	System.out.println(nome);
	
	System.out.println(pista.iniciarCorrida(carro));
	System.out.println(pista.iniciarCorrida(moto));



	}

}
