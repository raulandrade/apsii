public class Fita {
    public static final int NORMAL = 0;
    public static final int LANCAMENTO = 1;
    public static final int INFANTIL = 2;

    private final String titulo;
    private int codigoDePreco;

    public Fita(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigoDePreco() {
        return codigoDePreco;
    }

    public void setCodigoDePreco(int codPreco) {
        this.codigoDePreco = codPreco;
    }

    public double calcularValor(int dias) {
        double valor = 0;
        switch (codigoDePreco) {
            case NORMAL:
                valor += 2;
                if (dias > 2) valor += (dias - 2) * 1.5;
                break;
            case LANCAMENTO:
                valor += dias * 3;
                break;
            case INFANTIL:
                valor += 1.5;
                if (dias > 3) valor += (dias - 3) * 1.5;
                break;
        }
        return valor;
    }

    public int calcularPontos(int dias) {
        int pontos = 1;
        if (codigoDePreco == LANCAMENTO && dias > 1) {
            pontos++;
        }
        return pontos;
    }
}

//Usa constantes inteiras (0,1,2) → “code smell: type code”.
//Cliente agora só pede resultados e não a regra.
//A lógica de cálculo estava em Cliente, mas deveria estar aqui.