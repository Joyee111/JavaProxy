package CgLibDynamic;

public class Client {
    public static void main (String args[]){
        CustomerCgLib customerCgLib = new CustomerCgLib();
        Customer customer = (Customer) customerCgLib.getProxy(Customer.class);
        customer.buy("测试：买");
    }
}
