import java.io.File;
import java.util.Collections;
import java.util.Objects;

/**
 * @author wei.jiang
 * @since 2018/11/1
 */
public class MainTest implements Runnable {

    public static Integer integer = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (integer) {
                if (integer < 10) {
                    integer++;
                    System.out.println(integer);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        Thread t1 = new Thread(mainTest);
        Thread t2 = new Thread(mainTest);
        t1.start();
        t2.start();
    }

//    public static void diGui(String path) {
//        File file = new File(path);
//        System.out.println(file.isDirectory());
//        if (file.isDirectory() && file.list() != null) {
//            for (String filePath : Objects.requireNonNull(file.list())) {
//                diGui(file.getPath() + "/" + filePath);
//            }
//        } else {
//            System.out.println(file.getName());
//        }
//    }
//
//
//    public static void main(String[] args) {
//        diGui("d:/test_pro/test");
//    }


}
