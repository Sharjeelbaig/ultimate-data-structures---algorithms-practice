To find all pairs of elements whose sum is 25, we can use 🧐 nested loops to iterate over each element in the array and compare it with all the other elements to check if their sum is equal to 25.

# Declaring array

We have to create an integer array of size 10 defined and initialized with some values. The objective is to find pairs in the array whose sum equals to 25. In order to accomplish this, the code is using nested loops to iterate through the array elements and checking for pairs that equal to 25.

```c++
int array[10] = {6, 16, 10, 15, 8, 20, 45, 12, 4, 6};
```

Here, an integer array `array[10]` is defined with size of 10 and assigned some initial values.

# use of loop

```c++
for (int i = 0; i < 10; i++)
{
    for (int j = 1 + i; j < 10; j++)
    {
        // Conditional operator used to check if the sum equals to 25
        (array[i] +  array[j] == 25)
            ? cout << "array[" << i << "]"
                   << " + "
                   << "array[" << j << "]"
                   << " = " << 25
            : cout << "";
    }
}
```

The nested `for` loop iterates through each element of the array, taking one element at a time as `i`. Another integer variable `j` is initialized with value `1+i`, which means it will take the subsequent element of `i`. This helps avoiding checking pairs more than once since `(a+b) = (b+a)`. So, we don't have to check `b+a` when we already checked `a+b`.

# use of condition

The condition inside the inner `for` loop checks whether the sum of `array[i]` and `array[j]` equals to 25. If the sum is equal to 25, then it prints out the indices (`i` and `j`) and the sum.

Note: Ternary conditional operator `?` is used here, which is equivalent to if-else in compact way

*   If the condition `(array[i] + array[j] == 25)` is true, it executes following codes :

```c++
cout << "array[" << i << "]"
       << " + "
       << "array[" << j << "]"
       << " = " << 25;
```

This prints out the array indices and their sum.

*   If the above condition is false, it executes following code :

```c++
cout << "";
```

Since we are not interested in pairs whose sum is NOT equal to 25, we simply print empty string `""`.

Finally, this code outputs all pairs whose sum equals to 25.