def linearSearch(array, numberToFind):
    size = len(array)
    i = 0
    while (i < size) and (array[i] != numberToFind):
        i += 1
    return (i) if i != size else (-1)


array = [6, 16, 10, 15, 8, 20, 45, 12, 4, 6]
numberToFind = int(input('Enter number to find: '))
location = linearSearch(array, numberToFind)
print(numberToFind, 'is found at index ', location
      if location != -1 else 'number does not exists!')
