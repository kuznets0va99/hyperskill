import java.util.ArrayList;
import java.util.Arrays;

class Main {
    ArrayList<String> list = new ArrayList<>();

    void init() {
        // add "one", "two", "three" to list field in this order
        list.addAll(Arrays.asList("one", "two", "three"));
    }
}

class Test {
    public static void main(String[] args) {
        Main main = new Main();
        main.init();

        for (String str : main.list) {
            System.out.println(str);
        }
    }
}