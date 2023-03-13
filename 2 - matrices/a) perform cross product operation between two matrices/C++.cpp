#include <iostream>
using namespace std;

int main()
{
    int A[3][3] = {{4, 2, 3},
                   {3, 1, 2},
                   {3, 6, 2}};

    int B[3][4] = {{2, 4, 5, 9},
                   {3, 2, 8, 7},
                   {8, 4, 3, 2}};
    
    int C[3][4];

    int row, col, element;

    for(row = 0; row < 3; row++){
    for(col = 0; col < 4; col++){
    C[row][col] = 0;
    for(element = 0; element < 3; element++){
    C[row][col] += A[row][element] * B[element][col];
    }
    }
    }

    for(row = 0; row < 3; row++){
    cout << "| ";
    for(col = 0; col < 4; col++){
    cout << C[row][col] << " ";
    }
    cout << "|";
    cout << '\n';
    }
    return 0;
}