class Order {
 String orderId;
 double baseFoodPrice;
 int distance;
 public Order(String orderId, double baseFoodPrice, int distance) {
 this.orderId = orderId;
 this.baseFoodPrice = baseFoodPrice;
 this.distance = distance;
 }
 public double calculateBill() {
 double deliveryFee = distance * 2.0;
 return baseFoodPrice + deliveryFee;
 }
public void displayDetails() {
 System.out.println("Order ID : " + orderId);
 System.out.println("Order Type : " + this.getClass().getSimpleName());
 System.out.printf("Final Bill : $%.2f\n", calculateBill());
 System.out.println("------------------------------------");
 }
 }
 class NormalOrder extends Order {
 public NormalOrder(String orderId, double basePrice, int dist) {
 super(orderId, basePrice, dist);
 }
 }
 class ExpressOrder extends Order {
 public ExpressOrder(String orderId, double basePrice, int dist) {
 super(orderId, basePrice, dist);
 }
 @Override
 public double calculateBill() {
 double rushFee = 5.0;
 return super.calculateBill() + rushFee; 
 }
 }
 class PremiumOrder extends Order {
 public PremiumOrder(String orderId, double basePrice, int dist) {
 super(orderId, basePrice, dist);
 }
@Override
 public double calculateBill() {
 double membershipDiscount = 0.90; 
 return baseFoodPrice * membershipDiscount;
 }
 }
 public class FoodDeliveryApp {
 public static void main(String[] args) {
 Order[] orders = {
 new NormalOrder("NORM-101", 25.0, 5),
 new ExpressOrder("RUSH-202", 25.0, 5),
 new PremiumOrder("VIP-789", 25.0, 5)
 };
 System.out.println("=== ONLINE FOOD DELIVERY PRICING SYSTEM ===");
 System.out.println("Simulation: Same Food Price ($25) and Distance (5km)\n");
 for (Order o : orders) {
 calculateBill() 
 o.displayDetails();
 }
 }
 }