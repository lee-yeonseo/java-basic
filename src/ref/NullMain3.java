package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bitData = new BigData();
        System.out.println("bigData.count=" + bitData.count);
        System.out.println("bitData.data=" + bitData.data);

        // NullPointerException
        System.out.println("bigData.data.value=" + bitData.data.value);
    }
}
