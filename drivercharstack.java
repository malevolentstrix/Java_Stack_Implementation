public class drivercharstack {
    public static void main(String args[])
    {
        charstack s = new charstack();

        s.push('a');
        s.push('c');
        s.push('d');
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
        s.push('t');
        s.push('y');
        s.push('v');
        s.print();
        
    }
}