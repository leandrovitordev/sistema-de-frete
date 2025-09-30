package sistemafrete;

// Main.java
public class Main {
    public static void main(String[] args) {

        // Simulação 1: Entrega de 10km com Funcionário e Carro 
        System.out.println("--- Simulação 1 ---");
        ServicoDeEntrega servico1 = new ServicoDeEntrega(); 
        
        // Cria as instâncias
        Carro carro1 = new Carro("ABC-1234", 2022);
        Funcionario funcionario1 = new Funcionario();

        // Adiciona os componentes do custo ao serviço 
        servico1.adicionarFretavel(carro1);
        servico1.adicionarFretavel(funcionario1);

        // Calcula e exibe o custo total para 10km
        double custoTotal1 = servico1.calcularCustoTotal(10.0);
        System.out.printf("Custo total da entrega de 10km: R$ %.2f\n", custoTotal1);
        System.out.println("(Carro: R$12.50 + Funcionário: R$5.00)");

        System.out.println(); // Linha em branco para separar

        // Simulação 2: Entrega de 25km com Autônomo e Motocicleta 
        System.out.println("--- Simulação 2 ---");
        ServicoDeEntrega servico2 = new ServicoDeEntrega();

        // Cria as instâncias
        Motocicleta moto1 = new Motocicleta("XYZ-5678", 2023);
        Autonomo autonomo1 = new Autonomo();

        // Adiciona os componentes do custo ao serviço
        servico2.adicionarFretavel(moto1);
        servico2.adicionarFretavel(autonomo1);
        
        // Calcula e exibe o custo total para 25km 
        double custoTotal2 = servico2.calcularCustoTotal(25.0);
        System.out.printf("Custo total da entrega de 25km: R$ %.2f\n", custoTotal2);
        System.out.println("(Motocicleta: R$11.25 + Autônomo: R$23.75)");
    }
}
