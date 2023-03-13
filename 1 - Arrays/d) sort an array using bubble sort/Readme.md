
Bubble Sort 🤜 🤛
=====================

Bubble sort is a simple sorting algorithm that repeatedly steps through the list to be sorted, compares each pair of adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

Full Code 🧐
---------

``` c++
void bubble_sort(int arr[], int n) {
    // Traverse through all array elements
    for (int i = 0; i < n - 1; i++) {
        // Last i elements are already sorted, so we can ignore them
        for (int j = 0; j < n - i - 1; j++) {
            // If the current element is greater than the next element, swap them
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

Explanation 🗨
-----------

👨‍💻 Let's break down the code line by line:

``` c++
void bubble_sort(int arr[], int n) {
```

This is the declaration of a function named `bubble_sort` which takes two arguments: an integer array `arr` and its size `n`.

``` c++
for (int i = 0; i < n - 1; i++) {
```

This is a loop that starts from the beginning of the array and goes until `n-1`, where `n` is the size of the array. The reason to run the loop till its size minus 1 is because we have only 1 element at last which cannot be compared to any other because there is no element at its next. we compare two adjecent elements only and the last element has no element next to it. instead, the last element is compared with second last element.

``` c++
for (int j = 0; j < n - i - 1; j++) {
```

This is another loop that starts from the beginning of the array and goes until `n-i-1`. The purpose of this loop is to compare adjacent elements of the array. we can decrement the upper bound of the inner for loop by i in order not to re-check previously sorted elements.

``` c++
if (arr[j] > arr[j + 1]) {
    int temp = arr[j];
    arr[j] = arr[j + 1];
    arr[j + 1] = temp;
}
```

This is an `if` statement that checks if the current element of the array is greater than the next one. If it is, we swap their positions using a temporary variable `temp`.

By the end of the outer loop, the largest element will be at the last position of the array. We ignore this element in the next iteration since it is already in its correct position. This process repeats until the entire array is sorted.

And that's it! Bubble sort is not usually the most efficient sorting algorithm, but it is relatively easy to understand and implement.