let superobj = { superval: 'super' };
let subobj = { subval: 'sub' };
subobj.__proto__ = superobj;


console.log(subobj.subval);
console.log(subobj.superval);

subobj.superval = 'apple';
console.log(superobj.superval);
console.log(subobj.superval);
