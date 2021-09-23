package br.com.zup;

public class Fornecedor extends Pessoa{
    double ValorCredito;
    double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        ValorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return ValorCredito;
    }

    public void setValorCredito(double valorCredito) {
        ValorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        return getValorCredito() - valorDivida;
    }


}
