package com.zhuishutest.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class ShopApplication {

    @GetMapping("/user/shop")
    String shop(){
       return  "欢迎来到购物微服务模块的大家庭";
    }
    @GetMapping("/role")
    String index(){
        return  "欢迎来到购物微服务模块!!!";
    }
//    @GetMapping("/zeng")
//    String indexs(){
//        return  "欢迎来到购物微服务模块sdfasdf!!!";
//    }
//    @PostMapping("/shop/conditions")
//    String indexss(){
//        return  "欢迎来到购物微服务模块shop!!!";
//    }
//
//    @GetMapping(value = "/{id}")
//    public Result get(@PathVariable String id) {
//        log.debug("get with id:{}", id);
//        return Result.success(userService.get(id));
//    }

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

}
