package sistemafrete;

// Funcionario.java
public class Funcionario extends Entregador implements Fretavel { 

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        // Custo de um funcionário é fixo em R$ 5,00 por entrega 
        return 5.00;
    }
}
