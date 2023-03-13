def binarySearch(array, left, right, numberToFind):
    while left <= right:
        mid = int(left + (right - left) / 2) #we have converted it into int to not get floating point value
        if array[mid] == numberToFind:
            return mid
        if array[mid] < numberToFind:
            left = mid + 1
        else:
            right = mid - 1
    return -1


array = [1, 2, 3, 44, 5, 6]
numberToFind = int(input('Enter number to find: '))
location = binarySearch(array, 0, len(array), numberToFind)
print('The number is found at the index', location
      if location != -1 else 'Number does not exist')
