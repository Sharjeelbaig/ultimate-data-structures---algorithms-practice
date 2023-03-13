const A = [[4, 2, 3],
           [3, 1, 2],
           [3, 6, 2]];
const B = [[2, 4, 5, 9],
           [3, 2, 8, 7],
           [8, 4, 3, 2]];
let C = [[],
         [],
         []];
let row, col, element;
for(row = 0; row < 3; row++){
for (let col = 0; col < 4; col++) {
C[row][col] = 0;
for(element = 0; element < 3; element++){
C[row][col] += A[row][element] * B[element][col];
}   
}
}
for (row = 0; row < 3; row++) {
process.stdout.write('|')
for(col = 0; col < 4; col++){
process.stdout.write(" " + C[row][col] + " ");
}
console.log('|')
}