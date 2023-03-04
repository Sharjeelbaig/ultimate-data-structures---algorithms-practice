#include <iostream>
using namespace std;

int linearSearch(int array[], int number, int size)
{
    int i = 0;
    while (i < size && array[i] != number)
        i++;
    return i == size ? 0 : i;
}

int main()
{
    int arr[] = {6, 22, 36, 48, 59, 71};
    int size = sizeof(arr) / sizeof(int);
    int number;
    cout << "Enter number to search: ";
    cin >> number;
    int loc = linearSearch(arr, number, size);
    (loc == 0) ? cout << "The element " << number << " was not found" << endl :
     cout << "The element " << number << " was found at index " << loc << endl;
    return 0;
}