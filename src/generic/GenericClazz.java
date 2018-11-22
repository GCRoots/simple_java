package generic;

/**
 * @author wei.jiang
 * @since 2018/10/31
 */
public class GenericClazz<T> {
    //key这个成员变量的类型为T,T的类型由外部指定
    private T key;

    public GenericClazz(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey() { //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }


    public static void main(String[] args) {
        //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
        //传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        GenericClazz<Integer> genericInteger = new GenericClazz<>(123456);

        //传入的实参类型需与泛型的类型参数类型相同，即为String.
        GenericClazz<String> genericString = new GenericClazz<>("key_vlaue");
        System.out.println("泛型测试key is " + genericInteger.getKey());
        System.out.println("泛型测试key is " + genericString.getKey());


//        GenericClazz generic = new GenericClazz("111111");
//        GenericClazz generic1 = new GenericClazz(4444);
//        GenericClazz generic2 = new GenericClazz(55.55);
//        GenericClazz generic3 = new GenericClazz(false);
//
//        System.out.println("泛型测试key is " + generic.getKey());
//        System.out.println("泛型测试key is " + generic1.getKey());
//        System.out.println("泛型测试key is " + generic2.getKey());
//        System.out.println("泛型测试key is " + generic3.getKey());
        GenericClazz<Integer> gInteger = new GenericClazz<Integer>(123);
        GenericClazz<Number> gNumber = new GenericClazz<Number>(456);

        showKeyValue2(gNumber);
        showKeyValue2(gInteger);
    }

    private static void showKeyValue1(GenericClazz<Number> obj) {
        System.out.println("泛型测试key value is " + obj.getKey());
    }

    private static void showKeyValue2(GenericClazz<?> obj) {
        System.out.println("泛型测试key value is " + obj.getKey());
    }
}
