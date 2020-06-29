package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

public interface UserService {
    /**
     * 用户注册的接口
     * @param user
     * @return
     */
    boolean regist(User user);
}
