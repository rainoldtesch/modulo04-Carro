import Configuração.Carro;

public class ClasseMain {

    public static void main(String[] args) {

        Carro carro = new Carro(novaMontadora: "Volkswagen", novoNomeCarro: "Polo", novaVersaoCarro: "200 TSi", novaQuantidadePneus: 5, novaQuantidadeCalotas: 4, novaQuantidadeParafusosPneus: 16, novoNumeroPortas: 4, novoNumeroChassi: "9B550704M", novoAnoFabricacao: 2020, novoCombustivel: "Flex", novoMotor: "3 cilindros 1.0 turbo");

        System.out.println( carro.getMontadora() + " " + carro.getNomeCarro() + " " + carro.getVersaoCarro());
        System.out.println(" Motor do carro = " + carro.getMotor());
        System.out.println(" Quantidade de pneus por carro = " + carro.getQuantidadePneus());
        System.out.println(" Quantidade de calotas por carro = " + carro.getQuantidadeCalotas());
        System.out.println(" Quantidade de parafusos por roda = " + carro.getQuantidadeParafusosPneu());
        //System.out.println(" Cor do carro = " + carro.getCor());
        System.out.println(" Quantidade de portas do carro = " + carro.getNumeroPortas());
        System.out.println(" Número do chassi do carro = " + carro.getNumeroChassi());
        System.out.println(" Ano de fabricação do carro = " + carro.getAnoFabricacao());
        System.out.println(" Combustível do carro = " + carro.getCombustivel());
    }
}
