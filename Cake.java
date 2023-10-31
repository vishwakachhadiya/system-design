
public class Cake {
private static Cake cake = new Cake();
private Cake(){
//constructor
}
//Eager way of creating singleton object
public static Cake getCake(){
return cake;
}
}