package lab12.mylist;

public abstract class MyAbstractList implements MyList {

    @Override
    public String toString() {
        if (size() == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size(); i++) {
            sb.append(get(i));
            if (i < size() - 1) {
                sb.append("] [");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}