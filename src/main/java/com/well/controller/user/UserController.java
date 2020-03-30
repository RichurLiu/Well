package com.well.controller.user;


import com.well.controller.BasicController;
import com.well.entity.User;
import com.well.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author RichurLiu
 * @since 2020-03-26
 */
@RestController
@RequestMapping("/well/user/")
public class UserController extends BasicController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<User> getUserList(){
        return userService.list();
    }

}

