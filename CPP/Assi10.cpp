#include<iostream>
#include<fstream>
#include<stdlib.h>
#include<stdio.h>
#include<string.h>
using namespace std;
struct stud{
    int rn;
    char name[10];
};
class file(){
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
        cout<<"\nEnter student details(Roll No., Name)";
        for(int i=0;i<n;i++){
            cin>>s.rn>>s.name;
        }
        f.write((char*)& s,sizeof(s));
        f.close();
    }
    void display(){
        int i;
        f.open(fname,ios::in);
        while(f.read((char*)& s,sizeof(s))){
            cout<<"\n"<<i<<"\t"<<s.rn<<"\t"<<s.name;
            i++;
        }
        f.close();
    }
    void add(){
        f.open(fname,ios::out|ios::app);
        cout<<"\nEnter the student details(Roll No., Name)";
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
    void del(){
        int x;
        cout<<"\nEnter roll no. to search-";
        cin>>x;
        if(search(x)){
            f.open(fname,ios::in);
            f1.open("C:\\test1.txt",ios::out);
            while(f.read(char*)& s,sizeof(s)){
                if(ch!==x){
                    f1.write((char*)& s,sizeof(s));
                }
            }
            f.close();
            f1.close();
            remove(fname);
            rename("D:\\test1.txt",fname);
        }
        else{
            cout<<"\nNot found";
        }
    }
};