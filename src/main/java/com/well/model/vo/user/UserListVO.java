package com.well.model.vo.user;

import com.well.entity.User;
import lombok.Getter;
import lombok.Setter;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * RichurLiu
 * 2020/3/26 22:30
 */
@Setter
@Getter
public class UserListVO {
    List<User> userList;
}
