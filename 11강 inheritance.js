class person {
    constructor(name, first, second) {
        this.name = name;
        this.first = first;
        this.second = second;
    }
    sum = function () {
        return 'this : ' + (this.first + this.second);
    }
}

class personplus extends person {
    constructor(name, first, second, third) {
        this.name = name;
        this.first = first;
        this.second = second;
        this.third = third;
    }
    sum = function () {
        return 'this : ' + (this.first + this.second + this.third);
    }
    avr = function () {
        return 'prototype : ' + (this.first + this.second + this.third) / 3;
    }
}

let kim = new personplus('kim', 10, 20, 30);
console.log(kim.sum());
console.log(kim.avr());




