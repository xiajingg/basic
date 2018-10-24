package basic.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 这个项目启动类 点击左边的播放键 项目就会启动了
 * 这个springboot框架的基本组成结构
 * 前期你们不会学到这些, 但是都是围绕的这些在学, 你们学到的东西会跟这不一样, 但是很类似
 * 当有不同点的时候再指出来讨论.
 * 全部. 完
 */
@SpringBootApplication(scanBasePackages = "basic.demo")
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
        System.out.println("start webapplication");
    }
}
