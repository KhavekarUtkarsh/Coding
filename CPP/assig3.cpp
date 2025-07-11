// Q. Implement Circular Queue using Array. Perform following operations on it. a) Insertion (Enqueue) b) Deletion (Dequeue) c) Display
#include<iostream>
#define MAX 5
using namespace std;
class Queue{
    private:
    int q[MAX];
    int front,rear;
    public:
    Queue(){
        front=rear=-1;
    }
    bool isFull(){
        if(front==0 && rear==MAX-1){
            return true;
        }
        else{
            if(front==rear+1){
                return true;
            }
            else{
                return false;
            }
        }
    }
    bool isEmpty(){
        if(front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void enQueue(int x){
        if(isFull()){
            cout<<"\nQueue is full.";
        }
        else{
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%MAX;
            q[rear]=x;
            cout<<"\nInserted "<<x<<endl;
        }
    }
    int deQueue(){
        int y;
        if(isEmpty()){
            return -1;
        }
        else{
            y=q[front];
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%MAX;
            }
            return y;
        }
    }
    void Display(){
        int i;
        if(isEmpty()){
            cout<<"\nQueue is Empty.";
        }
        else{
            for(i=front;i!=rear;i=(i+1)%MAX){
                cout<<"\t"<<q[i];
            }
            cout<<"\t"<<q[i];
        }
    }
};
int main(){
    Queue q;
    int ch,ele,r;
    do{
        cout<<"\n____MENU____";
        cout<<"\n1:Enqueue\n2:Dequeue\n3:Display\n4:Exit";
        cout<<"\nEnter your choice-";
        cin>>ch;
        switch(ch){
            case 1: cout<<"\nEnter the element to be inserted-";
                    cin>>ele;
                    q.enQueue(ele);
                    break;
            case 2: r=q.deQueue();
                    if(r==-1){
                        cout<<"\nQueue is Empty!";
                    }
                    else{
                        cout<<"\nDequeue element- "<<r;
                    }
                    break;
            case 3: q.Display();
                    break;
        }
    }while(ch!=4);
    return 0;
}