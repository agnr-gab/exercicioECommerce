package dtos;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
    private List<ProdutoDto> listaProdutos = new ArrayList<>();

    public void cadastrarProduto(ProdutoDto produtoDto) {
        listaProdutos.add(produtoDto);
    }
}
