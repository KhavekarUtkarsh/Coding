#include<iostream>
using namespace std;
class node{
    public:
    int value;
    node*next;
};
int main(){
    node*temp;
    node*head=temp;
    node*one=NULL;
    node*two=NULL;
    node*three=NULL;
    one= new node();
    two= new node();
    three= new node();
    one->value=1;
    two->value=2;
    three->value=3;
    one->next=two;
    two->next=three;
    three->next=one;
    head=three;
    temp=head->next;
    do{
        cout<<temp->value;
        temp=temp->next;
    }while(temp!=head->next);
}