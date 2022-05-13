package com.skorolitniy.template;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
public class TemplateController {
    
    @GetMapping("/TemplateMethod")
    public Result GetTemplate(@RequestParam(name = "name",defaultValue = "pippo",required = false) String nome)
    {
        return new TemplateClass("bella");
    }

    @GetMapping("/TemplateMethod/{name}")
    public Result GetTemplate2(@PathVariable(name = "name") String nome)
    {
        return new TemplateClass(nome);
    }

    @GetMapping("/TemplateMethodHash")
    public Result GetTemplateHast()
    {
        templateHashMapping THM = new templateHashMapping();
        THM.putVector("nome", "Daniel");
        THM.putVector("Cognome", "Skorolitniy");
        return THM;
    }
}
