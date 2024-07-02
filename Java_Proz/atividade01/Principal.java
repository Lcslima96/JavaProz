package atividade01;
public class Principal {
    private Carro carro;
    private Computador computador;
    private Celular celular;

    public Principal() {
        //carro 
        this.carro = new Carro("Toyota", "Corolla", 2022, "Branco", "Gasolina", 168, 4, 120000, 5000, "ABC123456789");
       //computador
        this.computador = new Computador("Dell", "XPS 15", "Intel Core i7", "16GB", "1TB SSD", "Windows 11", "15.6 polegadas", "1920x1080", "1.8kg", 10000);
        //celular
        this.celular = new Celular("Samsung", "Galaxy S21", "Android", "8GB", "128GB", "6.2 polegadas", "2400x1080", "4000mAh", "64MP", 5000);
    }

    public void imprimirAtributos() {
        System.out.println("Atributos do Carro:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Tipo de Combustível: " + carro.getTipoCombustivel());
        System.out.println("Potência: " + carro.getPotencia());
        System.out.println("Número de Portas: " + carro.getNumPortas());
        System.out.println("Preço: " + carro.getPreco());
        System.out.println("Quilometragem: " + carro.getQuilometragem());
        System.out.println("Número de Chassi: " + carro.getNumChassi());

        System.out.println("\nAtributos do Computador:");
        System.out.println("Marca: " + computador.getMarca());
        System.out.println("Modelo: " + computador.getModelo());
        System.out.println("Processador: " + computador.getProcessador());
        System.out.println("Memória RAM: " + computador.getMemoriaRam());
        System.out.println("Armazenamento: " + computador.getArmazenamento());
        System.out.println("Sistema Operacional: " + computador.getSistemaOperacional());
        System.out.println("Tamanho da Tela: " + computador.getTamanhoTela());
        System.out.println("Resolução da Tela: " + computador.getResolucaoTela());
        System.out.println("Peso: " + computador.getPeso());
        System.out.println("Preço: " + computador.getPreco());

        System.out.println("\nAtributos do Celular:");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Sistema Operacional: " + celular.getSistemaOperacional());
        System.out.println("Memória RAM: " + celular.getMemoriaRam());
        System.out.println("Armazenamento Interno: " + celular.getArmazenamentoInterno());
        System.out.println("Tamanho da Tela: " + celular.getTamanhoTela());
        System.out.println("Resolução da Tela: " + celular.getResolucaoTela());
        System.out.println("Capacidade da Bateria: " + celular.getCapacidadeBateria());
        System.out.println("Câmera Principal: " + celular.getCameraPrincipal());
        System.out.println("Preço: " + celular.getPreco());
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.imprimirAtributos();
    }
}
