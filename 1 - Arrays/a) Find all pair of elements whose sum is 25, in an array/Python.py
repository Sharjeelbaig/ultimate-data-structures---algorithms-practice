array = [6, 16, 10, 15, 8, 20, 45, 12, 4, 6]
for i in range(len(array) - 1):
 for j in range(1 + i, len(array)):
  if array[i] + array[j] == 25:
   print('array[' , i , '] + array[ ',j,"] = 25" )
