package com.zhuishutest.shop.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/shop")
@RestController
public class ShopController {

    @ApiOperation(value = "添加shop的接口", notes = "添加一个shop的接口")
    @ApiImplicitParam(name = "shopRoutForm", value = "新增shop的form表单", required = true, dataType = "Shop")
    @PostMapping
    public String add(){
        return "add shop";
    }

    @ApiOperation(value = "删除shop的接口", notes = "根据shop的id来指定删除对象")
    @ApiImplicitParam(paramType = "path", name = "id", value = "shop的ID", required = true, dataType = "string")
    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return "delete shop"+id;
    }

    @ApiOperation(value = "修改shop的接口", notes = "修改指定shop的信息")
    @PutMapping("/{id}")
    public String put(@PathVariable String id){
        return "put shop"+id;
    }

    @ApiOperation(value = "查询shop的接口", notes = "根据id获取指定shop的路由信息")
    @ApiImplicitParam(paramType = "path", name = "id", value = "shop的ID", required = true, dataType = "string")
    @GetMapping("/{id}")
    public String get(@PathVariable String id){
        return "get shop"+id;
    }

    @ApiOperation(value = "搜索shop的接口", notes = "根据条件查询shop的信息")
    @ApiImplicitParam(name = "shopRoutQueryForm", value = "shop查询参数", required = true, dataType = "ShopRouteQueryForm")
    @PostMapping("/conditions")
    public String search(){
        return "search shop";
    }

    @ApiOperation(value = "查询所有shop的接口", notes = "查询所有shop的信息")
    @GetMapping("/all")
    String post(){
        return  "欢迎来到购物微服务模块shopsdfsd!!!";
    }

}
