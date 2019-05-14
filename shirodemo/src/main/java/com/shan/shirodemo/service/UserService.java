package com.shan.shirodemo.service;

import com.shan.shirodemo.component.RedisComponent;
import com.shan.shirodemo.config.shiro.DbShiroRealm;
import com.shan.shirodemo.testdao.UserDto;
import com.shan.shirodemo.utils.JwtUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 用户信息接口
 */
@Service
public class UserService {
	@Resource
	private RedisComponent redisComponent;

	@Autowired
	private StringRedisTemplate redisTemplate;
   
    /**
     * 保存user登录信息，返回token
     */
    public String generateJwtToken(String uid) {
    	/**
    	 * @todo 将salt保存到数据库或者缓存中
    	 * redisTemplate.opsForValue().set("token:"+username, salt, 3600, TimeUnit.SECONDS);
    	 */
		String token = JwtUtils.sign(uid, 3600); //生成jwt token，设置过期时间为1小时
		//保存用户token
		redisComponent.set(uid, token);
    	return token;
    }
    
    /**
     * 获取上次token生成时的salt值和登录用户信息
     * @param username
     * @return
     */
    public UserDto getJwtTokenInfo(String username) {
    	/**
    	 * @todo 从数据库或者缓存中取出jwt token生成时用的salt
    	 * salt = redisTemplate.opsForValue().get("token:"+username);
    	 */   	
    	UserDto user = getUserInfo(username);
    	return user;
    }

    /**
     * 清除token信息
     */
    public void deleteLoginInfo(String username) {
    	/**
    	 * @todo 删除数据库或者缓存中保存的salt
    	 * redisTemplate.delete("token:"+username);
    	 */
    	
    }
    
    /**
     * 获取数据库中保存的用户信息，主要是加密后的密码
     * @param userName
     * @return
     */
    public UserDto getUserInfo(String userName) {
    	UserDto user = new UserDto();
    	user.setUserId("asssa11111111222256");
    	user.setUsername("admin");
    	user.setEncryptPwd(new Sha256Hash("123456", DbShiroRealm.encryptSalt).toHex());
    	return user;
    }
    
    /**
     * 获取用户角色列表，强烈建议从缓存中获取
     * @param userId
     * @return
     */
    public List<String> getUserRoles(String userId){
    	return Arrays.asList("admin");
    }

}
