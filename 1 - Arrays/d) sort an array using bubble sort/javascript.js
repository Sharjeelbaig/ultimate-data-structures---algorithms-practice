const bubbleSort = (array) => {
    let size = array.length
    let temporary;
    for (i = 0; i < size - 1; i++) {
        for (j = 0; j < size - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                temporary = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temporary
            }
        }
    }
}

const array = [1,2,4,5,6,7,9,10,8]
let elementsString = "";
array.forEach(element => {
   elementsString += `${element} ` 
});
console.log('Array before sorting:')
console.log(elementsString)

bubbleSort(array)
elementsString = ""
array.forEach(element => {
    elementsString += `${element} `
});
console.log('Array After sorting')
console.log(elementsString)
