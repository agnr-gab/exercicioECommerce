package dtos;

public class LeadDto {
    private String email;
    private String nome;
    private String telefone;
    private ProdutoDto produtoDto;

    public LeadDto(String email, String nome, String telefone, ProdutoDto produtoDto) {
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.produtoDto = produtoDto;
    }

    public LeadDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ProdutoDto getProdutoDto() {
        return produtoDto;
    }

    public void setProdutoDto(ProdutoDto produtoDto) {
        this.produtoDto = produtoDto;
    }
}
