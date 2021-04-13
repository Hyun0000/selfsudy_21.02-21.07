let superobj = { superval: 'kiwi' };
let subobj = Object.create(superobj);
subobj.subval = 'orange';

console.log(subobj.subval);
console.log(subobj.superval);
console.log(superobj.superval);
subobj.superval = 'grape';
console.log(subobj.superval);