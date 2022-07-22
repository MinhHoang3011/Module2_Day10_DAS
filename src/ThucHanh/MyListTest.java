package ThucHanh;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> li = new MyList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(3);
        li.add(4);

        System.out.println("element 4: "+li.get(4));
        System.out.println("element 1: "+li.get(1));
        System.out.println("element 2: "+li.get(2));
    }
}
