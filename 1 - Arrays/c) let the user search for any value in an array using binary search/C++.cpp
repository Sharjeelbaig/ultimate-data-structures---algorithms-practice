#include<iostream>
using namespace std;
int binarySearch(int arr[], int left, int right, int number){
    while(left <= right){
        int mid = left + (right - left) / 2;
        if(arr[mid] == number) return mid;
        arr[mid] < number ? left = mid + 1 : right = mid -1;
    }
    return -1;
}
int main(){
int number;
cout << "Enter number to find from an array \n";
cin >> number;
int array[10] = {1,2,3,4,5,6,7,8,9,10};
int size = sizeof(array) / sizeof(int);
int location = binarySearch(array,0,size,number); 
if(location == -1){
cout << "The number does not exist in theb array";
} else {
    cout << "The number " << number << " is found at the index " << location;
}
}