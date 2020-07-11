public class Main {

    public static void main(String [] agrs){
        Link a = new Link();

        a.addFirst(10);
        a.addFirst(20);
        a.addLast(40);
        //System.out.println(a.total());
        System.out.println(a.isHere(20));
        //a.display();
        a.reverse();
    }
}
