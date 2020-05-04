const sodoku = require('./sudoku')
test('revision de sudoku',()=>{
    expect(sodoku('864371259325849761971265843436192587198657432257483916689734125713528694542916378')).toBe(true)
})  
test('revision de sudoku',()=>{
    expect(sodoku('695127384138459672724836915851264739273981546946573821317692458489715263562348197')).toBe(true)
})
test('revision de sudoku',()=>{
    expect(sodoku('465912378189473562327568149738645291954821637216397854573284916642159783891736425')).toBe(true)
})
test('revision de sudoku',()=>{
    expect(sodoku('865714329917362845234598761142657983783941256596283174358176492429835617671429538')).toBe(true)
})
       




/*test('primer hola mundo',()=>{
    expect(sodoku()).toBe('Hola mundo')
})*/