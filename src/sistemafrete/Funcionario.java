package sistemafrete;

// Funcionario.java
public class Funcionario extends Entregador implements Fretavel { // [cite: 104, 106]

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        // Custo de um funcionário é fixo em R$ 5,00 por entrega [cite: 104]
        return 5.00;
    }
}