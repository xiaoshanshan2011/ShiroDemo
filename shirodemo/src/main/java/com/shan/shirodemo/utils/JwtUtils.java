package com.shan.shirodemo.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.Verification;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

public class JwtUtils {
    public static String salt = "etwuqierpodfjlkxdvzhufkaehgaxgjh";//JwtUtils.generateSalt();

    /**
     * 获得token中的信息
     *
     * @return token中包含的签发时间
     */
    public static Date getIssuedAt(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(salt);
            Verification verification = JWT.require(algorithm);
            DecodedJWT jwt = verification.build().verify(token);
            return jwt.getIssuedAt();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获得token中的信息
     *
     * @return token中包含的用户名
     */
    public static String getUid(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(salt);
            Verification verification = JWT.require(algorithm);
            DecodedJWT jwt = verification.build().verify(token);
            String uid = jwt.getClaim("uid").asString();
            return uid;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 生成签名,expireTime后过期
     *
     * @param uid 用户名
     * @param time     过期时间s
     * @return 加密的token
     */
    public static String sign(String uid, long time) {
        try {
            Date date = new Date(System.currentTimeMillis() + time * 1000);
            Algorithm algorithm = Algorithm.HMAC256(salt);
            // 附带username信息
            return JWT.create()
                    .withClaim("uid", uid)
                    .withExpiresAt(date)
                    .withIssuedAt(new Date())
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    /**
     * token是否过期
     *
     * @return 1：有效token，2：过期token，3：无效token
     */
    public static int isTokenExpired(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(salt);
            Verification verification = JWT.require(algorithm);
            DecodedJWT jwt = verification.build().verify(token);
            Date now = Calendar.getInstance().getTime();
            boolean isExpire = jwt.getExpiresAt().before(now);
            if (isExpire)
                return 2;
            else
                return 1;
        } catch (Exception e) {
            return 3;
        }
    }

    /**
     * 生成随机盐,长度32位
     *
     * @return
     */
    public static String generateSalt() {
        SecureRandomNumberGenerator secureRandom = new SecureRandomNumberGenerator();
        String hex = secureRandom.nextBytes(16).toHex();
        return hex;
    }

}
