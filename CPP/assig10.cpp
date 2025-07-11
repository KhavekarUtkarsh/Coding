#include<iostream>
#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#include<fstream>
using namespace std;
struct stud{
    int rn;
    char name[10];
};
class file{
    stud s;
    fstream f,f1;
    char fname[20];
    public:
    file(){
        cout<<"\nEnter the name of the file-";
        cin>>fname;
    }
    void create(){
        int n;
        f.open(fname,ios::out);
        cout<<"\nEnter the no. of students-";
        cin>>n;
        cout<<"\nEnter the student details(Roll No., Name)-";
        for(int i=0;i<n;i++){
            cin>>s.rn>>s.name;
            f.write((char*) & s,sizeof(s));
        }
        f.close();
    }
    void display(){
        int i=1;
        f.open(fname, ios::in);
        cout<<"\nSr.No.\tRoll No.\tName";
        while(f.read((char*)& s,sizeof(s))){
            cout<<"\n"<<i<<"\t"<<s.rn<<"\t"<<s.name;
            i++;
        }
        f.close();
    }
    void add(){
        f.open(fname, ios::out| ios::app);
        cout<<"\nEnter (Roll No., Name)-";
        cin>>s.rn>>s.name;
        f.write((char*)& s,sizeof(s));
        f.close();
    }
    int search(int x){
        f.open(fname,ios::in);
        while(f.read((char*)& s,sizeof(s))){
            if(s.rn==x){
                f.close();
                return 1;
            }
        }
        f.close();
        return 0;
    }
    void modify(){
        int x;
        cout<<"\nEnter roll no. to modify-";
        cin>>x;
        if(search(x)){
            f.open(fname,ios::in|ios::out);
            int size=sizeof(s);
            while(f.read((char*)& s,sizeof(s))){
                if(s.rn==x){
                    cout<<"\nEnter new data-";
                    cin>>s.rn>>s.name;
                    f.seekp(-size,ios::cur);
                    f.write((char*)& s,sizeof(s));
                    break;
                }
            }
            f.close();
        }
        else{
            cout<<"\nNot found.";
        }
    }
    void del(){
        int x;
        cout<<"\nEnter Roll No. to delete-";
        cin>>x;
        if(search(x)){
            f.open(fname,ios::in);
            f1.open("D:\\test1.txt",ios::out);
            while(f.read((char*)& s,sizeof(s))){
                if(s.rn!=x){
                    f1.write((char*)& s,sizeof(s));
                }
            }
            f.close();
            f1.close();
            remove(fname);
            rename("D:\\test1.txt",fname);
        }
        else{
            cout<<"\nNot Found!!";
        }
    }
};
int main(){
    file f;
    int ch,x;
    while(1){
        cout<<"\n1:Create\n2:Display\n3:Add\n4:Delete\n5:Modify\n6:Search";
        cout<<"\nEnter your choice-";
        cin>>ch;
        switch(ch){
            case 1: f.create();
                    break;
            case 2: f.display();
                    break;
            case 3: f.add();
                    break;
            case 4: f.del();
                    break;
            case 5: f.modify();
                    break;
            case 6: cout<<"\nEnter Roll No. to search-";
                    cin>>x;
                    if(f.search(x)){
                        cout<<"\nFound!!";
                    }
                    else{
                        cout<<"\nNot Found!!";
                    }
                    break;
        }
    }
    return 0;
}