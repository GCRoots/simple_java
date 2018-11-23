package reflect.entity;

import reflect.USB;

/**
 * @author wei.jiang
 * @since 2018/11/23
 */
public class MyComputer {
    public void run() {
        System.out.println("Running...");
    }

    public void close() {
        System.out.println("Closed!");
    }


    public void useUSB(USB usb) {
        if (usb != null) {//如果设备连接上，则开始使用设备功能
            usb.connection();
            usb.close();
        }
    }
}
