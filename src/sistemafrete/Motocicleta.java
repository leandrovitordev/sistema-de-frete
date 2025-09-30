package sistemafrete;

// Motocicleta.java
public class Motocicleta extends Veiculo implements Fretavel { // [cite: 98, 101]

    public Motocicleta(String placa, int ano) {
        super(placa, ano);
    }

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        // Custo do frete de uma Motocicleta é distanciaEmKm * 0.45 [cite: 100]
        return distanciaEmKm * 0.45;
    }
}