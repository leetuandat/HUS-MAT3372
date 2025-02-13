package lab12.mylist;

public class TestMyList {
    public static void main(String[] args) {
        MyList list1 = new MyArrayList();
        list1.append("ABC");
        list1.append(999);
        list1.append(true);
        list1.append('g');

        MyIterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
