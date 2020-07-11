public class Main {

    public static void main(String [] agrs){
        Link a = new Link();

        a.addFirst(10);
        a.addFirst(20);
        //a.addLast(40);
        a.addFirst(30);
        a.addFirst(40);
        System.out.println(a.total());
        System.out.println(a.isHere(20));
        a.delete(2);
        a.display();
       // a.reverse();

    }
}
