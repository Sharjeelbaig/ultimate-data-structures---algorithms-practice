#include<iostream>
using namespace std;

void bubble_sort(int arr[], int size){
for(int i = 0; i < size - 1; i ++){
for(int j = 0; j < size - i - 1; j++){
if(arr[j] > arr[j + 1]){
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
}

void displayArray(int array[], int size){
cout << '[';
for(int i = 0; i < size; i++){
cout << " " << array[i] << " ";
}
cout << ']';
}

int main(){
    int array[10];
    for(int i = 0; i < 10; i++){
    cout << "Enter value in index " << i << ": ";
    cin >> array[i];
    }
    cout << " array before sort: \n";
    displayArray(array,10);
    cout << '\n';
    bubble_sort(array,10);
    cout << " array after sort: \n";
    displayArray(array,10);
    return 0;
}
