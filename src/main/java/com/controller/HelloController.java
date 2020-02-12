package com.controller;

import com.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: HKZ
 * @Date: 2019/7/17 8:13
 * @Description:
 */
@RestController
public class HelloController {

    //restful api方式
    @GetMapping("/hello/{name}")
    public String index(@PathVariable String name){
        return "hello!" + name;
    }

    /**
     * @Author HKZ
     * @Description 供客户端调用
     * @Date
     * @Param
     * @return
     **/
    @RequestMapping("/user")
    public List<User> getUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "zhangsan", 20));
        list.add(new User(2, "lisi", 22));
        list.add(new User(3, "wangwu", 20));
        return list;
    }
//  传统api方式
//  @RequestMapping("/hello")
//   public String index(@RequestParam String name) {
//       return "hello "+name+"，this is first messge";
//   }

}