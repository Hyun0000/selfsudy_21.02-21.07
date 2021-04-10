class person {
    constructor(name, first, second) {
        this.name = name;
        this.first = first;
        this.second = second;
    }
    sum() {
        return 'this : ' + (this.first + this.second);
    }
}

class personplus extends person {
    avr() {
        return 'prototype : ' + (this.first + this.second) / 2;
    }
}

let kim = new personplus('kim', 10, 20);
console.log(kim.sum());
console.log(kim.avr());




