#include<iostream>
#include<stdio.h>
using namespace std;
int factorial(int);
int main(){
    int num;
    int result;
    cout<<"\nEnter a no. to find it's Factorial:";
    cin>>num;
    if(num<0){
        cout<<"Factorial of negative no. is not possible";
    }
    else{
        result=factorial(num);
        cout<<"The factorial of "<<num<<" is "<<result;
    }
    return 0;
}
int factorial(int num){
    if(num==0||num==1){
        return 1;
    }
    else{
        return(num*factorial(num-1));
    }
}