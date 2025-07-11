#include<iostream>
using namespace std;
int main(){
    int a,b,ch;
    float res;
    cout<<"\nEnter two numbers-\n";
    cin>>a>>b;
    cout<<"\n____MENU____";
    cout<<"\n 1: Addition \n 2:Substraction \n 3:Multiplication \n 4:Division";
    cout<<"\nEnter your choice-";
    cin>>ch;
    switch(ch){
        case 1: res=a+b;
                cout<<"\nAddition="<<res;
                break;
        case 2: res=a-b;
                cout<<"\nSubstraction="<<res;
                break;
        case 3: res=a*b;
                cout<<"\nMultiplication="<<res;
                break;
        case 4: res=a/b;
                cout<<"\nDivision="<<res;
                break;
        default: cout<<"\nWrong choice";
    } 

    return 0;
}