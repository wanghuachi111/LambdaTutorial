package lesson2;

/**
 * @author whc
 * @Title: IUserCredential
 * @Package: lesson2
 * @Description: 用户身份认证标记接口
 * @date 2021/5/24 20:02
 */

@FunctionalInterface
public interface IUserCredential {

    //一个接口内仅有一个抽象方法，则这就是函数式接口
    String verifyUser(String username);

    default String getCredential(String username) {

        if ("admin".equals(username)) {
            return "admin + 系统管理员";
        } else if ("manager".equals(username)) {
            return "manager + 用户管理员";
        } else {
            return "normal + 普通会员";
        }
    }

}
