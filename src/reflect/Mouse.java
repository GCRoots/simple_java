package reflect;

/**
 * @author wei.jiang
 * @since 2018/11/23
 */
public class Mouse implements USB {
    @Override
    public void connection() {
        System.out.println("鼠标正在使用...");
    }

    @Override
    public void close() {
        System.out.println("鼠标已断开连接！");
    }
}
