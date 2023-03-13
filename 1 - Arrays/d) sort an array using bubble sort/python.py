def bubbleSort(array):
    for i in range(0, len(array) - 1):
     for j in range(0, len(array) - i - 1):
        if array[j] > array[j+1]:
           temporary = array[j]
           array[j] = array[j + 1]
           array[j + 1] = temporary;

array = [1,2,3,6,7,9,4,10,5,8]
print('before',array)
bubbleSort(array)
print('after', array)