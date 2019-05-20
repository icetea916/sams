package cn.icetea916.sams.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @author: zhaoteng
 * @create: 2019/5/20 18:15
 */
@RestController
public class DemoController {

    @PostMapping("/demo")
    public Object demoMethod() {
        return "测试demo程序";
    }

}
