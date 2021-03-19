
class charstack {
    static final int MAX = 1000;
    int top;
    int top_rev;
    char a[] = new char[MAX];
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    charstack()
    {
        top = -1;
    }
 
    boolean push(char x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
 
    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
 
    char peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            char x = a[top];
            return x;
        }
    }

    void print()
    {
      System.out.println("Stack elements are") ;
      while(!isEmpty())
      {
          System.out.println(peek());
          pop();
      }
    }

}