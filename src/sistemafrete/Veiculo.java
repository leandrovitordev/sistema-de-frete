package sistemafrete;

// Veiculo.java
public abstract class Veiculo { 
    private String placa;
    private int ano;

    // Construtor para inicializar os atributos
    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    // Getters para acessar os atributos, se necessário
    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }
}
