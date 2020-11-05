package com.software.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;


/**
 * Created with IntelliJ IDEA.
 *
 * @author gaohu9712@163.com
 * @date 2020/10/29
 * @description
 */

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/get")
    public Object get() {
        return "你已经消费了";
    }
}
