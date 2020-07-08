package com.zhuishutest.shop;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/shop")
@RestController
public class ShopController {
    @PostMapping
    public String add(){
        return "add shop";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return "delete shop"+id;
    }
    @PutMapping("/{id}")
    public String put(@PathVariable String id){
        return "put shop"+id;
    }
    @GetMapping("/{id}")
    public String get(@PathVariable String id){
        return "get shop"+id;
    }
    @PostMapping("/conditions")
    public String search(){
        return "search shop";
    }
    @GetMapping("/all")
    String post(){
        return  "欢迎来到购物微服务模块shopsdfsd!!!";
    }

}
