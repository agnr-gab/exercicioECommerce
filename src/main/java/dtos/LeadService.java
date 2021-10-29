package dtos;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
    private List<ProdutoDto> listaProdutos = new ArrayList<>();
    private List<LeadDto> listaLeads = new ArrayList<>();

    public void cadastrarProduto(ProdutoDto produtoDto) {
        listaProdutos.add(produtoDto);
    }

    public void cadastrarLead(LeadDto leadDto) {
        listaLeads.add(leadDto);
    }


}
