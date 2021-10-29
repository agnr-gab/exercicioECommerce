package dtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leads")

public class LeadController {

    @Autowired
    private LeadService leadService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastarLead(@RequestBody LeadDto leadDto) {
        leadService.cadastrarLead(leadDto);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastrarProduto(@RequestBody ProdutoDto produtoDto) {
        leadService.cadastrarProduto(produtoDto);
    }




}