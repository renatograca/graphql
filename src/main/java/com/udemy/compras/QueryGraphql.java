package com.udemy.compras;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QueryGraphql implements GraphQLQueryResolver {

    @Autowired
    private  ClienteRepository clienteRepository;
    public String hello() {
        return "Hello Graphql";
    }
    public int soma(int a, int b ) {
        return a + b ;
    }

    public Cliente cliente(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public List<Cliente> clientes() {
        return clienteRepository.findAll();
    }
}
