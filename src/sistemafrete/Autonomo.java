package sistemafrete;

// Autonomo.java
public class Autonomo extends Entregador implements Fretavel { // [cite: 105, 106]

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        // Custo de um autônomo é distanciaEmKm * 0.95 [cite: 105]
        return distanciaEmKm * 0.95;
    }
}