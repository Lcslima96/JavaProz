package atividade01;
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String tipoCombustivel;
    private int potencia;
    private int numPortas;
    private double preco;
    private int quilometragem;
    private String numChassi;

    public Carro(String marca, String modelo, int ano, String cor, String tipoCombustivel, int potencia, int numPortas, double preco, int quilometragem, String numChassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.potencia = potencia;
        this.numPortas = numPortas;
        this.preco = preco;
        this.quilometragem = quilometragem;
        this.numChassi = numChassi;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public String getNumChassi() {
        return numChassi;
    }
}
