#include<iostream>
using namespace std;
struct book{
    char name;
    float price;
    int pages;
};
int main(){
    struct book b1,b2,b3;
    cout<<"\nEnetr the names, prices and pages of 3 books\n";
    cin>>b1.name>>b1.price>>b1.pages;
    cin>>b2.name>>b2.price>>b2.pages;
    cin>>b3.name>>b3.price>>b3.pages;
    cout<<"\nThese are the entered details";
    cout<<"\nName-"<<b1.name<<"\nPrice-"<<b1.price<<"\nPages-"<<b1.pages;
    cout<<"\nName-"<<b2.name<<"\nPrice-"<<b2.price<<"\nPages-"<<b2.pages;
    cout<<"\nName-"<<b3.name<<"\nPrice-"<<b3.price<<"\nPages-"<<b3.pages;
    return 0;
}