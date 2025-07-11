#include<iostream>
#define MAX 10
using namespace std;
class Stack{
    int s[MAX];
    int top;
    public:
    Stack(){
        top=-1;
    }
    int empty();
    int full();
    void push(int);
    int pop();
    void display();
};
int Stack::empty(){
    if(top==-1){
        return 1;
    }
    else{
        return 0;
    }
}
int Stack::full(){
    if(top==MAX-1){
        return 1;
    }
    else{
        return 0;
    }
}
void Stack::push(int x){
    if(full()){
        cout<<"\nCan't insert data(Overflow)";
    }
    else{
        top++;
        s[top]=x;
    }
}
int Stack::pop(){
    int x;
    if(empty()){
        cout<<"Can't delete(Underflow)";
    }
    else{
        x=s[top];
        top--;
        return x;
    }
}
void Stack::display(){
    for(int i=0;i<=top;i++){
        cout<<s[i];
    }
}
int main(){
    Stack s;
    s.push(30);
    s.push(20);
    s.push(50);
    cout<<"\nPoped elements:"<<s.pop();
    s.display();
    return 0;
}