package lesson2;

/**
 * @author whc
 * @Title: IMessageFormat
 * @Package: lesson2
 * @Description: 消息传输调格式转换接口
 * @date 2021/5/24 20:04
 */
@FunctionalInterface
public interface IMessageFormat {

    String format(String message, String format);

    static boolean verifyMessage(String message) {
        if (message != null) {
            return true;
        } else{
            return false;
        }
    }

}
