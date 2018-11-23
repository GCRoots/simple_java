package reflect;

import reflect.entity.MyComputer;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author wei.jiang
 * @since 2018/11/23
 */
public class ReflectUseTest {
    public static void main(String[] args) throws Exception {
        MyComputer mc = new MyComputer();

        //我们只需要知道封装设备的类名即可
//        String className = "reflect.Mouse";
//        Class<?> c = Class.forName(className);
//        Object obj = c.newInstance();
        File config = new File("src/usb.properties");
        FileInputStream fis = new FileInputStream(config);
        Properties properties = new Properties();
        properties.load(fis);
        String className = properties.getProperty("usb");
        Class<?> c = Class.forName(className);
        Object obj = c.newInstance();
        USB usb = (USB) obj;
        mc.useUSB(usb);
    }
}
