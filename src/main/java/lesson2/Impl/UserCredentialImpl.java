package lesson2.Impl;

import lesson2.IUserCredential;

/**
 * @author whc
 * @Title: UserCredentialImpl
 * @Package: lesson2.Impl
 * @Description:
 * @date 2021/5/24 20:06
 */
public class UserCredentialImpl implements IUserCredential {
    @Override
    public String verifyUser(String username) {
        if ("admin".equals(username)) {
            return "admin";
        } else if ("manager".equals(username)) {
            return "manager";
        } else {
            return "normal";
        }
    }
}
