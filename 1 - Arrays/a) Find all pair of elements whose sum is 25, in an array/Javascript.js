const array = [6, 16, 10, 15, 8, 20, 45, 12, 4, 6];
for (let i = 0; i < array.length - 1; i++) {
    for (let j = i + 1; j < array.length; j++) {
        (array[i] + array[j] === 25)
        ? console.log(`array[ ${i} ]+ array[ ${j} ] = 25`)
        : null
    }
}