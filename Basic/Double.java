// public class Double {
//     public static void main (String[] args){
//         double x=5 , y=2, z;
//         z = x/y;
//         System.out.println(z);
 
// }   
// }

public class Double {

    public static void main(String[] args) {
        double product1=1750.50, person1, product2=550.08 , person2 ,product3=1750.60 , person3 , total;
        total= product1+product2+product3;
        System.out.println("Price of 3 products as double Total: "+ (total));
        if(5000 <= total){
             System.out.println("yess");
        } else{
           System.out.println("not bigger");
        }
        
    }
}