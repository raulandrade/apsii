public class Locadora {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Raul");

        cliente.adicionaAluguel(new Aluguel(new Fita("Matrix", Fita.NORMAL), 3));
        cliente.adicionaAluguel(new Aluguel(new Fita("Toy Story", Fita.INFANTIL), 4));
        cliente.adicionaAluguel(new Aluguel(new Fita("Oppenheimer", Fita.LANCAMENTO), 2));

        System.out.println(cliente.extrato());
    }
}

