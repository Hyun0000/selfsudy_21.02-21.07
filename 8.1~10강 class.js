class person {
    constructor(name, first, second, third) {
        this.name = name;
        this.first = first;
        this.second = second;
        this.third = third;
    }
    sum = function () {
        return 'prototype : ' + (this.first + this.second + this.third);
    }
}

let kim = new person('kim', 10, 20, 30);
kim.sum = function () {
    return 'this : ' + (this.first + this.second + this.third);
}
let lee = new person('lee', 10, 10, 10);
console.log(kim.sum());
console.log(lee.sum());




