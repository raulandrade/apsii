public class Aluguel {
    private final int diasAlugados;
    private final Fita fita;

    public Aluguel(Fita fita, int diasAlugados) {
        this.fita = fita;
        this.diasAlugados = diasAlugados;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugados() {
        return diasAlugados;
    }

    public double calcularValor() {
        return fita.calcularValor(diasAlugados);
    }

    public int calcularPontos() {
        return fita.calcularPontos(diasAlugados);
    }
}

//Falta de imutabilidade → os atributos podem mudar,
// mas um aluguel não deveria mudar depois de criado.

//Não encapsula nenhuma regra (só guarda dados).