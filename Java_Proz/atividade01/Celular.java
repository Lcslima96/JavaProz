package atividade01;
public class Celular {
    private String marca;
    private String modelo;
    private String sistemaOperacional;
    private String memoriaRam;
    private String armazenamentoInterno;
    private String tamanhoTela;
    private String resolucaoTela;
    private String capacidadeBateria;
    private String cameraPrincipal;
    private double preco;

    public Celular(String marca, String modelo, String sistemaOperacional, String memoriaRam, String armazenamentoInterno, String tamanhoTela, String resolucaoTela, String capacidadeBateria, String cameraPrincipal, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.memoriaRam = memoriaRam;
        this.armazenamentoInterno = armazenamentoInterno;
        this.tamanhoTela = tamanhoTela;
        this.resolucaoTela = resolucaoTela;
        this.capacidadeBateria = capacidadeBateria;
        this.cameraPrincipal = cameraPrincipal;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public String getArmazenamentoInterno() {
        return armazenamentoInterno;
    }

    public String getTamanhoTela() {
        return tamanhoTela;
    }

    public String getResolucaoTela() {
        return resolucaoTela;
    }

    public String getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public String getCameraPrincipal() {
        return cameraPrincipal;
    }

    public double getPreco() {
        return preco;
    }
}

