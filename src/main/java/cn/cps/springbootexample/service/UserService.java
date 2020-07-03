package cn.cps.springbootexample.service;

import cn.cps.springbootexample.entity.user.to.UserInfoTO;
import cn.cps.springbootexample.entity.user.to.UserLoginTO;
import cn.cps.springbootexample.entity.user.vo.UserInfoVO;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * @author _Cps
 * @create 2019-02-14 10:25
 * @Description: 用户Service
 */
public interface UserService{

    UserInfoVO getUserById(Long userId);

    IPage<UserInfoVO> getUserList(UserInfoTO userInfoTO);

    UserInfoVO userLogin(UserLoginTO userLoginTO);

}
