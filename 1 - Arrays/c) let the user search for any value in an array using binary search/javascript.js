const binarySearch = (array, left, right, numberToFind) => {
while (left <= right) {
    let mid = Math.floor(left + (right - left) / 2) // Math.floor to not 
    if(array[mid] === numberToFind){
    return mid
    }
    (array[mid] < numberToFind)
    ? left = mid+1
    : right = mid - 1
}
return -1
}

const array = [1,2,3,4,5,6,7]
const size = array.length
const numberToFind = 5

const location = binarySearch(array, 0, size, numberToFind)
location === -1
? console.log(numberToFind, 'does not exist in the array')
: console.log(numberToFind, 'is at index ', location)