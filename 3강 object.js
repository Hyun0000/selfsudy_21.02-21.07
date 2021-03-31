var memberarray = ['banana', 'kiwi', 'apple'];
console.log(memberarray[1]);
console.log(memberarray[2]);
console.log('memberarray[1]', memberarray[1]);

var memberobject = {
    manager: 'banana',
    developer: 'kiwi',
    designer: 'apple'
}
memberobject.designer = 'appple';
console.log(memberobject.designer);
console.log('memberobject.designer', memberobject.designer);

console.log(memberobject['designer']);
console.log("memberobject['designer']", memberobject['designer']);

delete memberobject.manager
console.log(memberobject.manager);
