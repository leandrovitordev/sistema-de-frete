package sistemafrete;

// Motocicleta.java
public class Motocicleta extends Veiculo implements Fretavel { 

    public Motocicleta(String placa, int ano) {
        super(placa, ano);
    }

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        // Custo do frete de uma Motocicleta é distanciaEmKm * 0.45 
        return distanciaEmKm * 0.45;
    }
}
