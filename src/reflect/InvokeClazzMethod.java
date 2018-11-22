package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeClazzMethod {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String className = "reflect.entity.Person";
        Class<?> clazz = Class.forName(className);

        //获取公共方法
        Method[] methods = clazz.getMethods();

        //获取私有方法
        Method[] declaredMethods = clazz.getDeclaredMethods();


        //获取单个方法：按方法名和参数获取


        //获取单个静态方法：fun1
        Method staMethod = clazz.getMethod("fun1", null);
        //获取单个无参数方法：fun2
        Method nullMethod = clazz.getMethod("fun2", null);
        //获取单个の有参数方法：function3
        Method moreMethod = clazz.getMethod("fun3", String.class);
        //获取单个の私有方法：function4
        Method priMethod = clazz.getDeclaredMethod("fun4", null);


//        System.out.println("[Person类的公共方法及父类方法:]");
//        for (Method m : methods) {
//            System.out.println(m);
//        }
//        System.out.println("[Person类的私有方法:]");
//        for (Method m : declaredMethods) {
//            System.out.println(m);
//        }
//        System.out.println("[按方法名和参数类型获取的方法4个方法:]");
//        System.out.println(staMethod);
//        System.out.println(nullMethod);
//        System.out.println(moreMethod);
//        System.out.println(priMethod);


        //使用反射获取到的方法
        Object object = clazz.newInstance();
        moreMethod.setAccessible(true);
        Object more = moreMethod.invoke(object, "use more");
        System.out.println(more);
    }

}
