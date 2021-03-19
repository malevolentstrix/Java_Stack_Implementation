public class driverstack {
    public static void main(String args[])
    {
        stackint s = new stackint();

        s.push(4535);
        s.push(9645);
        s.push(43);
        System.out.println(s.peek() + " Peeked element");
        if(s.isEmpty()==true)
        {
            System.out.println("The stack is empty "); 
        }
        else
        {
            System.out.println("The stack is not empty ");
        }
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("The largest element is " + s.largest());
        s.push(3562);
        s.push(6666);
        s.push(740);
        s.print();
        
    }
}


