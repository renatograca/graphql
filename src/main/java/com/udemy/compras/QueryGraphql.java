package com.udemy.compras;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QueryGraphql implements GraphQLQueryResolver {

    public String hello() {
        return "Hello Graphql";
    }
    public int soma(int a, int b ) {
        return a + b ;
    }

    public Cliente cliente() {
        return new Cliente("Renato", "email");
    }

    public List<Cliente> clientes() {
        List<Cliente> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Cliente("cliente " +i, "r"+i+"@email.com"));
        }
                return list;
    }
}
