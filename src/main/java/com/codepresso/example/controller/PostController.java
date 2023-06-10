package com.codepresso.example.controller;

import com.codepresso.example.dto.PostDto;
import com.codepresso.example.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
//동일한 URI 에 메소드에 따라 다른 동작을 하게 할 수 있다.
@RequestMapping(value="/post")
public class PostController {

//    //다른 클래스 기능을 사용하기 위해서 new로 객체를 생성함.
//    //의존성이 컴파일 타임에 명시됨.
//    public PostService postService = new PostService(); //객체 생성
//
//    @GetMapping
//    //@RequestMapping(method= RequestMethod.GET)
//    public PostDto getPost(@RequestParam Integer id){
//        //PostService형 객체의 메소드를 실행하는데, 입력 id를 활용함.
//        //컨트롤러에서 서비스 활용. PostController에서 PostService를 사용하도록 함.
//        //컨트롤러가 서비스에 의존한다.
//        PostDto result = postService.getPost(id);
//        return result;
//    }

    //의존성 주입(DI) : 객체 생성을 외부에서 대신 수행한다. 의존성 설정을 외부에서 대신 해준다.
    //활용할 클래스 타입의 필드만 선언. 객체를 직접 생성하지 않음. new를 쓰지 않는다.
    public PostService postService; //지금 이 코드를 둘러싼 클래스의 멤버변수가 된다.
    //지금 이 코드를 둘러싼 클래스의 생성자를 구현한다. 방금 정의한 멤버변수를 매개변수로 한다.
    public PostController(PostService postService){
        this.postService = postService;
    }

    // "런타임에" 스프링 프레임워크가 PostController 객체를 생성해준다.
    // 이를 위해 멤버변수로 쓰고있는 PostService 형 객체를 먼저 생성해서
    // PostController 생성자 자리에 넣어준다.
    // 객체가 있다치고 나머지 코드를 작성한다.

    @GetMapping
    //@RequestMapping(method= RequestMethod.GET)
    public PostDto getPost(@RequestParam Integer id){
        PostDto result = postService.getPost(id);
        return result;
    }


    @PostMapping
    //postman 프로그램에서 post 선택, raw, json 선택해서
    //json 문법에 맞춰서 써야한다.
    //@RequestMapping(method= RequestMethod.POST)
    public String savePost(@RequestBody PostDto postDto){

        System.out.println(postDto.getId());
        System.out.println(postDto.getTitle());
        System.out.println(postDto.getContent());
        System.out.println(postDto.getUsername());

        return "POST /post";
    }
    @RequestMapping(method= RequestMethod.PUT)
    public String updatePost(){
        return "PUT /post";
    }
    @RequestMapping(method= RequestMethod.DELETE)
    public String deletePost(){
        return "DELETE /post";
    }
}
