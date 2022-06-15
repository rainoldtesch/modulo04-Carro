package Configuração;

public class Carro {

    private String montadora;
    private String nomeCarro;
    private String versaoCarro;
    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusosPneu;
    private String cor;
    private Integer numeroPortas;
    private String numeroChassi;
    private Integer anoFabricacao;
    private String combustivel;
    private String motor;

    public Carro(String novaMontadora, String novoNomeCarro, String novaVersaoCarro, Integer novaQuantidadePneus, Integer novaQuantidadeCalotas, Integer novaQuantidadeParafusosPneu, Integer novoNumeroPortas, String novoNumeroChassi, Integer novoAnoFabricacao, String novoCombustivel, String novoMotor) {
        this.montadora = novaMontadora;
        this.nomeCarro = novoNomeCarro;
        this.versaoCarro = novaVersaoCarro;
        this.quantidadePneus = novaQuantidadePneus;
        this.quantidadeCalotas = novaQuantidadeCalotas;
        this.quantidadeParafusosPneu = novaQuantidadeParafusosPneu;
        this.numeroPortas = novoNumeroPortas;
        this.numeroChassi = novoNumeroChassi;
        this.anoFabricacao = novoAnoFabricacao;
        this.combustivel = novoCombustivel;
        this.motor = novoMotor;
    }

    public String getMontadora() { return montadora; }

    public void setMontadora(String montadora) { this.montadora = montadora; }

    public String getNomeCarro() { return nomeCarro; }

    public void setNomeCarro(String nomeCarro) { this.nomeCarro = nomeCarro; }

    public String getVersaoCarro() { return versaoCarro; }

    public void setVersaoCarro(String versaoCarro) { this.versaoCarro = versaoCarro; }

    public void setQuantidadePneus(int quantidadePneus) { this.quantidadePneus = quantidadePneus; }

    public int getQuantidadePneus() {
        return quantidadePneus;
    }

    public void setQuantidadeCalotas(int quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeParafusosPneu(int quantidadeParafusosPneu) { this.quantidadeParafusosPneu = quantidadeParafusosPneu; }

    public Integer getQuantidadeParafusosPneu() {
        return quantidadeParafusosPneu;
    }

    public String getCor() { return cor; }

    public void setCor(String cor) { this.cor = cor; }

    public Integer getNumeroPortas() { return numeroPortas; }

    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

    public String getNumeroChassi() { return numeroChassi; }

    public void setNumeroChassi(String numeroChassi) { this.numeroChassi = numeroChassi; }

    public Integer getAnoFabricacao() { return anoFabricacao; }

    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }

    public String getCombustivel() { return combustivel; }

    public void setCombustivel(String combustivel) { this.combustivel = combustivel; }

    public String getMotor() { return motor; }

    public void setMotor(String motor) { this.motor = motor; }
}
