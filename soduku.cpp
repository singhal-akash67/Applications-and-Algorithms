#include<iostream>
using namespace std;
class soduku{
    public:
    int value;
    int status;
    soduku(int value)
    {
        this->value=value;
        status=0;
    }
};
bool placing(soduku array[9][9],int i,int j){/*This is a helper function*/
    if(array[i][j].value==9){
        array[i][j].value=0;
        return false;
    }
    array[i][j].value++;
    int row=0;
    int column=0;
    while(row<9)
    {
        if(array[row][j].value==array[i][j].value&&row!=i)
        return placing(array,i,j);
        row++;
    }
    while(column<9){
        if(array[i][column].value==array[i][j].value&&column!=j)
            return placing(array,i,j);
        column++;
    }
    row=i-i%3;
    column=j-j%3;
    for(int p=row;p<row+3;p++){
        for(int q=column;q<column+3;q++){
            if(array[i][j].value==array[p][q].value&&i!=p&&q!=j){
                return placing(array,i,j);
            }
        }
    }
    return true;
}
void solver(soduku array[9][9])/*This is a function to be called from main function*/{
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){

            if(array[i][j].value!=0)
            array[i][j].status=1;
            }
    }
    for(int i=0;i<9;i++){
        for(int j=0;j<9;){
            if(array[i][j].status==0){
                bool y=placing(array,i,j);
                if(y==true)
                    j++;
                else{
                    j--;
                     if(j==-1){
                            i--;
                            j=8;
                        }
                        if(i==-1){
                            cout<<"no solution"<<endl;
                            return;
                        }
                    while(array[i][j].status!=0){
                        j--;
                        if(j==-1){
                            i--;
                            j=8;
                        }
                        if(i==-1){
                            cout<<"no solution"<<i<<j<<endl;
                            return;
                        }
                    }
                }
            }
            else
            j++;
        }
    }
}

int main()
{
        soduku array[9][9]={3, 0, 6, 5, 0, 8, 4, 0, 0,
                      5, 2, 0, 0, 0, 0, 0, 0, 0,
                      0, 8, 7, 0, 0, 0, 0, 3, 1,
                      0, 0, 3, 0, 1, 0, 0, 8, 0,
                      9, 0, 0, 8, 6, 3, 0, 0, 5,
                      0, 5, 0, 0, 9, 0, 6, 0, 0,
                      1, 3, 0, 0, 0, 0, 2, 5, 0,
                      0, 0, 0, 0, 0, 0, 0, 7, 4,
                      0, 0, 5, 2, 0, 6, 3, 0, 0};

    solver(array);
    for(int i=0;i<9;i++)
    {
        for(int j=0;j<9;j++)
        {
            cout<<array[i][j].value<<" ";
        }
        cout<<endl;
    }
}
