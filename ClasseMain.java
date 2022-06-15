import Configuração.Carro;

public class ClasseMain {

    public static void main(String[] args) {

        Carro carro = new Carro("Volkswagen", "Polo", "200 TSi", 5, 4, 16, 4, "9B550704M", 2020, "Flex", "3 cilindros 1.0 turbo");

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
