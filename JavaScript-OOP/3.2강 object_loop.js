var memberarray = ['banana', 'kiwi', 'apple'];
console.group('array loop');
var i = 0;
while (i < memberarray.length) {
    console.log(i, memberarray[i]);
    i = i + 1;
}
console.groupEnd('array loop');


var memberobject = {
    manager: 'banana',
    developer: 'kiwi',
    designer: 'apple'
}

console.group('object loop');
for (var name in memberobject) {
    console.log(name, memberobject[name]);
}
console.groupEnd('object loop');



