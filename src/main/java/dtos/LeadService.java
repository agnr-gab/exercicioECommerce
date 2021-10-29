package dtos;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadService {
    private static List<ProdutoDto> listaProdutos = new ArrayList<>();
    private static List<LeadDto> listaLeads = new ArrayList<>();

    public void cadastrarProduto(ProdutoDto produtoDto) {
        listaProdutos.add(produtoDto);
    }

    public void cadastrarLead(LeadDto leadDto) {
        listaLeads.add(leadDto);
    }

    public static void verificarEmail(String email) {
        for (LeadDto referencia : listaLeads) {
            if (referencia.getEmail().equalsIgnoreCase(email)) {
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY,
                        "Esse email já foi cadastrado! Tente novamente!");
            }
        }

    }


}
