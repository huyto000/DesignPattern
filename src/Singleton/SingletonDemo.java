package Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();

        object.showMessage();
        System.out.println(object.hashCode());
        object2.showMessage();
        System.out.println(object2.hashCode());
        System.out.println(object==object2);
    }
}
