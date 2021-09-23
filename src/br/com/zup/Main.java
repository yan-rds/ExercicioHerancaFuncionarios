package br.com.zup;

public class Main {

    public static void main(String[] args) {
	Fornecedor teste = new Fornecedor("teste", "rua", "1234", 900, 200);
	Colaborador teste2 = new Colaborador("teste2", "apartamento", "6789", 20, 900, 200);
	Administrador teste3 = new Administrador("teste3", "casa", "666", 13, 900, 200, 50);

        System.out.println(teste.obterSaldo());
        System.out.println(teste2.calcularSalario());
        System.out.println(teste3.calcularSalario());
    }
}
