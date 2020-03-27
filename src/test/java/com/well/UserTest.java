package com.well;

import com.well.entity.User;
import com.well.service.UserService;
import net.minidev.json.JSONArray;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * RichurLiu
 * 2020/3/26 22:41
 */
public class UserTest extends WellApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void test01(){
        List<User> list = userService.list();
        System.out.println(list);
    }
}
