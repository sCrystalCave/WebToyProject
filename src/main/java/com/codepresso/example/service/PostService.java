package com.codepresso.example.service;

import com.codepresso.example.dto.PostDto;
import org.springframework.stereotype.Service;
//서비스 패키지에 신규 클래스 생성
@Service
//스프링프레임워크가 컨트롤러, 레스트컨트롤러, 서비스 등 특정 어노테이션을 발견하면 해당 클래스의 객체를 알아서 생성한다.
//@Configuration 클래스의 @Bean 어노테이션을 만날때도 그러하다.
public class PostService {
    public PostDto getPost(Integer id){
        System.out.println("find post from database by " + id);
        System.out.println("validate data from database");
        System.out.println("process data if necessary");

        return new PostDto(id, "title", "this is content", "dhLee");
    }
}
