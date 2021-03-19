
class stackint {
    static final int MAX = 1000;
    int top;
    int top_rev;
    int a[] = new int[MAX];
 
    boolean isEmpty()
    {
        return (top < 0);
    }
    stackint()
    {
        top = -1;
    }
 
    boolean push(int x)
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
 
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
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

    int largest()
    {
        int large = peek();
        while(!isEmpty())
        {
            if(large<peek())
            {
                large = peek();
            }  
            pop();
        }
        return large;
    }
}