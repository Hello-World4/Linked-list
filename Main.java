public class Main {

    public static void main(String [] agrs){
        Link a = new Link();


        a.addFirst(10);
        a.addFirst(20);
        //a.addLast(40);
        a.addFirst(30);
        a.addFirst(40);
        a.addLast2(600,a.head);

        //System.out.println(a.total());

        System.out.println(a.isHere(20));
        System.out.println(a.search(20,a.head)); //recursive
        //a.delete(2);

        System.out.println(" Display : ");
        a.display();

        System.out.println(" Reverse : ");

       a.head = a.reverse3(a.head);
        a.display();

        //a.reverse2();
        //a.display2(a.head); //recursive
       // a.reverse();


    }
}
