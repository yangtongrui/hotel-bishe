package com.gp.bishe.service;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.gp.bishe.pojo.Manager;
import com.gp.bishe.pojo.User;
import org.springframework.stereotype.Service;


@Service("TokenService")
public class TokenService {
    public String getToken(Manager manager) {
        String token="";
        token= JWT.create().withAudience(String.valueOf(manager.getManagerid()))// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(manager.getManagerpwd()));// 以 password 作为 token 的密钥
        return token;
    }

    public String getUserToken(User user) {
        String token="";
        token= JWT.create().withAudience(String.valueOf(user.getUserid()))// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(user.getUserpwd()));// 以 password 作为 token 的密钥
        return token;
    }
}
