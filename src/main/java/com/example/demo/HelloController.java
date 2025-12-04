package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*
 * コントローラーを定義するクラスである。
 * 
 * @RestControllerは、RESTfulなコントローラーを定義するためのアノテーションである。
 */
public class HelloController {

    /*
     * /helloのURLにアクセスがあった場合に、sayHello()メソッドを実行する。
     * 
     * @GetMappingは、HTTPのGETリクエストを処理するためのアノテーションである。
     */
    @GetMapping
    public String sayHello() {
        return "Hello, World!";
    }

}
