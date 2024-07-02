package Exercicio_data;

public class data {
    int dia;
    int mes;
    static int ano;

    public data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public static void main(String[] args) {
        data d1 = new data(2, 07, 2024);
        data d2 = new data(ano, ano, ano); // Data vazia

        System.out.println("Data d1: " + d1.dia + "/" + d1.mes + "/" + d1.ano);
        System.out.println("Data d2: " + d2.dia + "/" + d2.mes + "/" + d2.ano);
    }
}
