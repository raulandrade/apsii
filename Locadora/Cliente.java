import java.util.*;

public class Cliente {
    private final String nome;
    private final List<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        alugueis.add(aluguel);
    }

    public String extrato() {
        double valorTotal = 0;
        int pontosTotais = 0;
        StringBuilder resultado = new StringBuilder("Registro de Alugueis de " + getNome() + "\n");

        for (Aluguel aluguel : alugueis) {
            double valorCorrente = aluguel.calcularValor();
            int pontos = aluguel.calcularPontos();

            resultado.append("\t")
                     .append(aluguel.getFita().getTitulo())
                     .append("\t")
                     .append(valorCorrente)
                     .append("\n");

            valorTotal += valorCorrente;
            pontosTotais += pontos;
        }

        resultado.append("Valor total devido: ").append(valorTotal).append("\n");
        resultado.append("Você ganhou ").append(pontosTotais).append(" pontos de alugador frequente");
        return resultado.toString();
    }
}

//Metodo extrato faz calculo, e tudo de uma vez
//Quebra o Princípio da Responsabilidade Única:
// Cliente deveria só manter seus alugueis e delegar regras.
//Usei StringBuilder para eficiência.
//Código mais curto, mais claro e coeso.