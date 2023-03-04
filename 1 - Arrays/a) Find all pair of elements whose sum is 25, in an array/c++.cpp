#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
    int array[10] = {6, 16, 10, 15, 8, 20, 45, 12, 4, 6};
    for (int i = 0; i < 10; i++)
    {
        for (int j = 1 + i; j < 10; j++)
        {
            (array[i] == array[j]) ? cout << "array[" << i << "]"
                                          << " + "
                                          << "array[" << j << "]"
                                          << " = " << 25
                                   : cout << "";
        }
    }
    return 0;
}