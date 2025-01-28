package access.ex;

public class ShoppingCart {
    Item[] items = new Item[10];
    private int count;

    public void addItem(Item item) {
        if (count >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
        } else {
            items[count++] = item;
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + caclulateTotalPrice());
    }

    private int caclulateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
