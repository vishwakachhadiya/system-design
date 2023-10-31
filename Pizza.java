public class Pizza {
private static Pizza pizza;
//creating object with constructor
private Pizza(){
//constructor
}
//Lazy way of creating singleton object
public static Pizza getPizza(){
synchronized(Pizza.class){
if( pizza==null ){
pizza = new Pizza();
}
}
return pizza;
}
}

