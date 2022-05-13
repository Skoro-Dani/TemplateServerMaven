package com.skorolitniy.template;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;

public class TemplateClass extends Result{
    private String nome;

    public TemplateClass(String nome) {
        this.nome = nome;
        status = true;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
