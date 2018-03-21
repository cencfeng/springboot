package com.example.myspringboot.config;

import com.example.myspringboot.entity.User;
import com.example.myspringboot.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyShiroRealm extends AuthorizingRealm{

    @Autowired
    private UserService userService ;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println(principalCollection.toString());
        User user  = (User)principalCollection.getPrimaryPrincipal();
        //User user = userService.getByUserName((String) principalCollection.getPrimaryPrincipal());
        //把principals放session中 key=userId value=principals
        //SecurityUtils.getSubject().getSession().setAttribute(String.valueOf(user.getId()),SecurityUtils.getSubject().getPrincipals());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //赋予角色
        //info.addRole("123");
        //info.addStringPermission("domirtory");
        //赋予权限

        //设置登录次数、时间
//        userService.updateUserLogin(user);
        return info;
    }
    /*主要是用来进行身份认证的，也就是说验证用户输入的账号和密码是否正确。*/
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //String password = new String((char[])authenticationToken.getCredentials());
        //System.out.println(authenticationToken.getCredentials());
        User user = userService.getByUserName((String)authenticationToken.getPrincipal());
        if (user != null) {
//            byte[] salt = Encodes.decodeHex(user.getSalt());
//            ShiroUser shiroUser=new ShiroUser(user.getId(), user.getLoginName(), user.getName());
            //设置用户session
            Session session = SecurityUtils.getSubject().getSession();
            session.setAttribute("user", user);
            return new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),getName());
        } else {
            return null;
        }
//        return null;
    }
}
