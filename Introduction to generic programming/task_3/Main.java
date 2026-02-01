package task_3;
import java.util.*;

public class Main {
    static class Box<T> {
        // your code here
        private T t;

        public Box(T t){
            this.t = t;
        }

        public T get(){
            return this.t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            // your code here
            Integer res = Integer.valueOf(num);
            Box<Integer> box = new Box<>(res);
            System.out.println(box.get());
        } else if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            // your code here
            Float res = Float.valueOf(num);
            Box<Float> box = new Box<>(res);
            System.out.println(box.get());
        } else {
            String str = sc.next();
            // your code here
            String res = String.valueOf(str);
            Box<String> box = new Box<>(res);
            System.out.println(box.get());
        }
    }
}