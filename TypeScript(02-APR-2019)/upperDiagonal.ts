var matrix:number[][]= [[1,2,3], [3,4,5], [6,7,8]];
var col = matrix[0].length;
for(var i = 0; i < matrix.length; i++) {
    for(var j = 0; j < col; j++){
        console.log(matrix[i][j]);
        
    }
    
    col--;
}
