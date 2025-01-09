package com.spring_graphql.record;

import org.springframework.graphql.data.method.annotation.SchemaMapping;


public record Product(String name,String category,String stock,String rating) {
}
