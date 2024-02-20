public class Order {
        private String item;
        private Integer quantity;
        private Double unitPrice;
        private Double totalAmount;

        public PaymentMode getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(PaymentMode paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        private PaymentMode paymentMethod;

        public Order(){

        }

        public Order(String item, Integer quantity, Double unitPrice) {
            this.item = item;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }


        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public Double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public Double getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount() {
            totalAmount = ((quantity * unitPrice ) -(quantity * unitPrice)* getPaymentMethod().determineDiscountRate()  );
        }
    }

