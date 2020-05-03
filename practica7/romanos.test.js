const convertirRomano= require('./NumerosRomanos');
const Romanos = require('./Romanos.js');

test('para I', () => {
    expect(convertirRomano(1)).toBe('I');
  });

test('para II', () => {
    expect(convertirRomano(2)).toBe('II');
  });
test('para III', () => {
    expect(convertirRomano(3)).toBe('III');
});
test('para IV', () => {
  expect(convertirRomano(4)).toBe('IV');
});

test('para V', () => {
  expect(convertirRomano(5)).toBe('V');
});

test('para VI', () => {
  expect(convertirRomano(6)).toBe('VI');
});

test('para VII', () => {
  expect(convertirRomano(7)).toBe('VII');
});

test('para VIII', () => {
  expect(convertirRomano(8)).toBe('VIII');
});

test('para IX', () => {
  expect(convertirRomano(9)).toBe('IX');
});

test('para X', () => {
  expect(convertirRomano(10)).toBe('X');
});

test('para XX', () => {
  expect(convertirRomano(20)).toBe('XX');
});

test('para XXX', () => {
  expect(convertirRomano(30)).toBe('XXX');
});

test('para XL', () => {
  expect(convertirRomano(40)).toBe('XL');
});

test('para L', () => {
  expect(convertirRomano(50)).toBe('L');
});

test('para LX', () => {
  expect(convertirRomano(60)).toBe('LX');
});

test('para LXX', () => {
  expect(convertirRomano(70)).toBe('LXX');
});

test('para LXXX', () => {
  expect(convertirRomano(80)).toBe('LXXX');
});

test('para XC', () => {
  expect(convertirRomano(90)).toBe('XC');
});

test('para C', () => {
  expect(convertirRomano(100)).toBe('C');
});
let _Romanos = Romanos
for(let i = 0;i+1<=100;i++){
  test(`Para el numero entero :${i}`, () => {
    expect(convertirRomano(i+1)).toBe(_Romanos[i]);
  });
}





