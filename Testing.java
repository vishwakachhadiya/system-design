

public class Testing {
public static void main(String[] args) {
//Pizza pizza1 = new Pizza();
//can't create object with constructor as private
//create object with method
Pizza pizza1 = Pizza.getPizza();
System.out.println(pizza1.hashCode());
Pizza pizza2 = Pizza.getPizza();
System.out.println(pizza2.hashCode());

}

}