package dtos;

public class ProdutoDto {
    private String nomeProduto;
    private double valor;

    public ProdutoDto(String nomeProduto, double valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public ProdutoDto() {
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
