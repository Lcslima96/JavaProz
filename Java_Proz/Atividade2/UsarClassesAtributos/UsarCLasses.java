package UsarClassesAtributos;

import UsarClassesAtributos.Carro;
import UsarClassesAtributos.Computador;
import UsarClassesAtributos.Pessoa;

public class UsarCLasses {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = "Lucas";
        p.idade = 30;
        p.cpf = 987654321;
        p.rg = 123456789;
        p.renda = 3500.50f;
        p.cep = 87654321;
        p.telefone = "(11)987654321";
        p.email = "lucasmarques@example.com";
        p.matricula = 56789012;
        p.ra = "1234567890sp";

        System.out.println("Biografia:");
        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("CPF: " + p.cpf);
        System.out.println("RG: " + p.rg);
        System.out.println("Renda: " + p.renda);
        System.out.println("CEP: " + p.cep);
        System.out.println("Telefone: " + p.telefone);
        System.out.println("Email: " + p.email);
        System.out.println("Matrícula: " + p.matricula);
        System.out.println("RA: " + p.ra);
        System.out.println("--------------------------------------------------------------------");

        Computador c = new Computador();
        
        c.gabinete = "Corsair 4000D";
        c.fonte = "EVGA 600W 80plus Bronze";
        c.processador = "Intel Core i7-10700K";
        c.placamae = "ASUS ROG STRIX Z490-E";
        c.gpu = "NVIDIA RTX 3070";
        c.ram = "2x 16GB G.Skill";
        c.rom = "SSD 1TB Samsung 970 EVO";
        c.teclado = "Razer BlackWidow";
        c.mouse = "Razer DeathAdder";
        c.monitor = "Acer Predator 27 144Hz";

        System.out.println("Computador:");
        System.out.println("Gabinete: " + c.gabinete);
        System.out.println("Fonte: " + c.fonte);
        System.out.println("Processador: " + c.processador);
        System.out.println("Placa Mãe: " + c.placamae);
        System.out.println("GPU: " + c.gpu);
        System.out.println("Memória RAM: " + c.ram);
        System.out.println("Memória ROM: " + c.rom);
        System.out.println("Teclado: " + c.teclado);
        System.out.println("Mouse: " + c.mouse);
        System.out.println("Monitor: " + c.monitor);
        System.out.println("--------------------------------------------------------------------");

        Carro car = new Carro();
        car.marca = "Toyota";
        car.modelo = "Corolla";
        car.ano = 2021;
        car.cor = "Preto";
        car.km = 15000;
        car.preco = 100000.00f;
        car.placa = "ABC-1234";

        System.out.println("Carro:");
        System.out.println("Marca: " + car.marca);
        System.out.println("Modelo: " + car.modelo);
        System.out.println("Ano: " + car.ano);
        System.out.println("Cor: " + car.cor);
        System.out.println("Quilometragem: " + car.km);
        System.out.println("Preço: " + car.preco);
        System.out.println("Placa: " + car.placa);
        System.out.println("--------------------------------------------------------------------");
    }
}
