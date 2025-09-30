package sistemafrete;

// ServicoDeEntrega.java
import java.util.ArrayList;
import java.util.List;

public class ServicoDeEntrega {
    private List<Fretavel> componentesDoCusto; // 

    public ServicoDeEntrega() {
        this.componentesDoCusto = new ArrayList<>();
    }

    // Método auxiliar para adicionar componentes à lista
    public void adicionarFretavel(Fretavel item) {
        this.componentesDoCusto.add(item);
    }

    // Calcula o custo total para uma determinada distância 
    public double calcularCustoTotal(double distanciaEmKm) {
        double custoTotal = 0.0;
        for (Fretavel item : componentesDoCusto) {
            custoTotal += item.calcularCustoFrete(distanciaEmKm);
        }
        return custoTotal;
    }
}
