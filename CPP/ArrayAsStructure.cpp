#include<iostream>
using namespace std;
struct stud{
    int roll,age;
    char name[20];
}
vr[2];
int main(){
    for(int i=0;i<2;i++){
        cout<<"\nEnter"<<i+1<<"student record";
        cout<<"\nEnter roll no.-";
        cin>>vr[i].roll;
        cout<<"\nEnter name-";
        cin>>vr[i].name;
        cout<<"\nEnter age-";
        cin>>vr[i].age;
    }
    cout<<endl;
    for(int j=0;j<2;j++){
        cout<<"\nDispaly"<<j+1<<"Student Record\n";
        cout<<"\nRoll no.-"<<vr[j].roll;
        cout<<"\nName-"<<vr[j].name;
        cout<<"\nAge-"<<vr[j].age<<"\n";
    }
    return 0;
}