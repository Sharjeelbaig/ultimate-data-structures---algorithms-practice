
Linear Search Explained! 🕵️‍♂️🔍
=================================

🤖 Sure, I can help with that! Here's a step-by-step explanation of each line in this code with some emojis to make it more fun and intuitive:

1.  `int linearSearch(int array[], int number, int size)`
    
    *   This is the function definition for a function named `linearSearch` that takes three arguments:
        *   an integer array named `array`
        *   an integer variable named `number`
        *   an integer variable named `size`
    *   The purpose of this function is to perform a linear search on the given array to find if the specified number exists or not.
2.  `int i = 0;`
    
    *   An integer variable named `i` is declared and assigned the initial value of `0`.
3.  `while (i < size && array[i] != number)`
    
    *   A while loop is initiated where its condition checks two things -
        *   `i` should be less than the size of the given array, which means we are not going out of bounds of the array index 🔢 and
        *   `array[i]` should not be equal to the given `number` because that's what we're looking for with a linear search 🔎.
    *   If any of these conditions fail, the loop breaks and goes to the next line.
4.  `i++;`
    
    *   Inside the while loop, increases the value of `i` by one at each iteration until it satisfies the above-mentioned conditions or goes to the end of the array.
5.  `return i == size ? 0 : i;`
    
    *   After the while loop completes, it returns the appropriate result depending on whether the number would have been found or not.
    *   If the value of `i` equals to the size of the given array, it means the number doesn't exist 🚫, so it returns `0`, else it means the position at which the number was found, so the function will return that index.

```javascript
int linearSearch(int array[], int number, int size)
{
    int i = 0;
    while (i < size && array[i] != number)
        i++;
    return i == size ? 0 : i;
}
```

That's pretty much it! Hope it helps you understand the code better! 🙌