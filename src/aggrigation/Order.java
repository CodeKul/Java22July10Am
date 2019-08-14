package aggrigation;

public class Order {

    int id;
    String orderId;
    String productName;
    int productQuntity;
    double totalAmount;
    double productAmount;
    User user;



    public Order(int id, String orderId, String productName, int productQuntity, double totalAmount, double productAmount, User user) {
        this.id = id;
        this.orderId = orderId;
        this.productName = productName;
        this.productQuntity = productQuntity;
        this.totalAmount = totalAmount;
        this.productAmount = productAmount;
        this.user = user;
    }

    void displayData(){
        System.out.println(
                "id : "+id+"\n"+
                "order Id : "+orderId+"\n"+
                "product name : "+productName+"\n"+
                "qty : "+productQuntity+"\n"+
                "total amount : "+totalAmount+"\n"+
                "product amount : "+productAmount+"\n"+
                "cust. name : "+user.getName()+"\n"+
                "cust. address : "+user.getAddress()+"\n"+
                "cust. mobile Number : "+user.getMobileNumber()
        );


    }

    public static void main(String[] args) {
        User user=new User(1,"","","");
        Order order=new Order(1,String.valueOf(System.currentTimeMillis()),
                "Santoor",6,63.00,10.50,user);
        order.displayData();
    }

}
