package day9;
public class QueueDemo {
    int front=-1;
    int rear=-1;
    int arr[]=new int[5];
    void en(int data)
    {
        if(rear==arr.length-1)
        {
            System.out.println("Queue Overflow");
            return; 
        }
        if(front==-1)
        {
            front=0;
        }
        rear++;
        arr[rear]=data;
        System.out.println(arr[rear]+"->inserted");
    }
    void de()
    {
        if(front==-1 || front >rear)
        {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println(arr[front]+"->deleted");
        front++;
    }
    void peek()
    {
        if(front==-1 || front >rear)
        {
            System.out.println("Queue underflow");
            return;
        }
        System.out.println(arr[front]+":is Peek value");
    }
    public static void main(String[] args) {
        QueueDemo ob = new QueueDemo();
        ob.en(78);
        ob.en(789);
        ob.en(178);
        ob.de();
        ob.peek();
    }
}