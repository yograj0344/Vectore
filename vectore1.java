import java.util.*; // vectore implements interface and object
                    // it is similar to Array
                    // it is not limited to specific size
                    // it maintains the insertioms  order
                    // default initial capacity of vector size 10
                    
                
class vectore1
{
    public static void main(String[] args)
    {
        Vector list=new Vector ();
        int capacity=list.capacity();
        System.out.println(capacity);
        list.add("apple");
        list.add("mango");
        list.add("pramg");
        System.out.println(list);
        list.add(" jay");
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
    }
}