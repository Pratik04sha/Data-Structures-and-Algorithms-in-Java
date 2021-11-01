package Udemy.Stack.MinStack;

public class StackMin {
    Node top;
    Node min;

    public StackMin(){
        top= null;
        min= null;
    }

    public int min(){
        return min.value;
    }

    public void push(int value){
        if (min==null){
            min= new Node(value, min);
        }
        else if (min.value< value){
            min= new Node(min.value, min);
        }
        else {
            min= new Node(value, min);
        }
        top= new Node(value, top);
    }

    public int pop(){
        min= min.next;
        int res= top.value;
        top= top.next;
        return res;
    }

    public static void main(String[] args) {
        StackMin s= new StackMin();
        s.push(5);
        s.push(6);
        s.push(3);
        s.push(9);

        System.out.println(s.min());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.min());
    }
}
