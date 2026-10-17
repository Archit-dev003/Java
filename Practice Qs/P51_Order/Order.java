package P51_Order;

enum OrderStatus {
    PLACED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}

class Order
{
    private int id;
    private OrderStatus status;
    
    public Order(int id) {
        this.id = id;
        this.status = OrderStatus.PLACED;
    }

    public int getId() {
        return id;
    }

    public OrderStatus getOrderStatus() {
        return status;
    }

    public void setOrderStatus(OrderStatus thisStatus) {
        this.status = thisStatus;
    }

    public void getStatus()
    {
        switch (status) {
            case OrderStatus.PLACED:
                System.out.println("Your oder is ready to shipped!");
                break;
            case OrderStatus.SHIPPED:
                System.out.println("Your OrderStatus is on the way!");
                break;
            case OrderStatus.DELIVERED:
                System.out.println("Your OrderStatus is deliverd!");
                break;
            case OrderStatus.CANCELLED:
                System.out.println("Delivery was cancelled!");
                break;
            default:
                System.out.println("Invalid OrderStatus status!");
                break;
        }
    }
}
