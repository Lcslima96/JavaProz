package atividade01;
public class Computador {
    private String marca;
    private String modelo;
    public String processador;
    private String memoriaRam;
    private String armazenamento;
    private String sistemaOperacional;
    private String tamanhoTela;
    private String resolucaoTela;
    private String peso;
    private double preco;
    public String ram;

    public Computador(String marca, String modelo, String processador, String memoriaRam, String armazenamento, String sistemaOperacional, String tamanhoTela, String resolucaoTela, String peso, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
        this.tamanhoTela = tamanhoTela;
        this.resolucaoTela = resolucaoTela;
        this.peso = peso;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public String getResolucaoTela() {
        return resolucaoTela;
    }

    public String getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }
}

