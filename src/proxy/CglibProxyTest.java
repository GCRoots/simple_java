package proxy;

/**
 * @author wei.jiang
 * @since 2018/11/23
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Do o = (Do) cglibProxy.newProxyInstance(Do.class);
        System.out.println(o.doSomething(5));
    }
}

class Do {
    public int doSomething(int num) {
        System.out.println("方法执行中。。。。。。");
        return num;
    }
}
