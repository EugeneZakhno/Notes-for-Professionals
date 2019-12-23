package com.stackoverflow.documentation;

import org.springframework.stereotype.Component;

@Component
public class BeanDeclaredByAnnotation {
    public void sayHello() {
        System.out.println("Hello, World from BeanDeclaredByAnnotation !");
    }
}