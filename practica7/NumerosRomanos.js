
const iterarNumero = (simbolo,pre_simbolo="",numero=1) =>{
    let nuevo_simbolo = pre_simbolo+simbolo;
    for(let i = 1;  i<numero; i++){
        nuevo_simbolo+=simbolo;// 
    }
    return nuevo_simbolo;
}
const convertirRomano=(numero)=>{
    let unidades= numero%10;    
    let decenas = Math.trunc(numero/10)
    unidades = getNumeroRomano(unidades,["I","V","X"])
    decenas = getNumeroRomano(decenas,["X","L","C"])
    return numero<100?(decenas+unidades):"C";
    
}
const getNumeroRomano = (numero,simbolos) =>{
    let resultado =""
    let _simbolos = simbolos;
    switch(numero){
        case 1:
        case 2:
        case 3:resultado = iterarNumero(_simbolos[0],'',numero);break;
        case 4:resultado = iterarNumero(_simbolos[1],_simbolos[0]);break;
        case 5:resultado = iterarNumero(_simbolos[1]);break;
        case 6:
        case 7:
        case 8:resultado = iterarNumero(_simbolos[0],_simbolos[1],(numero-5));break;
        case 9:resultado=iterarNumero(_simbolos[2],_simbolos[0]);break;
    }
    return resultado;
}
module.exports = convertirRomano;

/*
El codigo anterior
 Para -> I
    const convertirRomano = ()=> "I" 
Para ->II
    const convertirRomano = numero=> numero==1 ? "I":"II"
Para ->III  
    const convertirRomano = numero=> numero == 1 ? "I":numero==2?"II":"III"
Refactorizacion para -> I
const convertirRomano = numero=>{
    return iterarNumero("I",numero);
}    
const iterarNumero = (simbolo,numero) =>{
    let nuevo_simbolo = simbolo;
    for(let i = 1;  i<numero ; i++){
        nuevo_simbolo+=simbolo;
    }
    return nuevo_simbolo;
}
Para -> IV

const convertirRomano = numero =>{
    let resultado;
    switch(numero){
        case 1:
        case 2:
        case 3:{let simbolo = "I"; resultado = iterarNumero(simbolo,numero);break;}
        case 4:resultado = "IV";break;
    }
    return resultado;
}
const iterarNumero = (simbolo,numero) =>{
    let nuevo_simbolo = simbolo;
    for(let i = 1;  i<numero ; i++){
        nuevo_simbolo+=simbolo;
    }
    return nuevo_simbolo;
}
Para -> V

const convertirRomano = numero =>{
    let resultado;
    switch(numero){
        case 1:
        case 2:
        case 3:{let simbolo = "I"; resultado = iterarNumero(simbolo,numero);break;}
        case 4:resultado = "IV";break;
        case 5:resultado = "V";break;
    }
    return resultado;
}
const iterarNumero = (simbolo,numero) =>{
    let nuevo_simbolo = simbolo;
    for(let i = 1;  i<numero ; i++){
        nuevo_simbolo+=simbolo;
    }
    return nuevo_simbolo;
}
para -> VI, VII , VIII, IX
    
const convertirRomano = numero =>{
    let resultado;
    switch(numero){
        case 1:
        case 2:
        case 3:{let simbolo = "I"; resultado = iterarNumero(simbolo,numero);break;}
        case 4:resultado = "IV";break;
        case 5:resultado = "V";break;
        case 6:
        case 7:
        case 8:{let simbolo = "I",pre_simbolo = "V"; resultado = iterarNumero("I",(numero-5),"V");break;}
        case 9:resultado="IX";break;
    }
    return resultado;
}
const iterarNumero = (simbolo,numero,pre_simbolo="") =>{
    let nuevo_simbolo = pre_simbolo+simbolo;
    for(let i = 1;  i<numero; i++){
        nuevo_simbolo+=simbolo;
    }
    return nuevo_simbolo;
}
const unidadDecenaCentenas=(numero)=>{
    if(numeo<9){
        let contador = 0;

        while(true){
            numero / 10;

            
        }
    }
}
REFACTORIZAR PARA ->ix
const convertirRomano = (numero,simbolos) =>{

    let resultado="";
    let _simbolos = simbolos;
    switch(numero){
        case 1:
        case 2:
        case 3:resultado = iterarNumero(_simbolos[0],'',numero);break;
        case 4:resultado = iterarNumero(_simbolos[1],_simbolos[0]);break;
        case 5:resultado = iterarNumero(_simbolos[1]);break;
        case 6:
        case 7:
        case 8:resultado = iterarNumero(_simbolos[0],_simbolos[1],(numero-5));break;
        case 9:resultado=iterarNumero(_simbolos[2],_simbolos[0]);break;
    }
    return resultado;
}
const iterarNumero = (simbolo,pre_simbolo="",numero=1) =>{
    let nuevo_simbolo = pre_simbolo+simbolo;
    for(let i = 1;  i<numero; i++){
        nuevo_simbolo+=simbolo;
    }
    return nuevo_simbolo;
}
const unidadDecenaCentenas=(numero)=>{
    let unidades= numero%10;
    let decenas = Math.trunc(numero/10)
    
}
}*/