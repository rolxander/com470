//const sudoku = (cadena) => 'Hola mundo'
//const sudoku =cadena => true
const sudoku = cadena =>{
    let addRow = [0,0,0,0,0,0,0,0,0];
    let contador = 0;
    let respuesta = true;
    let contadorRows = 0
    let addColumn = [0,0,0,0,0,0,0,0,0];
    for(valor in cadena){
        if(contador == 9){
            contador=0;
            contadorRows++;
        }
        if(contador<9){
            addRow[contadorRows] +=parseInt(cadena[valor]);
            addColumn[contador]+=parseInt(cadena[valor]);
            contador++
        }
    }
    for(let i = 0; i<9;i++){
        (addRow[i]==45 && addColumn[i] == 45)? "" : respuesta = false;
    }
    return respuesta;
}
module.exports = sudoku;
/*

const sudoku = cadena =>{
    let addRow = 0;
    let contador = 0;
    let respuesta = true;
    let addColumn = [0,0,0,0,0,0,0,0,0];
    for(valor in cadena){
        if(contador == 9){
            if(addRow!=45){
                respuesta = false;
            }
            addRow =0;
            contador=0;
        }
        if(contador<9){
            addRow += parseInt(cadena[valor]);
            addColumn[contador]+=parseInt(cadena[valor]);
            contador++
        }
       
    }
    console.log(addColumn)
    return respuesta;
}

*/
