#include <iostream>
using namespace std;
int main(){
    int marks,leaves;
    cin>>marks>>leaves;
    char grade = 'A';

    switch (grade)
    {
    case 'A':
        cout<<"EXcellent"<<endl;
    case 'B':
        cout<<"good"<<endl;
    default:
        cout<<"Invalid"<<endl;
    }

}