package sistemafrete;

// Carro.java
public class Carro extends Veiculo implements Fretavel { // [cite: 98, 101]

    public Carro(String placa, int ano) {
        super(placa, ano);
    }

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        // Custo do frete de um Carro é distanciaEmKm * 1.25 [cite: 99]
        return distanciaEmKm * 1.25;
    }
}