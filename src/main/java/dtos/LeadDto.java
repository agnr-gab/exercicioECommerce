package dtos;

import java.util.List;

public class LeadDto {
    private String email;
    private String nome;
    private String telefone;
    private List<ProdutoDto> listaProdutos;

    public LeadDto(String email, String nome, String telefone) {
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
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

    public List<ProdutoDto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<ProdutoDto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
