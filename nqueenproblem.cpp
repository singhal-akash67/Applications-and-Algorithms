#include<iostream>
using namespace std;
#include<stdlib.h>
bool placing(int array[10][10],int row,int n,int *store){/*this is helper function of solver*/
    int column=0;
    if(array[row][n-1]==1){
        store[row]=-1;
        array[row][n-1]=0;
        return false;
    }
    while(column<n){
        if(array[row][column]==1){
            break;
        }
        column++;
    }
    if(column==n)
        column=0;
    else{
        array[row][column]=0;
        column++;
    }
    store[row]=-1;
    array[row][column]=1;
    int i=0;
    while(i<row){
        if(abs(i-row)==abs(store[i]-column)||store[i]==column){
            bool y= placing(array,row,n,store);
            return y;
        }
        i++;
    }
    store[row]=column;
    return true;
}
void solver(int array[10][10],int n){/*This is the function to be called from main*/
    int store[10]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};/*this keeps track of all the columns where queens have placed till now*/
    for(int i=0;i<n;){
        bool y=placing(array,i,n,store);
        if(y==false)
        i--;
        else
        i++;
    }
}
int main()
{
    int array[10][10]={0};/*Here you can alter the size according to need and thus you will have to change everywhere*/
    solver(array,10);
    for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
            cout<<array[i][j];
        }
        cout<<endl;
    }
}
