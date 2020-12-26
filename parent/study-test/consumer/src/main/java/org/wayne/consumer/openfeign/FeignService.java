package org.wayne.consumer.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.wayne.common.entity.User;
import org.wayne.consumer.openfeignandhystrix.IFallBackFactory;

/**
 * @Description: openFeign接口形式消费服务
 *
 * @author: LinWeiQi
 */
//@FeignClient(value = "provide",fallback = FeignFallBack.class)  //方式1
@FeignClient(value = "provide",fallbackFactory = IFallBackFactory.class) //方式2
public interface FeignService {

    // 底层：restTemplate.getForObject(uri, String.class)
    @GetMapping("/hello")
    String hello();


    // key-value传参必须加@requestParam("xx")注解

    @GetMapping("/hello2")
    String hello2(@RequestParam("name") String name);

    @PostMapping("/user2")//json形式
    User user2(@RequestBody User user);

    @PostMapping("/user1")//key value形式
    User user1(@RequestParam("username") String username,@RequestParam("password") String password);

    @DeleteMapping("/user3/{id}")
    String del(@PathVariable Integer id);
}