package dtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/leads")

public class LeadController {

    @Autowired
    private LeadService leadService;

    @PostMapping(HttpStatus.CREATED)
    public void cadastarLead(@RequestBody LeadDto leadDto) {
        leadService.cadastrarLead(leadDto);
    }
}