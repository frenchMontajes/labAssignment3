public class PaymentApp {
        public static void main(String[] args){
            Order order = new Order("keyboard",10, 300.00 , new GCash());

            System.out.println("Order item is " + order.getItem());
            System.out.println("Unit price is " + order.getUnitPrice());
            System.out.println("Quantity is " + order.getQuantity());

            order.setTotalAmount();
            System.out.println();

            System.out.println("Payment order details if " + order.getPaymentMethod().getClass().getSimpleName());
            System.out.println("Discount rate " + order.getPaymentMethod().determineDiscountRate());
            System.out.println("Payment amount is " + order.getTotalAmount());

            order.setPaymentMethod(new Maya());
            order.setTotalAmount();
            System.out.println();

            System.out.println("Payment order details if " + order.getPaymentMethod().getClass().getSimpleName());
            System.out.println("Discount rate " + order.getPaymentMethod().determineDiscountRate());
            System.out.println("Payment amount is " + order.getTotalAmount());

            order.setPaymentMethod(new ShopeePay());
            order.setTotalAmount();
            System.out.println();

            System.out.println("Payment order details if " + order.getPaymentMethod().getClass().getSimpleName());
            System.out.println("Discount rate " + order.getPaymentMethod().determineDiscountRate());
            System.out.println("Payment amount is " + order.getTotalAmount());
        }
    }

