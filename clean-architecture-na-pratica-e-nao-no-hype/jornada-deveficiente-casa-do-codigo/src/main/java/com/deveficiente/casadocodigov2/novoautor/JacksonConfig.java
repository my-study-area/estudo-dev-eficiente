package com.deveficiente.casadocodigov2.novoautor;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

    @Bean
    public SimpleModule dadosNovoAutorModule() {
        SimpleModule module = new SimpleModule();
        module.addAbstractTypeMapping(DadosNovoAutor.class, NovoAutorRequest.class);
        return module;
    }
}
