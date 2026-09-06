/*public class Arithmetic {
public static void main(String[] args) {
    int x=9 , y=5;
    System.out.println(x+y);
    System.out.println(x-y);
    System.out.println(x*y);
    System.out.println(x/y);
}  
}*/

/* QUESTION 1

Problem: Calculate the Final Bill
A shop gives you the following information:

Product 1 price = ₹850
Product 2 price = ₹1250
Product 3 price = ₹675
Product 4 price = ₹999

Quantities:

Product 1 → 3
Product 2 → 2
Product 3 → 4
Product 4 → 1

Now calculate the final bill using these rules:

1. Calculate the total price of all products.

2. Give a 15% discount on the total.

3. After the discount, add 18% GST.

4. The customer has ₹10,000. Calculate how much money is left after paying the final bill.
*/
public class Arithmetic {
    public static void main (String[] args){
        float Product1=850, quantity1 = 3 , Product2= 1250, quantity2 = 2, Product3=675, quantity3 = 4 ,Product4=999, quantity4 = 1;
        float Total_amount;
        float Discount;
        float Discount_amount;
        float Gst;
        System.out.println("Product1 value with Quantity1:"+" "+Product1*quantity1);
        System.out.println("Product2 value with Quantity2:"+" "+Product2*quantity2);
        System.out.println("Product3 value with Quantity3:"+" "+Product3*quantity3);
        System.out.println("Product4 value with Quantity4:"+" "+Product4*quantity4);

        Total_amount = Product1*quantity1 + Product2*quantity2 + Product3*quantity3 + Product4*quantity4;
        System.out.println("Total amount of all product: "+ Total_amount);
        Discount = Total_amount*15/100;
        System.out.println("Discount: "+Discount);  
        Discount_amount = Total_amount-Discount;
        System.out.println("After_Discount: "+Discount_amount);
        Gst = Discount_amount*18/100;
        System.out.println("GST: "+Gst);
        System.out.println("LEFT_AMOUNT: "+ (10000 - (Discount_amount + Gst)) );

    }
}
