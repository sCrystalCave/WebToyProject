package com.codepresso.example.dto;

//클라이언트가 데이터를 보내서 서버가 받을 때 사용
public class PostDto {

    //?자바에서 멤버변수?
    // 멤버변수 : 클래스변수(static, 공통 속성), 인스턴스변수(개별 속성 객체)
    Integer id;
    String title;
    String content;
    String username;

    public PostDto(Integer id, String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }
}
