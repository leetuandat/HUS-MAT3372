package lab12.mylist;

public class MyArrayListIterator implements MyIterator {
    // Dữ liệu của MyArrayList cần được tham chiếu để iterator có thể duyệt qua
    private Object[] data;
    // Biết vị trí hiện tại của iterator trong mảng data
    private int currentPosition;
    // Biết kích thước của MyArrayList, vì mảng data có thể lớn hơn kích thước thực tế của MyArrayList
    private int size;

    // Khởi tạo MyArrayListIterator với dữ liệu của MyArrayList
    public MyArrayListIterator(Object[] data, int size) {
        this.data = data;
        this.size = size;
        currentPosition = 0; // Bắt đầu từ vị trí đầu tiên của mảng
    }

    /**
     * Kiểm tra xem có phần tử kế tiếp trong danh sách hay không
     * @return true nếu iterator chưa đến cuối danh sách, false nếu ngược lại.
     */
    @Override
    public boolean hasNext() {
        return currentPosition < size; // kiểm tra nếu vị trí hiện tại nhỏ hơn kích thước thực tế
    }

    /**
     * Di chuyển iterator đến vị trí tiếp theo và trả về phần tử hiện tại.
     * @return phần tử hiện tại của danh sách trước khi dịch chuyển.
     */
    @Override
    public Object next() {
        // Kiểm tra nếu có phần tử kế tiếp
        if (!hasNext()) {
            throw new IndexOutOfBoundsException();
        }
        // trả về phần tử hiện tại và tăng vị trí hiện tại lên 1
        return data[currentPosition++];
    }
}