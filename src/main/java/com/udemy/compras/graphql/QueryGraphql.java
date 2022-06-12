package com.udemy.compras.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphql implements GraphQLQueryResolver {

    public String hello() {
        return "Hello Graphql";
    }
    public int soma(int a, int b ) {
        return a + b ;
    }
}
