
Binary Search 🔍
-------

👨‍💻 Here's a step-by-step explanation of binary search:

---

### | Step 1:


```C++
int binarySearch(int arr[], int left, int right, int number)
```

This is the start of a function called `binarySearch` that takes in 4 parameters: an array of integers `arr`, two integers `left` and `right`, which represent the left and right bounds of our search, and an integer `number`, which represents the value we are searching for.
##### `bound`: Bounds in binary search refer to the range within which the algorithm searches for a target value in a sorted array. In other words, it defines the start and end points between which the algorithm looks for the target value.
##### `left`:  "left" represents the index of the leftmost element (beginning) of the search range
##### `right`:  "right" represents the index of the rightmost element (end) of the search range.
##### `number`:  That is what we are searching for.
##### `arr`:  The array from which we are searching the number.
---

### | Step 2:
```C++
while (left <= right)
```

This initiates a while loop that will continue running as long as `left` is less than or equal to `right`.

---

### | Step 3:
```C++
int mid = left + (right - left) / 2;
```

This calculates the midpoint between `left` and `right` by taking the sum of `left` and `right` divided by two. We use an equation in parentheses to avoid integer overflow when adding very large integers together.

---

### | Step 4:

```C++
if (arr[mid] == number) return mid;
```

This checks if the value at the midpoint index of `arr` matches the value we are searching for. If it does, we immediately return the current index.

---

### | Step 5:
```C++
arr[mid] < number ? left = mid + 1 : right = mid - 1;
```

If the value at the midpoint index isn't what we're looking for, we check to see if it’s greater or lesser. If it’s lesser than the searched element, we update the `left` variable to be one greater than the midpoint (`mid + 1`). Otherwise, we update the `right` variable to be one less than the midpoint (`mid - 1`).

---

### | Step 6:
```C++
return -1;
```

Finally, we break out of the while loop once `left` becomes greater than `right`, indicating that the search has failed. We return -1 to indicate that there is no match.

---



## [🧐 After ALL!!!! ]

Here's the complete code:


```C++
int binarySearch(int arr[], int left, int right, int number)
{
    while (left <= right)
    {
        int mid = left + (right - left) / 2;

        if (arr[mid] == number) 
            return mid;
        
        arr[mid] < number ? left = mid + 1 : right = mid - 1;
    }

    return -1;
}
```