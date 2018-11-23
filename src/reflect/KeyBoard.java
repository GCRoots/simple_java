package reflect;

/**
 * @author wei.jiang
 * @since 2018/11/23
 */
public class KeyBoard implements USB {
    @Override
    public void connection() {
        System.out.println("键盘正在使用...");
    }

    @Override
    public void close() {
        System.out.println("键盘已断开连接！");
    }
}
