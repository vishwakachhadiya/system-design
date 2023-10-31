

public class Testingcake {
    public static void main(String[] args) {
Cake cake1 = Cake.getCake();
System.out.println(cake1.hashCode());
Cake cake2 = Cake.getCake();
System.out.println(cake2.hashCode());
}
}
