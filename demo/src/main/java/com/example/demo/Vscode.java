package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Vscode implements Ide {

    public void code(){
        System.out.println("use vs code");
    }
}
