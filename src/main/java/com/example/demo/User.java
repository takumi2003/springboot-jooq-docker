package com.example.demo;


public class User {

    private Long id;

    private String name;

    // 【重要】JPAのためのデフォルトコンストラクタ（必須）
    public User() {
    }

    // アプリからデータを作る時に使うコンストラクタ
    // IDはDBが決めるので、引数には含めない
    public User(String name) {
        this.name = name;
    }

    // Getter / Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}