class Box<T>{
    T o;
    void set(T o){
        this.o = o;
    }
    T get(){
        return o;
    }
}
public class GenericClass {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.set("Hello");
        String x = b.get();
        System.out.println(x);
    }

    
}
