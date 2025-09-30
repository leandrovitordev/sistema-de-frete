package sistemafrete;

// Carro.java
public class Carro extends Veiculo implements Fretavel { 

    public Carro(String placa, int ano) {
        super(placa, ano);
    }

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        // Custo do frete de um Carro é distanciaEmKm * 1.25 
        return distanciaEmKm * 1.25;
    }
}
