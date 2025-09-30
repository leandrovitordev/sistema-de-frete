package sistemafrete;

// Autonomo.java
public class Autonomo extends Entregador implements Fretavel { 

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        // Custo de um autônomo é distanciaEmKm * 0.95 
        return distanciaEmKm * 0.95;
    }
}
