let kim = {
    name: 'kim',
    first: 10,
    second: 20,
    third: 30,
    sum: function () {
        return this.first + this.second + this.third;
    }
}

let lee = {
    name: 'lee',
    first: 10,
    second: 10,
    third: 10,
    sum: function () {
        return this.first + this.second + this.third;
    }
}

console.log(kim.sum());
console.log(lee.sum());



function person() {
    this.name = 'kim';
    this.first = 10;
    this.second = 20;
    this.third = 30;
    this.sum = function () {
        return this.first + this.second + this.third;
    }
}

console.log(person());
console.log(new person());








let d1 = new Date('2021-04-04');
console.log(d1.getFullYear());
console.log(d1.getMonth());

let d2 = new Date('1998-11-24');
console.log(d2.getFullYear());
console.log(d2.getMonth());

console.log(Date);
