package lesson2.Impl;

import lesson2.IMessageFormat;

/**
 * @author whc
 * @Title: MessageFormatImpl
 * @Package: lesson2.Impl
 * @Description:
 * @date 2021/5/25 15:17
 */
public class MessageFormatImpl implements IMessageFormat {

    @Override
    public String format(String message, String format) {
        System.out.println("消息转换...");
        return message;
    }
}
