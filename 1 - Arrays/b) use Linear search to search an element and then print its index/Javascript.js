const handleLinearSearch = (array,number) =>{
let i = 0;
while (i < array.length && array[i] !== number) i++;
return i === array.length ? -1 : i;
}
const array = [6, 16, 10, 15, 8, 20, 45, 12, 4, 6]
let number = 20
const location = handleLinearSearch(array,number)
location === -1
? console.log(`The number ${number} does not exist in the array`)
: console.log(`the number ${number}  is found at the index ${location}`)
